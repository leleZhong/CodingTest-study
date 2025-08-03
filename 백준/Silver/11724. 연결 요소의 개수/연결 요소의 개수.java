import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        ArrayList<Integer>[] graph = new ArrayList[N + 1];
        for (int i = 1; i <= N; i++) {
            graph[i] = new ArrayList<Integer>();
        }

        while (M-- > 0) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            graph[x].add(y);
            graph[y].add(x);
        }

        boolean[] visited = new boolean[N + 1];
        ArrayDeque<Integer> q = new ArrayDeque<>();
        q.add(1);

        int cnt = 0;
        for (int i = 1; i <= N; i++) {
            if (!visited[i]) {
                q.add(i);
                visited[i] = true;
                cnt++;
            }

            while (!q.isEmpty()) {
                int size = q.size();
                while (size-- > 0) {
                    int cur = q.poll();
                    for (int next : graph[cur]) {
                        if (!visited[next]) {
                            visited[next] = true;
                            q.add(next);
                        }
                    }
                }
            }
        }

        System.out.print(cnt);
    }
}