import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static boolean[] com;
    static boolean[][] arr;
    static int cnt = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());

        arr = new boolean[N + 1][N + 1];
        for (int i = 0; i < M; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            arr[a][b] = true;
            arr[b][a] = true;
        }

        com = new boolean[N + 1];
        com[1] = true;
        dfs(1);

        System.out.print(cnt);
    }

    static void dfs(int num) {
        for (int i = 1; i < com.length; i++) {
            if (arr[num][i] && !com[i]) {
                com[i] = true;
                cnt++;
                dfs(i);
            }
        }
    }
}