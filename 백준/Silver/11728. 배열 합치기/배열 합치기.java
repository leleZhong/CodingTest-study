import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] A = new int[N];
        int[] B = new int[M];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            B[i] = Integer.parseInt(st.nextToken());
        }

        StringBuilder sb = new StringBuilder();
        int a = 0, b = 0;
        while (a < N && b < M) {
            if (A[a] < B[b]) {
                sb.append(A[a++]).append(" ");
            } else {
                sb.append(B[b++]).append(" ");
            }
        }

        while (a < N) {
            sb.append(A[a++]).append(" ");
        }
        while (b < M) {
            sb.append(B[b++]).append(" ");
        }
        System.out.println(sb);
    }
}