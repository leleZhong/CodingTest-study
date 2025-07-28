import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringBuilder sb = new StringBuilder();
        String input;
        while (!(input = br.readLine()).equals(".")) {
            char[] arr = input.toCharArray();
            ArrayDeque<Character> stack = new ArrayDeque<>();
            boolean balance = true;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == '(' || arr[i] == '[') {
                    stack.push(arr[i]);
                } else if (arr[i] == ')') {
                    if (stack.isEmpty() || stack.peek() != '(') {
                        balance = false;
                        break;
                    } else {
                        stack.pop();
                    }
                } else if (arr[i] == ']') {
                    if (stack.isEmpty() || stack.peek() != '[') {
                        balance = false;
                        break;
                    } else {
                        stack.pop();
                    }
                }
            }
            
            sb.append(balance && stack.isEmpty() ? "yes" : "no").append("\n");
        }

        System.out.print(sb);
    }
}