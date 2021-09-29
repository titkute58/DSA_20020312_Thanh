
import edu.princeton.cs.algs4.In;
public class Two_Sum {
    public static void main(String[] args) {
        In in = new In("D:\\Effing Java\\algs4-data\\4Kints.txt");
        int[] a = in.readAllInts();
        for(int i = 0;i < a.length - 1;i++){
            for(int j = i + 1;j < a.length;j++){
                if(a[i] + a[j] == 0){
                    System.out.println(a[i] + " " + a[j]); //Alternative: Using binary search
                }else continue;
            }
        }

    }
}
