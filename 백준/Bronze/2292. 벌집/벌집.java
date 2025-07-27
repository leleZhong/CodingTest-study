import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long N = Long.parseLong(br.readLine());

        int tmp = 1;
        int plus = 6;
        int cnt = 1;
        while (tmp < N) {
            tmp += plus;
            plus += 6;
            cnt++;
        }

        System.out.print(cnt);
    }
}