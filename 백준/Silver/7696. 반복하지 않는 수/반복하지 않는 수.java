import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        List<Integer> l = new ArrayList<>();
        boolean[] arr = new boolean[10];
        for (int i = 1; i <= 123456789; i++) {
            Arrays.fill(arr, false);
            int tmp = i;
            boolean possible = true;
            while (tmp > 0) {
                if (!arr[tmp % 10]) {
                    arr[tmp % 10] = true;
                    tmp /= 10;
                } else {
                    possible = false;
                    break;
                }
            }
            if (possible)
                l.add(i);

            if (l.size() > 1000000)
                break;
        }

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while (true) {
            int n = Integer.parseInt(br.readLine());
            if (n == 0)
                break;

            sb.append(l.get(n - 1)).append("\n");
        }
        System.out.print(sb);
    }
}