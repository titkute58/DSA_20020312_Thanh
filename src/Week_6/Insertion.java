import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdArrayIO;

import java.util.Arrays;
import java.util.Scanner;

public class Insertion {
    public static void main(String[] args) {
        In in = new In("D:\\Coursera\\algs4-data\\32Kints.txt"); // tạo luồng đọc từ file
        int[] a = in.readAllInts();  // đọc toàn bộ file vào mảng a
        /*
        int[] a = new int[32000];
        for(int i = 0;i < 32000;i++){
            a[i] = (int) Math.round(Math.random() * 32000);
        }
         */

        /*
        Arrays.sort(a); // For third test
        int[] b = new int[32001];
        for(int i = 0;i < a.length;i++){
            b[i] = a[a.length-i-1];
        }
         */

        Arrays.fill(a, 1512);
        long start = System.currentTimeMillis();
        for(int i = 1; i < a.length; i++){
            int value = a[i];
            int j = i - 1;
            while(j >= 0 && a[j] > value){
                a[j + 1] = a[j];
                j = j - 1;
            }
            a[j + 1] = value;
        }
        long end = System.currentTimeMillis();  // thời gian chạy bằng end - start
        StdArrayIO.print(a); // in mảng ra màn hình
        System.out.println(end - start);

    }
}

/** 1. TXT ~ 120ms.
    2. Random ~ 116.4ms.
    3. Constant time.
    4. ~215.
    5. Constant time. ms*/