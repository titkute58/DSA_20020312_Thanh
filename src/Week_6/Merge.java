import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdArrayIO;

import java.util.Arrays;

public class Merge {

    /** Mergesort by Geeksforgeeks */
    void merge(int arr[], int l, int m, int r)
    {
        // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;

        /* Create temp arrays */
        int L[] = new int[n1];
        int R[] = new int[n2];

        /*Copy data to temp arrays*/
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];

        /* Merge the temp arrays */

        // Initial indexes of first and second subarrays
        int i = 0, j = 0;

        // Initial index of merged subarray array
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        /* Copy remaining elements of L[] if any */
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        /* Copy remaining elements of R[] if any */
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    // Main function that sorts arr[l..r] using
    // merge()
    void sort(int arr[], int l, int r) {
        if (l < r) {
            // Find the middle point
            int m = l + (r - l) / 2;

            // Sort first and second halves
            sort(arr, l, m);
            sort(arr, m + 1, r);

            // Merge the sorted halves
            merge(arr, l, m, r);
        }
    }

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
        //Arrays.fill(a, 1512);

        Merge ob = new Merge();
        long start = System.currentTimeMillis();
        ob.sort(a, 0, a.length-1);
        long end = System.currentTimeMillis();  // thời gian chạy bằng end - start
        StdArrayIO.print(a); // in mảng ra màn hình
        System.out.println(end - start);
    }
}
