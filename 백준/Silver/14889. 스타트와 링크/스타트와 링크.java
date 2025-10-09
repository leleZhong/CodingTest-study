import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    static int N;
    static int[][] arr;
    static boolean[] selected;
    static int min = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        arr = new int[N][N];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        selected = new boolean[N];
        recur(0,0);

        System.out.println(min);
    }

    static void recur(int depth, int select) {
        if (select > N / 2) return;
        
        if (depth == N) {
            if (select != N / 2) {
                return;
            }

            int a = 0, b = 0;
            for (int i = 0; i < N; i++) {
                for (int j = i + 1; j < N; j++) {
                    if (selected[i] && selected[j]) {
                        a += arr[i][j] + arr[j][i];
                    } else if (!selected[i] && !selected[j]) {
                        b += arr[i][j] + arr[j][i];
                    }
                }
            }

            min = Math.min(min, Math.abs(a - b));
            return;
        }

        selected[depth] = true;
        recur(depth + 1, select + 1);
        selected[depth] = false;
        recur(depth + 1, select);
    }
}