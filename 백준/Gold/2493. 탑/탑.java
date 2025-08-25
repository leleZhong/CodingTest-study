import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        StringBuilder sb = new StringBuilder();
        ArrayDeque<int[]> stack = new ArrayDeque<>();
        stack.push(new int[] {1, arr[0]});
        sb.append(0).append(" ");
        for (int i = 1; i < N; i++) {
            while (!stack.isEmpty() && stack.peek()[1] < arr[i]) {
                stack.pop();
            }

            if (stack.isEmpty()) {
                sb.append(0).append(" ");
            } else {
                sb.append(stack.peek()[0]).append(" ");
            }

            stack.push(new int[] { i + 1, arr[i] });
        }

        System.out.print(sb);
    }
}