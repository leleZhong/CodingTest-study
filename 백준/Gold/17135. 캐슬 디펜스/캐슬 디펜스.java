import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

class Main {
    static int N, M, D;
    static int[][] map;
    static int[][] dup;

    static int[] dr = { 0, -1, 0 };
    static int[] dc = { -1, 0, 1 };

    static int[] archers = new int[3];
    static boolean[][] mark;
    static int enemy = 0;
    static int max = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        D = Integer.parseInt(st.nextToken());

        map = new int[N + 1][M];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
                if (map[i][j] == 1) {
                    enemy++;
                }
            }
        }

        mark = new boolean[N][M];

        archer(0, 0);

        System.out.println(max);
    }

    static void archer(int idx, int sel) {
        if (sel == 3) {
            dup = new int[N][M];
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    dup[i][j] = map[i][j];
                }
            }
            max = Math.max(max, fight(archers));
            return;
        }
        if (idx == M)
            return;
        archers[sel] = idx;
        archer(idx + 1, sel + 1);
        archers[sel] = 0;
        archer(idx + 1, sel);
    }

    static int fight(int[] archers) {
        int cnt = 0;
        int remain = enemy;
        while (remain > 0) {
            for (int i = 0; i < 3; i++) {
                int[] tmp = findTarget(archers[i]);
                if (tmp != null) {
                    mark[tmp[0]][tmp[1]] = true;
                }
            }

            for (int i = N - 1; i >= 0; i--) {
                for (int j = 0; j < M; j++) {
                    if (mark[i][j]) {
                        mark[i][j] = false;
                        dup[i][j] = 0;
                        remain--;
                        cnt++;
                    }

                    if (dup[i][j] == 1) {
                        dup[i][j] = 0;
                        if (i + 1 != N) {
                            dup[i + 1][j] = 1;
                        } else {
                            remain--;
                        }
                    }
                }
            }
        }
        return cnt;
    }

    static int[] findTarget(int archerC) {
        ArrayDeque<int[]> q = new ArrayDeque<>();
        boolean[][] visited = new boolean[N][M];
        q.add(new int[] { N - 1, archerC, 1 });
        visited[N - 1][archerC] = true;

        while (!q.isEmpty()) {
            int[] tmp = q.poll();
            int r = tmp[0];
            int c = tmp[1];
            int d = tmp[2];

            if (d > D) continue;
            if (dup[r][c] == 1) {
                return new int[] { r, c };
            }

            for (int i = 0; i < 3; i++) {
                int nr = r + dr[i];
                int nc = c + dc[i];
                if (nr < 0 || nc < 0 || nc >= M || visited[nr][nc]) continue;
                q.add(new int[] { nr, nc, d + 1 });
                visited[nr][nc] = true;
            }
        }
        return null;
    }
}