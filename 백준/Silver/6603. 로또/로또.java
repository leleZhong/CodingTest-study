import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int k;
    static int[] arr, ans;
    static boolean[] visited;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String s;
        while (!(s = br.readLine()).equals("0")) {
            StringTokenizer st = new StringTokenizer(s);
            k = Integer.parseInt(st.nextToken());

            arr = new int[k];
            for (int i = 0; i < k; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }

            ans = new int[6];
            visited = new boolean[k];

            recur(0, 0);
            sb.append("\n");
        }

        System.out.print(sb);
    }

    static void recur(int idx, int cnt) {
        if (cnt == 6) {
            for (int i = 0; i < 6; i++) {
                sb.append(ans[i]).append(" ");
            }
            sb.append("\n");
            return;
        }

        if (idx == k) {
            return;
        }

        ans[cnt] = arr[idx];
        recur(idx + 1, cnt + 1);
        recur(idx + 1, cnt);
    }
}