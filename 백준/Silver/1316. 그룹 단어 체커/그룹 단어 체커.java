import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int cnt = 0;
        while (N-- > 0) {
            char[] arr = br.readLine().toCharArray();
            boolean[] alphabet = new boolean[26];

            boolean valid = true;
            for (int i = 0; i < arr.length - 1; i++) {
                if (!alphabet[arr[i] - 'a']) {
                    if (arr[i] != arr[i + 1]) {
                        alphabet[arr[i] - 'a'] = true;
                    }
                } else {
                    valid = false;
                    break;
                }
            }

            if (alphabet[arr[arr.length - 1] - 'a']) {
                valid = false;
            }

            if (valid) {
                cnt++;
            }
        }

        System.out.print(cnt);
    }
}