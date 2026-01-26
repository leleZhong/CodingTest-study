import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int Q = Integer.parseInt(st.nextToken());

        int[] trees = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            trees[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(trees);

        long[] prefix = new long[N + 1];
        for (int i = 0; i < N; i++) {
            prefix[i + 1] = prefix[i] + trees[i];
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < Q; i++) {
            long spot = Long.parseLong(br.readLine());

            int l = 0, r = N;
            int idx = 0;
            while (l < r) {
                int mid = (l + r) / 2;
                if (trees[mid] < spot) {
                    l = mid + 1;
                } else {
                    r = mid;
                }
            }
            idx = l;

            long leftSum = spot * idx - prefix[idx];
            long rightSum = prefix[N] - prefix[idx] - spot * (N - idx);
            sb.append(leftSum + rightSum).append("\n");
        }
        System.out.println(sb);
    }
}