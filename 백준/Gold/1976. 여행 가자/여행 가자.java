import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    static int[] parents;
    static int[] rank;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());

        make(N);

        for (int i = 1; i <= N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= N; j++) {
                int connect = Integer.parseInt(st.nextToken());
                if (i == j) continue;
                if (connect == 1) {
                    union(i, j);
                }
            }
        }

        StringTokenizer st = new StringTokenizer(br.readLine());
        int prev = -1;
        while (M --> 0) {
            int city = Integer.parseInt(st.nextToken());
            int p = find(city);
            if (prev == -1) {
                prev = p;
                continue;
            }

            if (prev != p) {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }

    static void make(int N) {
        parents = new int[N + 1];
        rank = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            parents[i] = i;
        }
    }

    static int find(int a) {
        if (a == parents[a]) return a;
        return parents[a] = find(parents[a]);
    }

    static void union(int a, int b) {
        int pa = find(a);
        int pb = find(b);

        if (pa == pb) return;

        if (rank[pa] > rank[pb]) {
            parents[pb] = pa;
        } else if (rank[pa] < rank[pb]) {
            parents[pa] = pb;
        } else {
            parents[pb] = pa;
            rank[pa]++;
        }
    }
}