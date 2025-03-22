import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int max = 0;
        int r = 0, c = 0;

        for (int i = 0; i < 9; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 9; j++) {
                int tmp = Integer.parseInt(st.nextToken());
                if (max < tmp) {
                    max = tmp;
                    r = i;
                    c = j;
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        sb.append(max).append("\n").append(r+1).append(" ").append(c+1);
        System.out.print(sb);
    }
}