import java.util.Scanner;

public class Quicksort_Partition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0;i < n;i++){
            a[i] = sc.nextInt();
        }
        int temp = a[0];
        int[] b = new int[1000];
        int[] c = new int[1000];
        int l = 0,k=0;
        for(int i = 0;i < n;i++){
            if(a[i] < temp){
                b[l++] = a[i];
            }
        }
        for(int i = 0;i < n;i++){
            if(a[i] > temp){
                c[k++] = a[i];
            }
        }
        for(int i = 0;i < l;i++){
            System.out.print(b[i] + " ");
        }
        System.out.print(temp + " ");
        for(int i = 0;i < k;i++){
            System.out.print(c[i] + " ");
        }
    }
}
