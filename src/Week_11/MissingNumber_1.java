package Week_11;

import java.util.Arrays;
import java.util.Scanner;

public class MissingNumber_1 {
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

        Arrays.sort(a);
        Arrays.sort(b);
        int tmp = 10002;
        int i = 0, j = 0;
        while (i < n && j < m) {
            if (a[i] > b[j]) {
                if(tmp != b[j]) {
                    System.out.print(b[j] + " ");
                }
                tmp = b[j];
                j++;
            }else if(a[i] < b[j]) {
                i++;
            } else {
                i++;
                j++;
            }
        }
        if(i == n && j != m){
            System.out.print(b[j]);
        }
    }
}
