

import java.util.Scanner;
import java.util.Arrays;

public class ClosestNumbers_HKR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int[] a = new int [n];
        for(int i = 0;i < n;i++){
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        int min = Integer.MAX_VALUE;
        for(int i = 0;i < n-1;i++){
                if(Math.abs(a[i] - a[i+1]) < min)
                    min = Math.abs(a[i] - a[i+1]);
        }
        for(int i = 0;i < n-1;i++){
            if(Math.abs(a[i] - a[i+1]) == min) System.out.print(a[i] + " " + a[i+1] + " ");
        }
    }
}
