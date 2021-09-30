
import java.util.Scanner;
import java.util.Arrays;
public class Pairs_HKR {
    public static void main(String[] args) {
        int n, k;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0;i < n;i++){
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        int i = 0, j = 1, ans = 0, diff;
        while(j < n){
            diff = a[j] - a[i];
            if(diff == k){
                ans++;
                j++;
            }else if(diff > k){
                i++;
            }else{
                j++;
            }
        }
        System.out.println(ans);
    }
}
