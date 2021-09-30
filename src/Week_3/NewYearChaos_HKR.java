
import java.util.Scanner;

public class NewYearChaos_HKR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int a0 = 0;a0 < t;a0++){
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int i = 0;i < n;i++){
                a[i] = sc.nextInt();
            }
            int ans = 0, flag = 1;
            for(int i = n-1;i >= 0;i--){
                if(a[i] - (i + 1) > 2){
                    System.out.println("Too chaotic");
                    flag = 0;
                    break;
                }
                for(int j = Math.max(0, a[i] - 2);j < i;j++){
                    if(a[j] > a[i]) ans++;
                }
            }
            if(flag == 1) {
                System.out.println(ans);
            }
        }
    }
}
