package HomeWork.Week_3;

import edu.princeton.cs.algs4.In;

import java.util.Arrays;
import java.util.HashSet;

public class ThreeSum_Faster {
    public static void main(String[] args) {
        In in = new In("D:\\Coursera\\algs4-data\\32Kints.txt");
        int[] a = in.readAllInts();
        int ans = 0;
        Arrays.sort(a);
        HashSet <Integer> set = new HashSet<>();
        for(int i = 0;i < a.length;i++){
            set.add(-a[i]);
        }
        for(int i = 1;i < a.length;i++){
            for(int j = i+1;j < a.length;j++){
                if(set.contains(a[j] + a[i])){
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }
}
