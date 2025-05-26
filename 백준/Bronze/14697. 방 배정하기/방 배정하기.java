import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        boolean isPossible = false;
        for (int i = 0; i <= N / C; i++) {
            for (int j = 0; j <= N / B; j++) {
                for (int k = 0; k <= N / A; k++) {
                    int tmp = i * C + j * B + k * A;
                    if (tmp == N) {
                        isPossible = true;
                        break;
                    }
                }
                if (isPossible)
                    break;
            }
            if (isPossible)
                break;
        }

        System.out.print(isPossible ? 1 : 0);
    }
}