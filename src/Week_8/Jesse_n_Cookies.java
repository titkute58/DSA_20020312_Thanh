import java.util.PriorityQueue;
import java.util.Scanner;

public class Jesse_n_Cookies {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        PriorityQueue <Integer> pqueue = new PriorityQueue(n);
        for (int i = 0; i < n; i++) {
            pqueue.add(sc.nextInt());
        }
        int count = 0;
        while(pqueue.peek() < k && pqueue.size() > 1) {
            int a = pqueue.remove();
            int b = pqueue.remove();
            pqueue.add(a + b*2);
            count++;
        }
        if(pqueue.peek() >= k) {
            System.out.println(count);
        }else System.out.println(-1);
    }
}
