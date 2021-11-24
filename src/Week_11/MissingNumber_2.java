package Week_11;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'missingNumbers' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY arr
     *  2. INTEGER_ARRAY brr
     */

    public static List<Integer> missingNumbers(List<Integer> a, List<Integer> b) {
        // Write your code here
        List<Integer> diff = new ArrayList<>();

        HashMap<Integer, Integer> cA = new HashMap<>();
        HashMap<Integer, Integer> cB = new HashMap<>();

        for (int i = 0; i < a.size(); i++) {
            Integer value = a.get(i);
            if (cA.get(value) == null) {
                cA.put(value, 1);
            } else {
                cA.put(value, cA.get(value) + 1);
            }
        }

        for (int i = 0; i < b.size(); i++) {
            Integer value = b.get(i);
            if (cB.get(value) == null) {
                cB.put(value, 1);
            } else {
                cB.put(value, cB.get(value) + 1);
            }
        }

        for (int i = 1; i <= 10000; i++) {
            if (cB.get(i) != null) {
                Integer num = cB.get(i);
                if (cA.get(i) == null || cA.get(i) < num) {
                    diff.add(i);
                }
            }
        }
        return diff;
    }

}

public class MissingNumber_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr.add(arrItem);
        }

        int m = Integer.parseInt(bufferedReader.readLine().trim());

        String[] brrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> brr = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            int brrItem = Integer.parseInt(brrTemp[i]);
            brr.add(brrItem);
        }

        List<Integer> result = Result.missingNumbers(arr, brr);

        for (int i = 0; i < result.size(); i++) {
            bufferedWriter.write(String.valueOf(result.get(i)));

            if (i != result.size() - 1) {
                bufferedWriter.write(" ");
            }
        }

        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
