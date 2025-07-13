import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), "-");
        int curY = Integer.parseInt(st.nextToken());
        int curM = Integer.parseInt(st.nextToken());
        int curD = Integer.parseInt(st.nextToken());

        int N = Integer.parseInt(br.readLine());
        int cnt = 0;
        while (N-- > 0) {
            st = new StringTokenizer(br.readLine(), "-");
            int Y = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            int D = Integer.parseInt(st.nextToken());
            if (Y > curY) {
                cnt++;
                continue;
            } else if (Y == curY) {
                if (M > curM) {
                    cnt++;
                    continue;
                } else if (M == curM) {
                    if (D >= curD) {
                        cnt++;
                    }
                }
            }
        }

        System.out.print(cnt);
    }
}