import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

class Main {
    static final int INF = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());

        ArrayList<int[]>[] list = new ArrayList[N + 1];
        ArrayList<int[]>[] rList = new ArrayList[N + 1];
        for (int i = 1; i <= N; i++) {
            list[i] = new ArrayList<>();
            rList[i] = new ArrayList<>();
        }

        while (M-- > 0) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            int t = Integer.parseInt(st.nextToken());
            list[s].add(new int[] { e, t });
            rList[e].add(new int[] { s, t });
        }

        int[] go = dijkstra(X, list);
        int[] back = dijkstra(X, rList);

        int ans = 0;
        for (int i = 1; i <= N; i++) {
            if (go[i] == INF || back[i] == INF) continue;

            ans = Math.max(ans, go[i] + back[i]);
        }

        System.out.println(ans);
    }

    static int[] dijkstra(int start, ArrayList<int[]>[] graph) {
        int len = graph.length;
        int[] dist = new int[len];
        Arrays.fill(dist, INF);

        dist[start] = 0;

        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[1] - b[1]);
        pq.add(new int[] { start, 0 });
        while (!pq.isEmpty()) {
            int[] cur = pq.poll();
            int node = cur[0];
            int cost = cur[1];

            if (cost > dist[node]) continue;

            for (int[] arr : graph[node]) {
                int next = arr[0];
                int nextCost = cost + arr[1];
                if (nextCost < dist[next]) {
                    dist[next] = nextCost;
                    pq.add(new int[] { next, nextCost });
                }
            }
        }

        return dist;
    }
}