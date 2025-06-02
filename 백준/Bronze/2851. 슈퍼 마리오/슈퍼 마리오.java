import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] mush = new int[10];
        for (int i = 0; i < 10; i++) {
            mush[i] = Integer.parseInt(br.readLine());
        }

        int[] s = new int[10];
        s[0] = mush[0];
        int ans = 0;
        for (int i = 1; i < 10; i++) {
            s[i] = s[i - 1] + mush[i];

            int left = Math.abs(s[i - 1] - 100);
            int right = Math.abs(s[i] - 100);
            if (left < right) {
                ans = s[i - 1];
                break;
            } else if (left == right) {
                ans = s[i];
                break;
            }

            ans = s[i];
        }

        System.out.print(ans);
    }
}