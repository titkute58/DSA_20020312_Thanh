package HomeWork.Week_3;
import java.util.Scanner;

public class NewYearChaos_ex {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int a0 = 0;a0 < t;a0++) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            int ans = 0;
            boolean flag = true;
            for(int i = n-1;i >= 0;i--){
                if(a[i] - (i+1) > 2){
                    flag = false;
                    break;
                }
            }
            if(flag == false){
                System.out.println("Too chaotic");
                continue;
            }
            for(int i = 0;i < n;i++){
                for(int j = 0;j < n-1;j++){
                    if(a[j] > a[j+1]){
                        ans++;
                        int tmp = a[j];
                        a[j] = a[j+1];
                        a[j+1] = tmp;
                    }
                }
            }
            System.out.println(ans);
        }
    }
}