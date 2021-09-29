package HomeWork.Week_3;
import edu.princeton.cs.algs4.In;
public class ThreeSum_Brute {
    public static void main(String[] args) {
        In in = new In("D:\\Effing Java\\algs4-data\\8Kints.txt");
        int[] a = in.readAllInts();
        for(int i = 0;i < a.length-1;i++){
            for(int j = i + 1;j < a.length;j++){
                for(int k = j + 1;k < a.length;k++){
                    if(a[i] + a[j] + a[k] == 0){
                        System.out.println(a[i] + " " + a[j] + " " + a[k]); //Alternative: using binary search
                    }
                }
            }
        }
    }
}
