import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = 10;
        int[] dx = {-2, -1, 1, 2};

        StringBuilder sb = new StringBuilder();
        for (int tc = 1; tc <= T; tc++) {
            sb.append("#").append(tc).append(" ");

            int N = Integer.parseInt(br.readLine());
            int[] buildings = new int[N];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < N; i++) {
                buildings[i] = Integer.parseInt(st.nextToken());
            }

            int cnt = 0;
            for (int i = 2; i < N - 2; i++) {
                int max = 0;
                for (int d : dx) {
                    max = Math.max(max, buildings[i + d]);
                }

                cnt += buildings[i] > max ? buildings[i] - max : 0;
            }

            sb.append(cnt).append("\n");
        }

        System.out.print(sb);
    }
}