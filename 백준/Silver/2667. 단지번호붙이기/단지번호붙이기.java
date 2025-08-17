import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    static int N;
    static char[][] arr;
    static boolean[][] visited;
    static int[] dx = { 1, -1, 0, 0 };
    static int[] dy = { 0, 0, 1, -1 };

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        arr = new char[N][N];
        for (int i = 0; i < N; i++) {
            arr[i] = br.readLine().toCharArray();
        }

        visited = new boolean[N][N];
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (arr[i][j] == '1' && !visited[i][j]) {
                    visited[i][j] = true;
                    list.add(bfs(i, j));
                }
            }
        }
        Collections.sort(list);

        StringBuilder sb =  new StringBuilder();
        for (int n : list) {
            sb.append(n).append("\n");
        }

        System.out.print(list.size() + "\n" + sb);
    }

    static int bfs(int x, int y) {
        ArrayDeque<int[]> q = new ArrayDeque<>();
        q.add(new int[] { x, y });

        int cnt = 1;
        while (!q.isEmpty()) {
            int[] cur = q.poll();
            for (int i = 0; i < 4; i++) {
                int nx = cur[0] + dx[i];
                int ny = cur[1] + dy[i];
                if (nx < 0 || nx >= N || ny < 0 || ny >= N) {
                    continue;
                }

                if (arr[nx][ny] == '1' && !visited[nx][ny]) {
                    visited[nx][ny] = true;
                    cnt++;
                    q.add(new int[] { nx, ny });
                }
            }
        }

        return cnt;
    }
}