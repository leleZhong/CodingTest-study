import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

class Main {
    static final int INF = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int TC = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        while (TC --> 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            int W = Integer.parseInt(st.nextToken());

            ArrayList<int[]>[] graph = new ArrayList[N + 1];
            for (int i = 1; i <= N; i++) {
                graph[i] = new ArrayList<>();
            }

            while (M -- > 0) {
                st = new StringTokenizer(br.readLine());
                int S = Integer.parseInt(st.nextToken());
                int E = Integer.parseInt(st.nextToken());
                int T = Integer.parseInt(st.nextToken());
                graph[S].add(new int[] { E, T });
                graph[E].add(new int[] { S, T });
            }

            while (W --> 0) {
                st = new StringTokenizer(br.readLine());
                int S = Integer.parseInt(st.nextToken());
                int E = Integer.parseInt(st.nextToken());
                int T = Integer.parseInt(st.nextToken());
                graph[S].add(new int[] { E, -T });
            }

            sb.append(bellmanFord(N, graph) ? "YES" : "NO").append("\n");
        }

        System.out.println(sb);
    }

    static boolean bellmanFord(int N, ArrayList<int[]>[] graph) {
        int[] dist = new int[N + 1];
        Arrays.fill(dist, 0);  // 모든 정점을 0으로 초기화 (가상의 시작점)

        for (int i = 1; i <= N - 1; i++) {
            for (int u = 1; u <= N; u++) {
                for (int[] e : graph[u]) {
                    int v = e[0];
                    int w = e[1];
                    if (dist[v] > dist[u] + w) {
                        dist[v] = dist[u] + w;
                    }
                }
            }
        }

        for (int u = 1; u <= N; u++) {
            for (int[] e : graph[u]) {
                int v = e[0];
                int w = e[1];
                if (dist[v] > dist[u] + w) {
                    return true;
                }
            }
        }

        return false;
    }
}