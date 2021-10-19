import edu.princeton.cs.algs4.*;

public class Quick_withShuffle {
        private static int partition(int[] a, int lo, int hi)
        {
            int i = lo, j = hi+1;
            while (true)
            {
                while (less(a[++i], a[lo]))
                    if (i == hi) break;
                while (less(a[lo], a[--j]))
                    if (j == lo) break;

                if (i >= j) break;
                exch(a, i, j);
            }
            exch(a, lo, j);
            return j;
        }

        private static void exch(int[] a, int i, int j) {
            int swap = a[i];
            a[i] = a[j];
            a[j] = swap;
        }

        private static boolean less(Comparable v, Comparable w) {
            if (v == w) return false;
            return v.compareTo(w) < 0;
        }

        public static void sort(int[] a)
        {
            StdRandom.shuffle(a);
            sort(a, 0, a.length - 1);
        }

        private static void sort(int[] a, int lo, int hi)
        {
            if (hi <= lo) return;
            int j = partition(a, lo, hi);
            sort(a, lo, j-1);
            sort(a, j+1, hi);
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
        sort(a);
        long end = System.currentTimeMillis();  // thời gian chạy bằng end - start
        StdArrayIO.print(a); // in mảng ra màn hình
        System.out.println(end - start);
    }
}