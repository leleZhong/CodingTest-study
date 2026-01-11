import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

class Main {
    static int N, M;
    static int[][] map;

    static int[] dx = { 1, -1, 0, 0 };
    static int[] dy = { 0, 0, 1, -1 };

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        map = new int[N][M];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        st = new StringTokenizer(br.readLine());
        int sr = Integer.parseInt(st.nextToken()) - 1;
        int sc = Integer.parseInt(st.nextToken()) - 1;

        st = new StringTokenizer(br.readLine());
        int er = Integer.parseInt(st.nextToken()) - 1;
        int ec = Integer.parseInt(st.nextToken()) - 1;

        ArrayList<int[]> sList = bfs(sr, sc);
        ArrayList<int[]> eList = bfs(er, ec);

        boolean[][] isTarget = new boolean[N][M];
        for (int[] pos : eList) {
            isTarget[pos[0]][pos[1]] = true;
        }

        ArrayDeque<int[]> q = new ArrayDeque<>();
        int[][] dist = new int[N][M];
        for (int i = 0; i < N; i++) {
            Arrays.fill(dist[i], -1);
        }

        for (int[] pos : sList) {
            q.offer(new int[] { pos[0] , pos[1] });
            dist[pos[0]][pos[1]] = 0;
        }

        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int x = cur[0], y = cur[1];

            if (isTarget[x][y]) {
                System.out.println(dist[x][y]);
                return;
            }

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx < 0 || nx >= N || ny < 0 || ny >= M) continue;

                if (dist[nx][ny] == -1) {
                    dist[nx][ny] = dist[x][y] + 1;
                    q.offer(new int[] { nx, ny });
                }
            }
        }
    }

    static ArrayList<int[]> bfs(int r, int c) {
        ArrayList<int[]> list = new ArrayList<>();

        ArrayDeque<int[]> q = new ArrayDeque<>();
        boolean[][] visited = new boolean[N][M];
        q.offer(new int[] { r, c });
        visited[r][c] = true;

        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int x = cur[0], y = cur[1];
            list.add(new int[] { x, y });

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx < 0 || nx >= N || ny < 0 || ny >= M) continue;

                if (map[nx][ny] == 1 && !visited[nx][ny]) {
                    visited[nx][ny] = true;
                    q.offer(new int[] { nx, ny });
                }
            }
        }

        return list;
    }
}