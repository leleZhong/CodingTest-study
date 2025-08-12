import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class Main {
    static int N;
    static char[][] arr;
    static boolean[][] visited;
    static int[] dx = { 0, 1, -1, 0 };
    static int[] dy = { 1, 0, 0, -1 };

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        arr = new char[N][N];
        for (int i = 0; i < N; i++) {
            arr[i] = br.readLine().toCharArray();
        }

        visited = new boolean[N][N];
        int cnt1 = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (!visited[i][j]) {
                    bfs(i, j, arr[i][j], false);
                    cnt1++;
                }
            }
        }

        visited = new boolean[N][N];
        int cnt2 = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (!visited[i][j]) {
                    bfs(i, j, arr[i][j], true);
                    cnt2++;
                }
            }
        }

        System.out.print(cnt1 + " " + cnt2);
    }

    static void bfs(int x, int y, char color, boolean flag) {
        ArrayDeque<int[]> q = new ArrayDeque<>();

        visited[x][y] = true;
        q.add(new int[] { x, y });

        while (!q.isEmpty()) {
            int cur[] = q.poll();
            int curX = cur[0];
            int curY = cur[1];
            for (int i = 0; i < 4; i++) {
                int nx = curX + dx[i];
                int ny = curY + dy[i];

                if (nx >= 0 && nx < N && ny >= 0 && ny < N) {
                    if (flag) {
                        if (!visited[nx][ny]
                                && (color == 'B' ? arr[nx][ny] == color : (arr[nx][ny] == 'R' || arr[nx][ny] == 'G'))) {
                            visited[nx][ny] = true;
                            q.add(new int[] { nx, ny });
                        }
                    } else {
                        if (!visited[nx][ny] && arr[nx][ny] == color) {
                            visited[nx][ny] = true;
                            q.add(new int[] { nx, ny });
                        }
                    }
                }
            }
        }
    }
}