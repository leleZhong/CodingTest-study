import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

class Main {
    static int N;
    static ArrayList<Integer>[] tri;
    static int dp[][];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        tri = new ArrayList[N];
        for (int i = 0; i < N; i++) {
            tri[i] = new ArrayList<>();
        }

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j <= i; j++) {
                tri[i].add(Integer.parseInt(st.nextToken()));
            }
        }

        dp = new int[N][N];
        for (int[] arr : dp) {
            Arrays.fill(arr, -1);
        }

        System.out.println(recur(0, 0));
    }

    static int recur(int x, int y) {
        if (x == N - 1) {
            return tri[x].get(y);
        }

        if (dp[x][y] != -1) {
            return dp[x][y];
        }

        int l = tri[x].get(y) + recur(x + 1, y);
        int r = tri[x].get(y) + recur(x + 1, y + 1);
        return dp[x][y] = Math.max(l, r);
    }
}