import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        String b = br.readLine();

        int[] aCnt = new int[26];
        int[] bCnt = new int[26];

        for (int i = 0; i < a.length(); i++) {
            aCnt[a.charAt(i) - 'a']++;
        }

        for (int i = 0; i < b.length(); i++) {
            bCnt[b.charAt(i) - 'a']++;
        }

        int result = 0;
        for (int i = 0; i < 26; i++) {
            result += Math.abs(aCnt[i] - bCnt[i]);
        }

        System.out.print(result);
    }
}