import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    static long A, B;
    static int min = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        A = Long.parseLong(st.nextToken());
        B = Long.parseLong(st.nextToken());

        recur(A, 1);

        System.out.println(min == Integer.MAX_VALUE ? -1 : min);
    }

    static void recur(long num, int cnt) {
        if (num == B) {
            min = Math.min(min, cnt);
            return;
        }

        if (num > B) return;

        recur(num * 10 + 1, cnt + 1);
        recur(num * 2, cnt + 1);
    }
}