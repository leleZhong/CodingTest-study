import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        boolean[] visited = new boolean[10000];
        int[] prev = new int[10000];
        char[] command = new char[10000];

        StringBuilder sb = new StringBuilder();
        while (T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            ArrayDeque<Integer> q = new ArrayDeque<>();
            Arrays.fill(visited, false);
            q.add(A);
            visited[A] = true;

            while (!q.isEmpty()) {
                int cur = q.poll();
                boolean find = false;
                for (char c : new char[] { 'D', 'S', 'L', 'R' }) {
                    int nx = dslr(c, cur);
                    if (!visited[nx]) {
                        visited[nx] = true;
                        prev[nx] = cur;
                        command[nx] = c;

                        if (nx == B) {
                            find = true;
                            break;
                        }

                        q.add(nx);
                    }
                }

                if (find) {
                    break;
                }
            }

            StringBuilder tmp = new StringBuilder();

            int cur = B;
            while (cur != A) {
                tmp.append(command[cur]);
                cur = prev[cur];
            }

            sb.append(tmp.reverse()).append("\n");
        }

        System.out.print(sb);
    }

    static int dslr(char c, int n) {
        switch (c) {
            case 'D':
                return n * 2 % 10000;
            case 'S':
                return n == 0 ? 9999 : n - 1;
            case 'L':
                return (n % 1000) * 10 + n / 1000;
            case 'R':
                return (n % 10) * 1000 + n / 10;
        }
        return 0;
    }
}