import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int min = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        dfs(N, 0);
        System.out.print(min);
    }

    static void dfs(int num, int cnt) {
        if (min <= cnt) return;

        if (num == 1) {
            min = Math.min(min, cnt);
            return;
        }

        if (num % 3 == 0) {
            dfs(num / 3, cnt + 1);
        }
        if (num % 2 == 0) {
            dfs(num / 2, cnt + 1);
        }
        dfs(num - 1, cnt + 1);
    }
}