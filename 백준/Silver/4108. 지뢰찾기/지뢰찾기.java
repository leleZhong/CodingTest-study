import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static char[][] map;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while (true) {
            String s = br.readLine();
            if (s.equals("0 0")) break;

            StringTokenizer st = new StringTokenizer(s);
            int R = Integer.parseInt(st.nextToken());
            int C = Integer.parseInt(st.nextToken());
            map = new char[R + 2][C + 2];
            for (int i = 1; i <= R; i++) {
                char[] tmp = br.readLine().toCharArray();
                for (int j = 1; j <= C; j++) {
                    map[i][j] = tmp[j - 1];
                }
            }

            for (int i = 1; i <= R; i++) {
                for (int j = 1; j <= C; j++) {
                    if (map[i][j] == '*')
                        sb.append('*');
                    else if (map[i][j] == '.') {
                        sb.append(find(i, j));
                    }
                }
                sb.append("\n");
            }
        }
        System.out.print(sb);
    }

    static int find(int r, int c) {
        int cnt = 0;
        for (int i = -1; i <= 1; i++) {
            for (int j = - 1; j <= 1; j++) {
                if (map[r + i][c + j] == '*')
                    cnt++;
            }
        }
        return cnt;
    }
}