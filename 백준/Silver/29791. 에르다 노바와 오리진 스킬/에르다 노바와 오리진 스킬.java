import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] erda = new int[N];
        for (int i = 0; i < N ; i++) {
            erda[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(erda);

        st = new StringTokenizer(br.readLine());
        int[] origin = new int[M];
        for (int i = 0; i < M; i++) {
            origin[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(origin);

        System.out.print(calculate(erda, 100) + " " + calculate(origin, 360));
    }

    static int calculate(int[] times, int coolTime) {
        int cnt = 0;
        int lastCool = 0;
        int lastImmune = 0;
        for (int time : times) {
            if (time >= lastCool && time >= lastImmune) {
                cnt++;
                lastCool = time + coolTime;
                lastImmune = time + 90;
            }
        }
        return cnt;
    }
}