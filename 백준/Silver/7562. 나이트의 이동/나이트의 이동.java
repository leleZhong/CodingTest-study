import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        int[] dx = { -2, -2, -1, -1, 1, 1, 2, 2 };
        int[] dy = { -1, 1, -2, 2, -2, 2, -1, 1 };
        StringBuilder sb = new StringBuilder();
        while (T --> 0) {
            int l = Integer.parseInt(br.readLine());

            StringTokenizer st = new StringTokenizer(br.readLine());
            int curX = Integer.parseInt(st.nextToken());
            int curY = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());
            int finX = Integer.parseInt(st.nextToken());
            int finY = Integer.parseInt(st.nextToken());

            ArrayDeque<int[]> queue = new ArrayDeque<>();
            boolean[][] visited = new boolean[l][l];
            queue.add(new int[] { curX, curY });
            visited[curX][curY] = true;

            int cnt = 0;
            boolean find = false;
            while (!queue.isEmpty()) {
                int size = queue.size();
                while (size --> 0) {
                    int[] cur = queue.poll();
                    int x = cur[0];
                    int y = cur[1];

                    if (x == finX && y == finY) {
                        sb.append(cnt).append("\n");
                        find = true;
                        break;
                    }

                    for (int i = 0; i < 8; i++) {
                        int nx = x + dx[i];
                        int ny = y + dy[i];

                        if (nx < 0 || nx >= l || ny < 0 || ny >= l) continue;

                        if (!visited[nx][ny]) {
                            visited[nx][ny] = true;
                            queue.add(new int[] { nx, ny });
                        }
                    }
                }
                cnt++;

                if (find) {
                    break;
                }
            }
        }

        System.out.println(sb);
    }
}