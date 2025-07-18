import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[26];
        Arrays.fill(arr, -1);
        char[] S = br.readLine().toCharArray();
        for (int i = 0; i < S.length; i++) {
            if (arr[S[i] - 'a'] == -1) {
                arr[S[i] - 'a'] = i;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i : arr) {
            sb.append(i).append(" ");
        }

        System.out.print(sb);
    }
}