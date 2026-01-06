import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int[] ans = new int[N];
        Arrays.fill(ans, -1);
        int tmp = arr[0];
        int idx = 0;
        for (int i = 1; i < N; i++) {
            if (arr[i] != tmp) {
                for (int j = idx; j < i; j++) {
                    ans[j] = i + 1;
                }
                tmp = arr[i];
                idx = i;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            sb.append(ans[i]).append(" ");
        }

        System.out.println(sb);
    }
}