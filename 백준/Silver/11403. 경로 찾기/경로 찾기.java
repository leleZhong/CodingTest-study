import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        ArrayList<Integer>[] graph = new ArrayList[N];
        for (int i = 0; i < N; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                if (Integer.parseInt(st.nextToken()) == 1) {
                    graph[i].add(j);
                }
            }
        }

        int[][] ans = new int[N][N];
        for (int i = 0; i < N; i++) {
            boolean[] visited = new boolean[N];
            ArrayDeque<Integer> q = new ArrayDeque<>();
            q.add(i);

            while (!q.isEmpty()) {
                int cur = q.poll();
                for (int node : graph[cur]) {
                    if (!visited[node]) {
                        visited[node] = true;
                        q.add(node);
                    }
                }
            }

            for (int j = 0; j < N; j++) {
                ans[i][j] = visited[j] ? 1 : 0;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int[] arr : ans) {
            for (int num : arr) {
                sb.append(num).append(" ");
            }
            sb.append("\n");
        }

        System.out.print(sb);
    }
}