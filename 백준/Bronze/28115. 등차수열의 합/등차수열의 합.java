import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        long[] A = new long[N + 1];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= N; i++) {
            A[i] = Long.parseLong(st.nextToken());
        }

        if (N == 1) {
            System.out.println("YES\n1\n" + (A[1] - 1));
            return;
        }

        boolean flag = true;
        long differ = A[2] - A[1];
        for (int i = 3; i <= N; i++) {
            if (A[i] - A[i - 1] != differ) {
                flag = false;
                break;
            }
        }

        if (!flag) {
            System.out.println("NO");
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("YES").append("\n");
            for (int i = 1; i <= N; i++) {
                sb.append(0).append(" ");
            }
            sb.append("\n");
            for (int i = 1; i <= N; i++) {
                sb.append(A[i]).append(" ");
            }
            sb.append("\n");

            System.out.print(sb);
        }
    }
}