import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] arr = br.readLine().toUpperCase().toCharArray();

        int[] alphabet = new int[26];
        for (int i = 0; i < arr.length; i++) {
            alphabet[arr[i] - 'A']++;
        }

        int max = 0;
        int idx = 0;
        for (int i = 0; i < 26; i++) {
            if (max < alphabet[i]) {
                max = alphabet[i];
                idx = i;
            }
        }

        for (int i = 0; i < 26; i++) {
            if (max == alphabet[i] && idx != i) {
                System.out.print("?");
                return;
            }
        }

        System.out.print((char) (idx + 'A'));
    }
}