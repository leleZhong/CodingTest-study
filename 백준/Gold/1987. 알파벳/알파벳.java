import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    static int R, C;
    static char[][] arr;
    static int max = 0;
    static boolean[] visited = new boolean[26];
    static int[] dx = { 1, -1, 0, 0 };
    static int[] dy = { 0, 0, 1, -1 };

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());

        arr = new char[R][C];
        for (int i = 0; i < R; i++) {
            arr[i] = br.readLine().toCharArray();
        }

        visited[arr[0][0] - 'A'] = true;
        recur(0, 0, 1);

        System.out.println(max);
    }

    static void recur(int x, int y, int cnt) {
        if (max < cnt) {
            max = cnt;
        }

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (nx < 0 || nx >= R || ny < 0 || ny >= C) continue;

            if (!visited[arr[nx][ny] - 'A']) {
                visited[arr[nx][ny] - 'A'] = true;
                recur(nx, ny, cnt + 1);
                visited[arr[nx][ny] - 'A'] = false;
            }
        }
    }
}