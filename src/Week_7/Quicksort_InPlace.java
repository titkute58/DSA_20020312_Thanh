import java.util.Scanner;

public class Quicksort_InPlace {
    public static int partition(int a[],int lo,int hi)
    {
        int pos = lo;
        for(int i = lo; i < hi;i++) {
            if (a[i] < a[hi]) {
                int tmp = a[pos];
                a[pos] = a[i];
                a[i] = tmp;
                pos++;
            }
        }
        int temp = a[pos];
        a[pos] = a[hi];
        a[hi] = temp;
        return pos;
    }

    public static void QS(int a[],int lo,int hi,int n)
    {
        if(lo < hi)
        {
            int p = partition(a,lo,hi);
            for(int i = 0;i < n;i++) {
                System.out.print(a[i] + " ");
            }
            System.out.println();
            QS(a,lo,p-1,n);
            QS(a,p+1,hi,n);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0;i < n;i++){
            a[i] = sc.nextInt();
        }
        QS(a, 0, n-1, n);
    }
}
