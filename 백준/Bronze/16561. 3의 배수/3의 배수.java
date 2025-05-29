import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int cnt = 0;
        for (int i = 1; i <= n / 3; i++) {
            for (int j = 1; j <= n / 3; j++) {
                for (int k = 1; k <= n / 3; k++) {
                    if ((i + j + k) * 3 == n)
                        cnt++;
                }
            }
        }

        System.out.print(cnt);
    }
}