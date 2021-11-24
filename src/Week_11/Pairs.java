package Week_11;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;



public class Pairs {
    public static int pairs(int k, int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<arr.length;i++) set.add(arr[i]);
        int ans = 0;
        for(int i:set)
            ans+=(set.contains(i+k))?1:0;
        return ans;
    }

    public static void main(String[] args) {
        int n, k;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0;i < n;i++){
            a[i] = sc.nextInt();
        }
        System.out.println(pairs(k, a));
    }
}
