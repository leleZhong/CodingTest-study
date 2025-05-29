import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int cnt = 0;
        for (int i = 3; i <= n - 6; i += 3) {
            for (int j = 3; j <= n - i - 3; j += 3) {
                int k = n - (i + j);
                if (k % 3 == 0 && k > 0)
                    cnt++;
            }
        }

        System.out.print(cnt);
    }
}