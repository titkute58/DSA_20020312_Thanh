import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


public class Balanced_Brackets {
    public static String isBalanced(String s) {
        int n = s.length();
        Stack<Character> stack = new Stack<>();
        if(n % 2 != 0 || n == 0) return "NO";
        for(int i = 0;i < n;i++){
            char c = s.charAt(i);
            if(c == '(' || c == '{' || c == '['){
                stack.push(c);
            }else if(c == ')' || c == '}' || c == ']'){
                if(stack.isEmpty()){
                    return "NO";
                }else{
                    char top = stack.pop();
                    if(top == '(' && c != ')'){
                        return "NO";
                    }else if(top == '{' && c != '}'){
                        return "NO";
                    }else if(top == '[' && c != ']'){
                        return "NO";
                    }
                }
            }
        }
        if(!stack.isEmpty()){
            return "NO";
        }
        return "YES";
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0;i < n;i++) {
            String s = sc.next();
            System.out.println(isBalanced(s));
        }

    }
}
