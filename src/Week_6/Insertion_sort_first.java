import java.util.Scanner;

public class Insertion_sort_first {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0;i < n;i++){
            a[i] = sc.nextInt();
        }
        int temp = a[n-1];
        for(int i = n-1;i >= 0;i--){
            if(a[i-1] > temp){
                a[i] = a[i-1];
                for(int j = 0;j < n;j++){
                    System.out.print(a[j] + " ");
                }
            }else{
                a[i] = temp;
                for(int j = 0;j < n;j++){
                    System.out.print(a[j] + " ");
                }
                break;
            }
            System.out.println();
        }
    }
}
