import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        char[] yutnori = {'D', 'C', 'B', 'A', 'E'};

        for (int i = 0; i < 3; i++) {
            st = new StringTokenizer(br.readLine());
            int cnt = 0;
            for (int j = 0; j < 4; j++) {
                if (Integer.parseInt(st.nextToken()) == 1) {
                    cnt++;
                }
            }
            sb.append(yutnori[cnt]).append("\n");
        }

        System.out.print(sb);
    }
}