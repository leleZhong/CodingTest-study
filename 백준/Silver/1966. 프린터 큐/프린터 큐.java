import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        while (T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());
            ArrayDeque<int[]> print = new ArrayDeque<>();
            for (int i = 0; i < N; i++) {
                print.add(new int[] { Integer.parseInt(st.nextToken()), i });
            }

            int cnt = 0;
            while (!print.isEmpty()) {
                int[] curr = print.peek();
                boolean hasHigh = false;
                for (int[] tmp : print) {
                    if (curr[0] < tmp[0]) {
                        print.add(print.poll());
                        hasHigh = true;
                        break;
                    }
                }

                if (!hasHigh) {
                    int[] printed = print.poll();
                    cnt++;
                    if (printed[1] == M) { // 인덱스가 M인지 확인!
                        sb.append(cnt).append("\n");
                        break;
                    }
                }
            }
        }

        System.out.print(sb);
    }
}