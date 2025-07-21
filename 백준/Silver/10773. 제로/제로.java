import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int K = Integer.parseInt(br.readLine());

        Stack<Integer> s = new Stack<>();
        while (K --> 0) {
            if (s.push(Integer.parseInt(br.readLine())) == 0) {
                s.pop();
                s.pop();
            }
        }

        int sum = 0;
        while (s.size() != 0) {
            sum += s.pop();
        }

        System.out.print(sum);
    }
}