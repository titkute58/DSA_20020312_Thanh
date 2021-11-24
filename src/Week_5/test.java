import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0;i < n;i++){
            a[i] = sc.nextInt();
        }

        for (int i = 1; i < n; i++) {
            for (int j = 1; j < n - 2; j++) {
                if (a[j] > a[j + 1]) {
                    int tmp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = tmp;
                }
            }
        }
        for(int i = 0;i < n;i++){
            System.out.print(a[i] + " ");
        }
    }
}
