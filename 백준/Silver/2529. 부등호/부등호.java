import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int k;
    static String[] arr;
    static int[] ans;
    static boolean[] visited;
    static int max = 0;
    static int min = Integer.MAX_VALUE;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        k = Integer.parseInt(br.readLine());
        // allocate array for k relational operators
        arr = new String[k];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < k; i++) {
            arr[i] = st.nextToken();
        }

        ans = new int[k + 1];
        visited = new boolean[10];

        recur(0);

        String tmp = sb.toString();
        System.out.print(tmp.substring(0, k + 1) + "\n" + tmp.substring(tmp.lastIndexOf("\n", tmp.length() - 2) + 1));
    }

    static void recur(int depth) {
        // 가지치기
        if (!check(depth)) {
            return;
        }

        // 기저
        if (depth == k + 1) {
            for (int i = 0; i < k + 1; i++) {
                sb.append(ans[i]);
            }
            sb.append("\n");
            return;
        }

        // 재귀 호출
        for (int i = 9; i >= 0; i--) {
            if (visited[i]) {
                continue;
            }

            ans[depth] = i;
            visited[i] = true;
            recur(depth + 1);
            visited[i] = false;
        }
    }

    static boolean check(int depth) {
        // 수를 하나도 안 채웠거나, 하나만 채운 경우 거름
        if (depth < 2) {
            return true;
        }

        if (arr[depth - 2].equals("<") && ans[depth - 2] > ans[depth - 1])
            return false;
        if (arr[depth - 2].equals(">") && ans[depth - 2] < ans[depth - 1])
            return false;

        return true;
    }
}