import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        StringBuilder sb = new StringBuilder();
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        int idx = 0;
        int num = 1;
        while (idx < n) {
            if (stack.isEmpty() || stack.peek() < arr[idx]) {
                stack.push(num);
                sb.append("+\n");
                num++;
            } else if (stack.peek() == arr[idx]) {
                stack.pop();
                sb.append("-\n");
                idx++;
            } else {
                System.out.print("NO");
                return;
            }
        }
        System.out.print(sb);
    }
}