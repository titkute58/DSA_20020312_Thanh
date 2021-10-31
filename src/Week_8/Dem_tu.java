import java.util.Locale;
import java.util.Scanner;

public class Dem_tu {
    public static void main(String[] args) {
        int[] count = new int[26];
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            String s = sc.next();
            s = s.toLowerCase(Locale.ROOT);
            for(int i = 0;i < s.length();i++) {
                count[s.charAt(i) - 'a']++;
            }
        }
        char c = 'a';
        for(int i = 0;i < 26;i++) {
            System.out.println(c + ": " + count[i]);
            c++;
        }
    }
}
