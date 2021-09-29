
import java.util.Scanner;
public class SherlockandArrays_HKR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int a0 = 0;a0 < t;a0++){
            int n = sc.nextInt();
            int[] a = new int[n];
            int left_sum = 0, right_sum = 0;
            for(int i = 0;i < n;i++){
                a[i] = sc.nextInt();
                right_sum += a[i];
            }
            right_sum -= a[0];
            int zero_count = 0;
            for(int i = 0;i < n;i++){
                if(a[i] != 0) zero_count++;
            }
            if(zero_count == 0 || zero_count == 1) {
                System.out.println("YES");
                continue;
            }
            boolean flag = false;
            for(int i = 1;i < n;i++){
                if(left_sum == right_sum){
                    flag = true;
                }
                left_sum += a[i-1];
                right_sum -= a[i];
            }
            if(flag == true) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
