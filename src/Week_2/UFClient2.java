import edu.princeton.cs.algs4.*;
public class UFClient2 {
    public static void main(String[] args) {
        int N = StdIn.readInt();
        int count = 0;
        boolean flag = false;
        UF uf = new UF(N);
        while (!StdIn.isEmpty()) {
            int p = StdIn.readInt();
            int q = StdIn.readInt();
            if (uf.find(p) != uf.find(q)) {
                uf.union(p, q);
            }
            count++;
            if(uf.count() == 1){
                flag = true;
                break;
            }
        }
        if(flag == true){
            System.out.println(count);
        }else System.out.println("FAILED");
    }
}
