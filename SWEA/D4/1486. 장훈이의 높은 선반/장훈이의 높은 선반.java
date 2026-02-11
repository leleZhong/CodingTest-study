import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Solution {
    static StringBuilder sb = new StringBuilder();

    static int N, B;
    static int[] heights;
    static int min;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        for (int tc = 1; tc <= T; tc++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            B = Integer.parseInt(st.nextToken());

            heights = new int[N];
            st = new StringTokenizer(br.readLine());    
            for (int i = 0; i < N; i++) {
                heights[i] = Integer.parseInt(st.nextToken());
            }
            min = Integer.MAX_VALUE;
            recur(0, 0);

            sb.append("#").append(tc).append(" ").append(min - B).append("\n");
        }
        System.out.println(sb);
    }

    static void recur(int idx, int sum) {
        if (sum >= B) {
            min = Math.min(min, sum);
            return;
        }

        if (idx == N) return;
        if (sum >= min) return;

        recur(idx + 1, sum + heights[idx]);
        recur(idx + 1, sum);
    }
}
