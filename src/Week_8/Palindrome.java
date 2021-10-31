import java.util.Scanner;

public class Palindrome {
    public static String rev(String s){
        String ans= "";
        for(int i = s.length()-1;i >= 0;i--){
            ans += s.charAt(i);
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        if(s.equals(rev(s))){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
