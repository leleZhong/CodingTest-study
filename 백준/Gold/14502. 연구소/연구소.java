import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    static int N, M;
    static int[][] arr;
    static boolean[][] visited;
    static ArrayList<int[]> viruses;
    static int cnt;
    static int max = 0;

    static int[] dx = { 1, -1, 0, 0 };
    static int[] dy = { 0, 0, 1, -1 };

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[N][M];
        viruses = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());

                if (arr[i][j] == 2) {
                    viruses.add(new int[] { i, j });
                } else if (arr[i][j] == 0) {
                    cnt++;
                }
            }
        }

        visited = new boolean[N][M];

        choose(0);

        System.out.print(max);
    }

    static void choose(int depth) {
        if (depth == 3) {
            max = Math.max(max, bfs());
            return;
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (!visited[i][j] && arr[i][j] == 0) {
                    arr[i][j] = 1;
                    visited[i][j] = true;
                    choose(depth + 1);
                    arr[i][j] = 0;
                    visited[i][j] = false;
                }
            }
        }
    }

    static int bfs() {
        boolean[][] virus = new boolean[N][M];
        int tmp = cnt - 3;

        ArrayDeque<int[]> q = new ArrayDeque<>();
        for (int[] v : viruses) {
            q.add(new int[] { v[0], v[1] });
        }

        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int x = cur[0];
            int y = cur[1];

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx < 0 || nx >= N || ny < 0 || ny >= M)
                    continue;

                if (!virus[nx][ny] && arr[nx][ny] == 0) {
                    virus[nx][ny] = true;
                    q.add(new int[] { nx, ny });
                    tmp--;
                }
            }
        }

        return tmp;
    }
}