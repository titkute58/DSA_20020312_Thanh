import java.util.Arrays;
import java.util.Scanner;

public class Find_Median {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] count = new int[20001];
        Arrays.fill(count, 0);
        for(int i = 0;i < n;i++){
            a[i] = sc.nextInt();
            if(a[i] < 0){
                count[10000-a[i]]++;
            }else{
                count[a[i]]++;
            }
        }
        int k = 0;
        for(int i = 0;i < 20001;i++){
            int l = count[i];
            if(l != 0) {
                if(i > 10000){
                    while(l > 0){
                        l--;
                        a[k++] = -i;
                    }
                }else{
                    while(l > 0){
                        l--;
                        a[k++] = i;
                    }
                }
            }
        }
        System.out.println(a[n/2]);
    }
}
