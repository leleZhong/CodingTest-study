import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    static int N;
    static int K = 0;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        hanoi(N, 1, 2, 3);

        System.out.println(K);
        System.out.println(sb);
    }

    static void hanoi(int n, int start, int mid, int end) {
        if (n == 1) {
            K++;
            sb.append(start).append(" ").append(end).append("\n");
            return;
        }

        hanoi(n - 1, start, end, mid);
        hanoi(1, start, mid, end);
        hanoi(n - 1, mid, start, end);
    }
}