import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int cnt = N < 100 ? N : 99;
        for (int i = 100; i <= N; i++) {
            int num = i;
            int first = num % 10;
            num /= 10;
            int second = num % 10;
            num /= 10;
            int third = num % 10;
            if (num / 10 > 0) break;
            if (first - second == second - third) cnt++;
        }
        System.out.print(cnt);
    }
}