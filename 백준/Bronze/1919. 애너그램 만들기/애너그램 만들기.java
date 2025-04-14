import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] a = br.readLine().toCharArray();
        char[] b = br.readLine().toCharArray();

        int[] aCnt = new int[26];
        int[] bCnt = new int[26];

        for (int i = 0; i < a.length; i++) {
            aCnt[a[i] - 'a']++;
        }

        for (int i = 0; i < b.length; i++) {
            bCnt[b[i] - 'a']++;
        }

        int result = 0;
        for (int i = 0; i < 26; i++) {
            result += Math.abs(aCnt[i] - bCnt[i]);
        }

        System.out.print(result);
    }
}