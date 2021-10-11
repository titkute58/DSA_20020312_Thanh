import java.util.*;

public class Equal_Stacks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h1 = sc.nextInt();
        int h2 = sc.nextInt();
        int h3 = sc.nextInt();
        int[] a = new int[h1];
        int[] b = new int[h2];
        int[] c = new int[h3];
        Stack <Integer> st1 = new Stack<>();
        Stack <Integer> st2 = new Stack<>();
        Stack <Integer> st3 = new Stack<>();
        int sum1 = 0, sum2 = 0, sum3 = 0;
        for(int i = 0;i < h1;i++){
            a[i] = sc.nextInt();
            sum1 += a[i];
        }
        for(int i = h1-1;i >= 0;i--){
            st1.push(a[i]);
        }
        for(int i = 0;i < h2;i++){
            b[i] = sc.nextInt();
            sum2 += b[i];
        }
        for(int i = h2-1;i >= 0;i--){
            st2.push(b[i]);
        }
        for(int i = 0;i < h3;i++){
            c[i] = sc.nextInt();
            sum3 += c[i];
        }
        for(int i = h3-1;i >= 0;i--){
            st3.push(c[i]);
        }

        while(sum1 != sum2 || sum2 != sum3){
            if(sum1 >= sum2 && sum1 >= sum3){
                sum1 -= st1.peek();
                st1.pop();
            }else if (sum2 >= sum1 && sum2 >= sum3){
                sum2 -= st2.peek();
                st2.pop();
            }else{
                sum3 -= st3.peek();
                st3.pop();
            }
        }
        System.out.println(sum1);
    }
}
