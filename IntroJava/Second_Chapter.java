
import java.lang.Math;
import java.sql.SQLOutput;
import java.util.Scanner;
public class Second_Chapter {
    public static void main(String[] args) {
        //Cau 1
        /*
        int t, a = 9, b = 6;
        t = a;
        a = b;
        b = t; t = 9 b = 9 a = 6
         */
        //Cau 2
        /*
        double a, b;
        Scanner sc = new Scanner(System.in);
        a = sc.nextDouble();
        b = sc.nextDouble();
        double ans = Math.pow(Math.cos(a),2) + Math.pow(Math.sin(b),2);
        System.out.println(ans);
         */
        //Cau 3
        /*
        boolean a = true, b = false, ans; //da test voi 3 truong hop con lai
        ans = (!(a && b) && (a || b)) || ((a && b) || !(a || b));
        System.out.println(ans); // true
         */
        //Cau 4
        /*
        int a = 6, b = 7;
        boolean ans = (!(a < b) && !(a > b));
        // <=> ((a > b) && (a < b)) = false;
        System.out.println(ans);
        */
        //Cau 5
        /*
        a      b       ans
        1      0        1
        1      1        0
        0      0        0
        0      1        1
         */
        //Cau 6: 10/3 = 3 ma khong phai 3.(3) vi day la phep chia cua 2 integer(so nguyen)
        //Cau 7
        /*
        System.out.println(2 + "bc"); //2bc
        System.out.println(2 + 3 + "bc"); //5bc
        System.out.println((2+3) + "bc"); //5bc
        System.out.println("bc" + (2+3)); //bc5
        System.out.println("bc" + 2 + 3); //bc23
         */
        //Cau 8
        /*
        double ans = Math.sqrt(7);
        System.out.println(ans);
         */
        //Cau 9
        /*
        System.out.println('b'); //b
        System.out.println('b' + 'c'); //197
        System.out.println((char) ('a' + 4));  //e
        */
        //Cau 10
        /*
        int a = Integer.MAX_VALUE;
        System.out.println(a);          //2147483647
        System.out.println(a + 1);     //-2147483648
        System.out.println(2 - a);    //-2147483645
        System.out.println(-2 - a);  //2147483647
        System.out.println(2 * a);  //-2
        System.out.println(4 * a); //-4
         */
        //Cau 11
        /*
        double a = 3.14159;
        System.out.println(a); //3.14159
        System.out.println(a + 1); //4.14159
        System.out.println(8 / (int) a); //2
        System.out.println(8 / a); // 2.5464812403910124
        System.out.println((int) (8 / a)); // 2
         */
        //Cau 12: Loi method
        //Cau 13: false (2.0000000000000004 != 2)
        //Cau 14
        /*
        int a, b;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        if(a == b){
            System.out.println(true);
        }else if(a > b){
            if(a % b == 0) System.out.println(true);
            else System.out.println(false);
        }else{
            if(b % a == 0) System.out.println(true);
            else System.out.println(false);
        }
         */
        //Cau 15
        /*
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        if(a >= (b + c)) System.out.println(true);
        if(b >= (a + c)) System.out.println(true);
        if(c >= (b + a)) System.out.println(true);
         */
        //Cau 16
        /*
        //Gia su G = 6.67 x 10^-11
        double F, G = 6.67 * Math.pow(10,-11), m1 = 50, m2 = 70, r = Math.sqrt(7);
        F = (G*m1*m2)/(r*r); //dang le ra 3.335 x 10^-8 nhung khong theo mong doi vi (r^2 khac 7)
        System.out.println(F);
         */
        //Cau 17
        /*
        int a = 1;
        a = a + a;
        a = a + a;
        a = a + a; // a = 8

        boolean a = true;
        a = !a;
        a = !a;
        a = !a; // a = false

        int a = 2;
        a = a * a;
        a = a * a;
        a = a * a; // a = 256

        System.out.println(a);
         */
        //Cau 18
        /*
        double x, y;
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        y = sc.nextInt();
        System.out.println(Math.sqrt(Math.pow(x,2) + Math.pow(y, 2)));
         */
        //Cau 19
        /*
        int a, b;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println((int)Math.floor(Math.random()*(b-a+1)+a)); // a < b
         */
        //Cau 20
        /*
        int d1, d2;
        d1 = (int)Math.floor(Math.random()*6 + 1);
        d2 = (int)Math.floor(Math.random()*6 + 1);
        System.out.println(d1 + d2);
         */
        //Cau 21
        /*
        double t;
        Scanner sc = new Scanner(System.in);
        t = sc.nextDouble();
        System.out.println(Math.sin(2*t) + Math.sin(3*t)); // goc lay theo rad
         */
        //Cau 22
        /*
        double x0, v0, t, g = 9.800722;
        Scanner sc = new Scanner(System.in);
        x0 = sc.nextDouble();
        v0 = sc.nextDouble();
        t = sc.nextDouble();
        System.out.println(x0 + v0*t + 0.5*g*t*t);
         */
        //Cau 23
        /*
        int m, d;
        Scanner sc = new Scanner(System.in);
        m = sc.nextInt();
        d = sc.nextInt();
        if(m == 3 && d >= 20){
            System.out.println(true);
        }else if(m == 6 && d <= 20){
            System.out.println(true);
        }else if(m > 3 && m < 6){
            System.out.println(true);
        }else System.out.println(false);
         */
        //Cau 24
        /*
        double P, r, t;
        Scanner sc = new Scanner(System.in);
        P = sc.nextDouble();
        r = sc.nextDouble();
        t = sc.nextDouble();
        System.out.println((P*r/12/100)/(1-Math.pow((1+r/12/100), -t*12)));
         */
        //Cau 25
        /*
        Scanner sc = new Scanner(System.in);
        double V = sc.nextDouble();
        double T0 = sc.nextDouble();
        System.out.println(13.12 + 0.6215*T0 - 11.37 * Math.pow(V, 0.16) +Math.pow(V, 0.16) * 0.3965 * T0);
         */
        //Cau 26
        /*
        double x, y, r, theta;
        Scanner sc = new Scanner(System.in);
        x = sc.nextDouble();
        y = sc.nextDouble();
        r = Math.sqrt(x*x + y*y);
        theta = Math.acos(x/r);
        System.out.println(r);
        */
        //Cau 27
        /*
        double u = Math.random(), v = Math.random();
        System.out.println((Math.sin(2 * Math.PI * v))*(Math.sqrt(-2 * Math.log(u))));
        */
        //Cau 28 (Strictly increasing/decreasing)
        /*
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        if(a > b && b > c) System.out.println(true);
        else if(a < b && b < c) System.out.println(true);
        else System.out.println(false);
         */
        //Cau 29
        /*
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt(), m = sc.nextInt(), y = sc.nextInt();
        int y0 = y - (14 - m) / 12;
        int x = y0 + y0/4 - y0/100 + y0/400;
        int m0 = m + 12 * ((14-m)/12) - 2;
        int d0 = (d + x + (31*m0)/12) % 7;
        switch (d0){
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Error");
        }
         */
        //Cau 30
        /*
        double[] a = new double[5];
        double sum = 0, max = -1, min = 1;
        for(int i = 0;i < 5;i++){
            a[i] = Math.random();
            sum += a[i];
        }
        for(int i = 0;i < 5;i++){
            max = Math.max(a[i], max);
            min = Math.min(a[i], min);
        }
        System.out.println(max);
        System.out.println(min);
        System.out.println(sum/5);
         */
        //Cau 31
        /*
        double l0, l, p;
        Scanner sc = new Scanner(System.in);
        l0 = sc.nextDouble();
        l = sc.nextDouble();
        p = sc.nextDouble();
        double x = l - l0;
        double y = 0.5 * Math.log((1+Math.sin(p))/(1-Math.sin(p)));
        System.out.println("(" + x + "," + y + ")");
         */
        //Cau 32
        /*
        double red, green, blue;
        Scanner sc = new Scanner(System.in);
        red = sc.nextInt();
        green = sc.nextInt();
        blue = sc.nextInt();
        double white, cyan, magenta, yellow, black;
        white = Math.max(Math.max(red/255,green/255),blue/255);
        cyan = (white - red / 255) / white;
        magenta = (white - green / 255) / white;
        yellow = (white - blue / 255) / white;
        black = 1 - white;
        System.out.println("Cyan: " + cyan);
        System.out.println("Magenta: " + magenta);
        System.out.println("Yellow: " + yellow);
        System.out.println("Black: " + black);
        */
        //Cau 33
        /*
        double x1, x2, y1, y2;
        Scanner sc = new Scanner(System.in);
        x1 = sc.nextDouble();
        y1 = sc.nextDouble();
        x2 = sc.nextDouble();
        y2 = sc.nextDouble();
        double delta = y1 - y2;
        double p1 = Math.cos(x2) * Math.sin(delta);
        double p2 = Math.cos(x1) * Math.sin(x2) - Math.sin(x1) * Math.cos(x2) * Math.cos(delta);
        double p3 = Math.sin(x1) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2) * Math.cos(delta);
        double distance = 60 * Math.atan2(Math.sqrt(p1*p1 + p2*p2), p3);
        System.out.println("Distance between " + "(" + x1 + "," + y1 + ") and (" + x2 + "," + y2 + ") is: " + distance + " nautical miles");
        */
        //Cau 34
        /*
        Scanner sc = new Scanner(System.in);
        double[] a = new double[3];
        for(int i = 0;i < 3;i++){
            a[i] = sc.nextDouble();
        }
        for(int i = 0;i < 3;i++){
            for(int j = i;j < 3;j++){
                if(a[i] > a[j]){
                    double tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                }
            }
        }
        for(int i = 0;i < 3;i++){
            System.out.print(a[i] + " ");
        }
        */
        //Cau 35

    }
}
