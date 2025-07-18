import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        boolean[] arr = new boolean[1000000 * 2 + 1];
        while (N --> 0) {
            arr[Integer.parseInt(br.readLine()) + 1000000] = true;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]) {
                sb.append(i - 1000000).append("\n");
            }
        }

        System.out.print(sb);
    }
}