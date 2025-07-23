import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        ArrayDeque<Character> stack = new ArrayDeque<>();
        while (T --> 0) {
            stack.clear();

            char[] arr = br.readLine().toCharArray();
            boolean valid = true;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == '(') {
                    stack.push(arr[i]);
                } else if (arr[i] == ')') {
                    if (!stack.isEmpty() && stack.peek() == '(') {
                        stack.pop();
                    } else {
                        valid = false;
                        break;
                    }
                }
            }

            sb.append(stack.isEmpty() && valid ? "YES" : "NO").append("\n");
        }

        System.out.print(sb);
    }
}