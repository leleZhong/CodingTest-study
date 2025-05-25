import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String N = br.readLine();
        int F = Integer.parseInt(br.readLine());

        N = N.substring(0, N.length() - 2) + "00";
        int ans = 0;
        long tmp = Integer.parseInt(N);

        while (tmp % F != 0) {
            tmp++;
            ans++;
        }

        System.out.printf("%02d", ans);
    }
}