import java.util.Scanner;

public class Insertion_sort_second {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0;i < n;i++){
            a[i] = sc.nextInt();
        }
        int cp = 0, check;
        for(int i = 1;i < n;i++){
            check = 0;
            for(int j = 0;j < i;j++){
                if(a[i] < a[j]){
                    cp = j;
                    check = 1;
                    break;
                }
            }
            if(check == 1){
                int temp = a[i];
                for(int j = i;j > cp;j--){
                    a[j] = a[j-1];
                }
                a[cp] = temp;
            }
            for(int j = 0;j < n;j++){
                System.out.print(a[j] + " ");
            }
            System.out.println();
        }
    }
}
