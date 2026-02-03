import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

class Main {
    static int w, h;
    static int[][] map;

    static StringBuilder sb = new StringBuilder();
    static boolean[][] visited;

    static int[] dr = { -1, -1, -1, 0, 0, 1, 1, 1 };
    static int[] dc = { -1, 0, 1, -1, 1, -1, 0, 1 };

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;

        while (!(s = br.readLine()).equals("0 0")) {
            StringTokenizer st = new StringTokenizer(s);
            w = Integer.parseInt(st.nextToken());
            h = Integer.parseInt(st.nextToken());
            map = new int[h][w];
            for (int i = 0; i < h; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < w; j++) {
                    map[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            visited = new boolean[h][w];
            int cnt = 0;
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    if (map[i][j] == 1 && !visited[i][j]) {
                        cnt++;
                        bfs(i, j);
                    }
                }
            }
            sb.append(cnt).append("\n");
        }
        System.out.println(sb);
    }

    static void bfs(int r, int c) {
        ArrayDeque<int[]> q = new ArrayDeque<>();
        visited[r][c] = true;
        q.offer(new int[] { r, c });

        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int curR = cur[0];
            int curC = cur[1];
            for (int i = 0; i < 8; i++) {
                int nr = curR + dr[i];
                int nc = curC + dc[i];
                if (nr < 0 || nr >= h || nc < 0 || nc >= w) continue;

                if (map[nr][nc] == 1 && !visited[nr][nc]) {
                    visited[nr][nc] = true;
                    q.offer(new int[] { nr, nc });
                }
            }
        }
    }
}