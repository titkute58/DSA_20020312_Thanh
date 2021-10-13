import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Simple_Txt_Editor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = "";
        Stack <String> stack = new Stack<>();
        stack.push(s);
        for(int i = 0; i < n; i++){
            int t = sc.nextInt();
            if(t==1){
                s = s + sc.next();
                stack.push(s);
            }
            else if(t==2){
                s = s.substring(0,s.length()-sc.nextInt());
                stack.push(s);
            }
            else if(t==3){
                System.out.println(s.charAt(sc.nextInt()-1));
            }
            else{
                stack.pop();
                s = stack.peek();
            }
        }
    }
}