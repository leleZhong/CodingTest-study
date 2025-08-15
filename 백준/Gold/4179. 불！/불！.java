import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int R = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        char[][] arr = new char[R][C];

        ArrayDeque<int[]> jQ = new ArrayDeque<>();
        ArrayDeque<int[]> fQ = new ArrayDeque<>();
        int[][] visited = new int[R][C];
        for (int i = 0; i < R; i++) {
            arr[i] = br.readLine().toCharArray();
            for (int j = 0; j < C; j++) {
                if (arr[i][j] == 'J') {
                    jQ.add(new int[] { i, j });
                    visited[i][j] = 1;
                } else if (arr[i][j] == 'F') {
                    fQ.add(new int[] { i, j });
                    visited[i][j] = 2;
                } else if (arr[i][j] == '#') {
                    visited[i][j] = 3;
                }
            }
        }

        int[] dx = { 1, -1, 0, 0 };
        int[] dy = { 0, 0, 1, -1 };

        int time = 0;
        boolean escape = false;
        while (!jQ.isEmpty()) {
            int sizeF = fQ.size();
            while (sizeF-- > 0) {
                int[] cur = fQ.poll();
                for (int i = 0; i < 4; i++) {
                    int nx = cur[0] + dx[i];
                    int ny = cur[1] + dy[i];
                    if (nx < 0 || nx >= R || ny < 0 || ny >= C) {
                        continue;
                    }

                    if (visited[nx][ny] < 2 && (arr[nx][ny] == '.' || arr[nx][ny] == 'J')) {
                        visited[nx][ny] = 2;
                        fQ.add(new int[] { nx, ny });
                    }
                }
            }

            int sizeJ = jQ.size();
            while (sizeJ-- > 0) {
                int[] cur = jQ.poll();
                if (cur[0] == 0 || cur[0] == R - 1 || cur[1] == 0 || cur[1] == C - 1) {
                    escape = true;
                    break;
                }

                for (int i = 0; i < 4; i++) {
                    int nx = cur[0] + dx[i];
                    int ny = cur[1] + dy[i];
                    if (nx < 0 || nx >= R || ny < 0 || ny >= C) {
                        continue;
                    }

                    if (visited[nx][ny] < 1 && arr[nx][ny] == '.') {
                        visited[nx][ny] = 1;
                        jQ.add(new int[] { nx, ny });
                    }
                }
            }
            time++;

            if (escape) {
                break;
            }
        }

        System.out.print(escape ? time : "IMPOSSIBLE");
    }
}