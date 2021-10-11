import java.util.Scanner;

public class Selection_Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n;i++) {
            a[i] = sc.nextInt();
        }
        int pos = 0;
        for(int i = 0;i < n;i++){
            int cur_min = Integer.MAX_VALUE;
            for(int j = i;j < n;j++){
                if(a[j] < cur_min) {
                    cur_min = a[j];
                    pos = j;
                }
            }
            int tmp = a[i];
            a[i] = a[pos];
            a[pos] = tmp;
        }
        for(int i = 0;i < n;i++){
            System.out.print(a[i] + " ");
        }
    }
}
