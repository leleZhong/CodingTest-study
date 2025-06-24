import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[][] location = new int[4][4];
    static int min = Integer.MAX_VALUE;
    static boolean[] visit = new boolean[4];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 4; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            location[i][0] = Integer.parseInt(st.nextToken());
            location[i][1] = Integer.parseInt(st.nextToken());
        }
        dfs(0, 0, 0);

        System.out.print(min);
    }

    static void dfs(int x, double len, int depth) {
        if (depth == 3) {
            min = Math.min(min, (int)len);
        }

        for (int i = 1; i < 4; i++) {
            if (!visit[i]) {
                double tmp = Math.sqrt((location[x][0] - location[i][0]) * (location[x][0] - location[i][0])
                                        + (location[x][1] - location[i][1]) * (location[x][1] - location[i][1]));
                visit[i] = true;
                dfs(i, len + tmp, depth + 1);
                visit[i] = false;
            }
        }
    }
}