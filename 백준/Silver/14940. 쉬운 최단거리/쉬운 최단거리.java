import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        char[][] arr = new char[n][m];
        boolean[][] visited = new boolean[n][m];
        ArrayDeque<int[]> q = new ArrayDeque<>();

        int[][] ans = new int[n][m];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            Arrays.fill(ans[i], -1);
            for (int j = 0; j < m; j++) {
                arr[i][j] = st.nextToken().charAt(0);
                if (arr[i][j] == '2') {
                    q.add(new int[] { i, j, 0 });
                    ans[i][j] = 0;
                    visited[i][j] = true;
                } else if (arr[i][j] == '0') {
                    ans[i][j] = 0;
                    visited[i][j] = true;
                }
            }
        }

        int[] dx = { -1, 1, 0, 0 };
        int[] dy = { 0, 0, -1, 1 };
        while (!q.isEmpty()) {
            int size = q.size();
            while (size-- > 0) {
                int[] cur = q.poll();
                int x = cur[0];
                int y = cur[1];
                int dis = cur[2];
                for (int i = 0; i < 4; i++) {
                    int nx = x + dx[i];
                    int ny = y + dy[i];
                    if (nx >= 0 && nx < n && ny >= 0 && ny < m) {
                        if (arr[nx][ny] == '1' && !visited[nx][ny]) {
                            visited[nx][ny] = true;
                            ans[nx][ny] = dis + 1;
                            q.add(new int[] { nx, ny, dis + 1 });
                        }
                    }
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int[] cur : ans) {
            for (int num : cur) {
                sb.append(num).append(" ");
            }
            sb.append("\n");
        }

        System.out.print(sb);
    }
}