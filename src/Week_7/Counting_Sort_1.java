import edu.princeton.cs.algs4.StdOut;

import java.util.Scanner;

public class Counting_Sort_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0;i < n;i++){
            a[i] = sc.nextInt();
        }
        int[] count = new int[100];
        for(int i = 0;i < n;i++){
            count[a[i]]++;
        }
        int j = 0;
        for(int i = 0;i < n;i++){
            j++;
            System.out.print(count[i] + " ");
            if(j == 9){
                j -= 9;
                System.out.println();
            }
        }
    }
}
