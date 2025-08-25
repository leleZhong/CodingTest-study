import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int cnt = 0;
        for (int i = 1; i <= N; i++) {
            cnt++;

            if (i != N) {
                String tmp = String.valueOf(i);
                if (tmp.contains("50")) {
                    cnt++;
                }
            }
        }

        System.out.print(cnt);
    }
}