import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int T = Integer.parseInt(st.nextToken());
        int R = Integer.parseInt(st.nextToken());

        int time = 0;
        int exTime = 0;
        int X = m;
        while (exTime < N) {
            if (m + T > M) {
                time = -1;
                break;
            }

            if (X + T <= M) {
                X += T;
                exTime++;
            } else {
                X -= R;
                if (X < m) {
                    X = m;
                }
            }
            time++;
        }

        System.out.println(time);
    }
}