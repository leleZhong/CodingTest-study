import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

class Main {
    static int V;
    static ArrayList<int[]>[] list;
    static boolean[] visited;
    static int end = 1;

    static int max = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        V = Integer.parseInt(br.readLine());

        list = new ArrayList[V + 1];
        for (int i = 1; i <= V; i++) {
            list[i] = new ArrayList<>();
        }

        for (int i = 1; i <= V; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int nodeNum = Integer.parseInt(st.nextToken());

            String s;
            while (!(s = st.nextToken()).equals("-1")) {
                int node = Integer.parseInt(s);
                int length = Integer.parseInt(st.nextToken());
                list[nodeNum].add(new int[] { node, length });
            }
        }

        visited = new boolean[V + 1];
        visited[1] = true;
        dfs(1, 0);

        max = 0;
        visited = new boolean[V + 1];
        visited[end] = true;
        dfs(end, 0);

        System.out.println(max);
    }

    static void dfs(int node, int length) {
        if (length > max) {
            max = length;
            end = node;
        }

        for (int[] arr : list[node]) {
            if (!visited[arr[0]]) {
                visited[arr[0]] = true;
                dfs(arr[0], length + arr[1]);
                visited[arr[0]] = false;
            }
        }
    }
}