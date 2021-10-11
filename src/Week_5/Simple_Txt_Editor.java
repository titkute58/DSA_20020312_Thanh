import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Simple_Txt_Editor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Stack <String> store = new Stack<>();
        String s = "";
        store.push(s);
        for(int a0 = 0;a0 < n;a0++){
            int cmd = sc.nextInt();
            int k;
            if(cmd == 1) {
                String input = sc.next();
                s = s + input;
                store.push(input);
            }else if(cmd == 2) {
                k = sc.nextInt();
                s = s.substring(0,s.length() - k);
                store.push(s);
            }else if(cmd == 3) {
                k = sc.nextInt();
                System.out.println(s.charAt(k - 1));
            }else {
                store.pop();
                s = store.peek();
            }
        }
    }
}