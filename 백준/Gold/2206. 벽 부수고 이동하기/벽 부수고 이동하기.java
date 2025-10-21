import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        char[][] map = new char[N][M];
        for (int i = 0; i < N; i++) {
            map[i] = br.readLine().toCharArray();
        }

        ArrayDeque<int[]> queue = new ArrayDeque<>();
        boolean[][][] visited = new boolean[2][N][M];
        queue.add(new int[] { 0, 0, 0 }); // x, y, 벽 파괴 유무
        visited[0][0][0] = true;

        int[] dx = { -1, 1, 0, 0 };
        int[] dy = { 0, 0, -1, 1 };

        int cnt = 1;
        while (!queue.isEmpty()) {
            int size = queue.size();
            while (size-- > 0) {
                int[] cur = queue.poll();
                int x = cur[0];
                int y = cur[1];
                int des = cur[2];

                if (x == N - 1 && y == M - 1) {
                    System.out.println(cnt);
                    return;
                }

                for (int i = 0; i < 4; i++) {
                    int nx = x + dx[i];
                    int ny = y + dy[i];

                    if (nx < 0 || nx >= N || ny < 0 || ny >= M) {
                        continue;
                    }

                    if (!visited[des][nx][ny]) {
                        if (map[nx][ny] == '0') {
                            visited[des][nx][ny] = true;
                            queue.add(new int[] { nx, ny, des });
                        } else if (map[nx][ny] == '1' && des == 0) {
                            visited[1][nx][ny] = true;
                            queue.add(new int[] { nx, ny, 1 });
                        }
                    }
                }
            }
            cnt++;
        }

        System.out.println(-1);
    }
}