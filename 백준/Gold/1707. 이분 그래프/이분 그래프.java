import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    static ArrayList<Integer>[] list;
    static int[] arr;
    static  boolean isBipartite;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int K = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        while (K --> 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int V = Integer.parseInt(st.nextToken());
            int E = Integer.parseInt(st.nextToken());

            list = new ArrayList[V + 1];
            for (int i = 1; i <= V; i++) {
                list[i] = new ArrayList<Integer>();
            }

            for (int i = 0; i < E; i++) {
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());

                list[x].add(y);
                list[y].add(x);
            }

            arr = new int[V + 1];
            isBipartite = true;
            for (int i = 1; i <= V; i++) {
                if (!isBipartite) {
                    break;
                }

                if (arr[i] == 0) {
                    bfs(i, 1);
                }
            }

            sb.append(isBipartite ? "YES" : "NO").append("\n");
        }

        System.out.print(sb);
    }

    static void bfs(int start, int color) {
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        queue.add(start);
        arr[start] = color;

        while (!queue.isEmpty() && isBipartite) {
            int cur = queue.poll();
            for (int node : list[cur]) {
                if (arr[node] == 0) {
                    queue.add(node);
                    arr[node] = -arr[cur];
                } else if (arr[node] == arr[cur]) {
                    isBipartite = false;
                    return;
                }
            }
        }
    }
}