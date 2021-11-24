package Week_11;

import java.util.Arrays;
import java.util.Scanner;

public class MissingNumber_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0;i < n;i++) {
            a[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        int[] b = new int[m];
        for(int i = 0;i < m;i++) {
            b[i] = sc.nextInt();
        }
        int[] arr = new int[10001];
        int[] brr = new int[10001];
        Arrays.fill(arr, 0);
        Arrays.fill(brr, 0);
        for(int i = 0;i < n;i++) {
            arr[a[i]]++;
        }
        for(int i = 0;i < m;i++) {
            brr[b[i]]++;
        }
        for(int i = 1;i < 10001;i++){
            if(arr[i] < brr[i]){
                System.out.print(i + " ");
            }
        }
    }
}
