import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class MyTextEditor {
    public static Stack<Object> history = new Stack<>();
    public static Stack<Character> text = new Stack<>();
    public static void append(String str) {
        for (int i = 0; i < str.length(); i++) {
            text.push(str.charAt(i));
        }
        history.push(str.length());
    }
    public static void delete(int k) {
        Stack<Character> undo = new Stack<>();
        for(int i = 0; i < k; i++) {
            undo.add(text.pop());
        }
        history.add(undo);
    }
    public static char get(int k) {
        return text.get(k - 1);
    }
    public static void undo() {
        Object o = history.pop();
        if (o instanceof Integer) {
            for(int i = 0; i < (Integer) o; i++) {
                text.pop();
            }
        } else {
            Stack<Character> undo = (Stack<Character>) o;
            while (!undo.isEmpty()) {
                text.add(undo.pop());
            }
        }
    }
}

public class Simple_Txt_Editor_by_CDC {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0;i < n;i++){
            int k = sc.nextInt();
            int t;
            if(k == 1) {
                String str = sc.next();
                MyTextEditor.append(str);
            }else if(k == 2) {
                t = sc.nextInt();
                MyTextEditor.delete(t);
            }else if(k == 3) {
                t = sc.nextInt();
                System.out.println(MyTextEditor.get(t));
            }else {
                MyTextEditor.undo();
            }
        }

    }
}
