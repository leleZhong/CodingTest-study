import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        br.readLine();
        char[] arr = br.readLine().toCharArray();

        char[] p = new char[2 * N + 1];
        for (int i = 0; i < p.length; i++) {
            if (i % 2 == 0) {
                p[i] = 'I';
            } else {
                p[i] = 'O';
            }
        }

        int cnt = 0;
        for (int i = 0; i < arr.length - p.length + 1; i++) {
            boolean valid = true;
            for (int j = 0; j < p.length; j++) {
                if (arr[i + j] != p[j]) {
                    valid = false;
                    break;
                }
            }

            if (valid) {
                cnt++;
            }
        }

        System.out.print(cnt);
    }
}