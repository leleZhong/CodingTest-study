import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int ans = 0;
        for (int i = 2; i < N; i += 2) {
            for (int j = 1; j < N; j++) {
                for (int k = j + 2; k < N; k++) {
                    if (i + j + k == N)
                        ans++;
                }
            }
        }
        
        System.out.print(ans);
    }
}