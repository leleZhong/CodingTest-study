import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        for (int i = M; i <= N; i++) {
            if (i == 1) continue;
            boolean valid = true;
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    valid = false;
                    break;
                }
            }
            if (valid)
                sb.append(i).append("\n");
        }

        System.out.print(sb);
    }
}