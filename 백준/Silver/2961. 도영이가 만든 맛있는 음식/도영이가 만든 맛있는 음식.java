import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N;
    static int[][] arr;
    static boolean[] visited;
    static int min = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        arr = new int[N][2];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        visited = new boolean[N];
        recur(0, 1, 0, 0);

        System.out.print(min);
    }

    static void recur(int depth, int sour, int bitter, int select) {
        if (select > 0) {
            min = Math.min(min, Math.abs(sour - bitter));
        }

        if (depth == N) {
            return;
        }

        if (!visited[depth]) {
            visited[depth] = true;
            recur(depth + 1, sour * arr[depth][0], bitter + arr[depth][1], select + 1);
            visited[depth] = false;
        }
        recur(depth + 1, sour, bitter, select);
    }
}