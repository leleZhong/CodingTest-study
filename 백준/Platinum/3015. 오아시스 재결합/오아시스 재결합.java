import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        ArrayDeque<long[]> stack = new ArrayDeque<>();
        long ans = 0;
        while (N-- > 0) {
            int num = Integer.parseInt(br.readLine());
            long cnt = 1;

            while (!stack.isEmpty() && stack.peek()[0] < num) {
                ans += stack.pop()[1];
            }

            if (!stack.isEmpty() && stack.peek()[0] == num) {
                long[] cur = stack.pop();
                ans += cur[1];
                cnt += cur[1];
                if (!stack.isEmpty()) {
                    ans++;
                }
            } else if (!stack.isEmpty()) {
                ans++;
            }

            stack.push(new long[] { num, cnt });
        }

        System.out.println(ans);
    }
}