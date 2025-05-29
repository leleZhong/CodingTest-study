import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int newNum = N;
        int cnt = 0;
        while (true) {
            int right = newNum % 10;
            newNum /= 10;
            int left = newNum % 10;
            int sum = right + left;
            int newRight = sum % 10;
            newNum = right * 10 + newRight;

            cnt++;
            if (newNum == N) {
                break;
            }
        }

        System.out.print(cnt);
    }
}