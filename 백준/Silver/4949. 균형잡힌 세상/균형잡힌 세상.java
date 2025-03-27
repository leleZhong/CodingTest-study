import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        char[] open = {'(', '['};
        char[] close = {')', ']'};

        while (true) {
            String input = br.readLine();
            if (input.equals("."))
                break;
            
            char[] arr = input.toCharArray();
            Stack<Character> bracket = new Stack<>();
            boolean isBalanced = true;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == open[0] || arr[i] == open[1])
                    bracket.add(arr[i]);

                if (arr[i] == close[0]) {
                    if (!bracket.isEmpty() && bracket.peek() == open[0])
                        bracket.pop();
                    else 
                        isBalanced = false;
                }
                if (arr[i] == close[1]) {
                    if (!bracket.isEmpty() && bracket.peek() == open[1])
                        bracket.pop();
                    else
                        isBalanced = false;
                }
            }
            if (isBalanced && bracket.isEmpty()) 
                sb.append("yes").append("\n");
            else
                sb.append("no").append("\n");
        }
        System.out.print(sb);
    }
}