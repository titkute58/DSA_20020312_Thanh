import java.util.Scanner;

public class Intro_to_TutorialChallenges {
    public static int binarySearch(int a[], int lo, int hi, int x)
    {
        if (lo <= hi ) {
            int mid = lo + (hi - lo) / 2;
            if (a[mid] == x)
                return mid;
            if (a[mid] > x)
                return binarySearch(a, lo, mid - 1, x);
            return binarySearch(a, mid + 1, hi, x);
        }
        return -1;
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
        System.out.println(binarySearch(a,0,n-1,k));
    }
}
