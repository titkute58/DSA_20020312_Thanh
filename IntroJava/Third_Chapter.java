
import java.util.Scanner;
import java.lang.Math;
public class Third_Chapter {
    public static void main(String[] args) {
        //Cau 1
        /*
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a == b && b == c){
            System.out.println("Equal");
        }else System.out.println("Not Equal");

         */
        //Cau 2
        /*
        double a, b, c;
        Scanner sc = new Scanner(System.in);
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        double delta = b*b - 4*a*c;
        if(a == 0){
            System.out.println("x = " + (-c/b));
        }else if(delta < 0){
            System.out.println("Error");
        }else {
            double x1 = (-b + Math.sqrt(delta))/(2*a);
            double x2 = (-b - Math.sqrt(delta))/(2*a);
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
        }
        */
        //Cau 3: chua khoi tao bien
        //Cau 4:
        /*
        double x, y;
        Scanner sc = new Scanner(System.in);
        x = sc.nextDouble();
        y = sc.nextDouble();
        if((x < 1 && x > 0) && (y < 1 && y > 0)) System.out.println(true);
        else System.out.println(false);
         */
        //Cau 5: V > 0
        //Cau 6
        /*
        int i, j;
        // for (j = 0; j < 10; j++) j += j; // 15
        // for (i = 0, j = 1; i < 10; i++) j += j; //10 1024
        // for (i = 0, j = 0; i < 10; i++) j += i; // 10 45
        // for (i = 0, j = 0; i < 10; i++) j += j++; //10 0
        System.out.println( " " + j);
         */
        //Cau 7
        /*
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1;i <= n;i++){
            if(i % 10 == 1) System.out.println(i + "st ");
            else if(i % 10 == 2) System.out.println(i + "nd ");
            else if(i % 10 == 3) System.out.println(i + "rd ");
            else System.out.println(i + "th ");
            System.out.println("Hello World!");
        }
         */
        //Cau 8
        /*
        for(int i = 1000;i <= 2000;i++){
            if(i % 5 == 0) System.out.println();
            System.out.print(i + " ");
        }
         */
        //Cau 9
        /*
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] a = new double[n];
        double sum = 0;
        for(int i = 0;i < n;i++){
            a[i] = Math.random();
            sum += a[i];
            System.out.print(a[i] + " ");
        }
        System.out.println();
        System.out.println(sum/n);
         */
        //Cau 10
        /*
        int N = Integer.parseInt(args[0]);
        String ruler = " ";
        for (int i = 1; i <= N; i++){
            ruler = ruler + i + ruler;
            System.out.println(ruler);
        }
        */
        //Cau 11
        /*
        int n = 16;
        for(int i = 0;i < 7;i++){
            System.out.println(Math.log(n)+" "+n+" "+n*Math.log(n)+" "+n*n+" "+n*n*n+" "+Math.pow(2,n));
            n *= 2;
        }
        */
        //Cau 12 n = 0 m = 987654321
        //Cau 13 Bo qua
        //Cau 14 Bo qua
        //Cau 15 d
        //Cau 16
        //Cau 17
        /*
        Scanner sc = new Scanner(System.in);
        double c = sc.nextDouble();
        double k = sc.nextDouble();
        double xP = 8;
        double xK = xP;
        double sum = 1;
        double eps = Math.pow(10,-15);
        while(sum > eps){
            xK = ((k - 1.0)*xP + (double)c/Math.pow(xP, k-1)) / k;
            sum = Math.abs(xP-xK);
            xP = xK;
        }
        System.out.println(xK);
         */
        //Cau 18
        /*
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        int n = sc.nextInt();
        long ans;
        for(int i = 1;i <= n;i++){
            ans = ans * (x/i);
        }
        System.out.println(ans);
        */
        //Cau 19
        /*
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        char[] l = {'A', 'B', 'C', 'D', 'E', 'F'};
        String ans = "";
        while(n != 0){
            int c = n % k;
            if(c > 9 && c < 16){
                ans = l[c-10] + ans;
            }else{
                ans = c + ans;
            }
            n = n / k;
        }
        System.out.println(ans);
         */
        //Cau 20 nhu cau 19 nhung input k = 2
        //Cau 21
        /*
        int stake = Integer.parseInt(args[0]);
        int goal = Integer.parseInt(args[1]);
        int T = Integer.parseInt(args[2]);
        int bets = 0;
        int wins = 0;
        for (int t = 0; t < T; t++) {
            int cash = stake;
            for(int i = 0;i < 10;i = i) {
                if(cash > 0 && cash < goal) {
                    bets++;
                    if (Math.random() < 0.5) cash++;
                    else cash--;
                }else break;
            }
            if (cash == goal) wins++;
        }
        System.out.println(wins + " wins of " + T);
        System.out.println("Percent of games won = " + 100.0 * wins / T);
        System.out.println("Avg # bets = " + 1.0 * bets / T);
         */
        //Cau 22
        /*
        int current_cash = 100;
        int tries = 50;
        for(int i = 0;i < tries;i++){
            if (Math.random() < 0.5) current_cash++;
            else current_cash--;
            System.out.println("Current cash of gambler is: ");
            for(int a = 0;a < current_cash;a++){
                System.out.print("*");
            }
        }
         */
        //Cau 23
        //Cau 24 Them if else vao cau 21
        //Cau 25 Them if else (Luu cac so nguyen to da in vao 1 mang)
        //Cau 26


    }
}
