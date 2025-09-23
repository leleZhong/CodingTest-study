import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        ArrayDeque<Integer> stack = new ArrayDeque<>();
        int start = 1;

        StringTokenizer st = new StringTokenizer(br.readLine());
        while (N-- > 0) {
            int num = Integer.parseInt(st.nextToken());
            if (num == start) {
                start++;
            } else {
                while (!stack.isEmpty() && stack.peek() == start) {
                    stack.pop();
                    start++;
                }
                stack.push(num);
            }
        }

        while (!stack.isEmpty() && stack.peek() == start) {
            stack.pop();
            start++;
        }

        System.out.print(stack.isEmpty() ? "Nice" : "Sad");
    }
}