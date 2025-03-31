import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(br.readLine());
        }

        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<>();
        
        int curr = 1;
        stack.push(curr);
        for (int i = 0; i < n; i++) {
            while (curr <= nums[i]) {
                stack.push(curr++);
                sb.append('+').append("\n");
            }
            if (stack.peek() == nums[i]) {
                stack.pop();
                sb.append('-').append("\n");
            }
            else {
                System.out.print("NO");
                return;
            }
        }

        System.out.print(sb);
    }
}