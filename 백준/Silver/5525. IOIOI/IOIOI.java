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
        int tmp = 0;
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i - 1] == 'I' && arr[i] == 'O' && arr[i + 1] == 'I') {
                tmp++;
                i++;
            } else {
                if (tmp >= N) {
                    cnt += tmp - N + 1;
                }
                tmp = 0;
            }
        }

        if (tmp >= N) {
            cnt += tmp - N + 1;
        }

        System.out.print(cnt);
    }
}