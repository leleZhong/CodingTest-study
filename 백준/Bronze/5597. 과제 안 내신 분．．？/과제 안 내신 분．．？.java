import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean[] submit = new boolean[31];
        for (int i = 0; i < 28; i++) {
            submit[Integer.parseInt(br.readLine())] = true;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < submit.length; i++) {
            if (!submit[i]) {
                sb.append(i).append("\n");
            }
        }

        System.out.print(sb);
    }
}