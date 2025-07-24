import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int N;
    static int[] arr;
    static String ans;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new int[N];

        recur(0);

        System.out.print(ans);
    }

    static void recur(int depth) {
        if (ans != null || !check(depth)) {
            return;
        }

        if (depth == N) {
            StringBuilder sb = new StringBuilder();
            for (int num : arr) {
                sb.append(num);
            }
            ans = sb.toString();
            return;
        }

        for (int i = 1; i <= 3; i++) {
            arr[depth] = i;
            recur(depth + 1);
        }
    }

    static boolean check(int depth) {
        if (depth < 2) {
            return true;
        }

        for (int len = 1; len <= depth / 2; len++) {
            boolean repeat = true;
            for (int j = 0; j < len; j++) {
                if (arr[depth - 1 - j] != arr[depth - 1 - len - j]) {
                    repeat = false;
                    break;
                }
            }
            if (repeat) {
                return false;
            }
        }

        return true;
    }
}