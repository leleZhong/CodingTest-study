import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] word = new int[26];
        String s = br.readLine();
        for (int i = 0; i < N; i++) {
            int idx = s.charAt(i) - 'a';
            if (idx >= 0 && idx < 26) {
                word[idx]++;
            }
        }
        Arrays.sort(word);
        System.out.println(word[25]);
    }
}