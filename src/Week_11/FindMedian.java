package Week_11;
import java.util.Scanner;
import java.util.TreeSet;
public class FindMedian {
    static class Node implements Comparable<Node> {
        double data;
        int pos;
        Node(double a, int pos) {
            this.data = a;
            this.pos = pos;
        }

        @Override
        public int compareTo(Node o) {
            if(this.data>o.data) return 1;
            if (this.data<o.data) return -1;
            if(this.data == o.data) {
                if(pos>o.pos) return 1;
                if(pos<o.pos) return -1;
            }
            return 0;
        }
    }
    public static void main(String[] args) {
        TreeSet<Node> ts1 = new TreeSet<>();
        TreeSet<Node> ts2 = new TreeSet<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double a = sc.nextDouble();
        Node k = new Node(a,0);
        ts1.add(k);
        System.out.println(k.data);
        Node mid = k;
        for(int i=1;i<n;i++) {
            double b=sc.nextDouble();
            Node t = ts1.last();
            if(b>t.data) {
                ts2.add(new Node(b,i));
            }
            else ts1.add(new Node(b,i));
            if (ts1.size()>ts2.size()+1) {
                ts2.add(ts1.pollLast());
            }
            if(ts2.size()>ts1.size()) ts1.add(ts2.pollFirst());
            if(i%2!=0) {
                System.out.println((ts1.last().data+ts2.first().data)/2);
            }
            else System.out.println(ts1.last().data);
        }
    }
}