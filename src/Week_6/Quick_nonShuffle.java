import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdArrayIO;

public class Quick_nonShuffle {

    /** Quicksort (non-shuffle) by Geeksforgeeks. */
    static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    /* This function takes last element as pivot, places
       the pivot element at its correct position in sorted
       array, and places all smaller (smaller than pivot)
       to left of pivot and all greater elements to right
       of pivot */
    static int partition(int[] arr, int low, int high)
    {

        // pivot
        int pivot = arr[high];

        // Index of smaller element and
        // indicates the right position
        // of pivot found so far
        int i = (low - 1);

        for(int j = low; j <= high - 1; j++)
        {

            // If current element is smaller
            // than the pivot
            if (arr[j] < pivot)
            {

                // Increment index of
                // smaller element
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return (i + 1);
    }

    /* The main function that implements QuickSort
              arr[] --> Array to be sorted,
              low --> Starting index,
              high --> Ending index
     */
    static void quickSort(int[] arr, int low, int high)
    {
        if (low < high)
        {

            // pi is partitioning index, arr[p]
            // is now at right place
            int pi = partition(arr, low, high);

            // Separately sort elements before
            // partition and after partition
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
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
        long start = System.currentTimeMillis();
        quickSort(a,0,a.length-1);
        long end = System.currentTimeMillis();  // thời gian chạy bằng end - start
        StdArrayIO.print(a); // in mảng ra màn hình
        System.out.println(end - start);
    }
}
