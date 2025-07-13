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

        int immune = 0;
        int erdaCool = 0;
        int erdaCnt = 0;
        for (int time : erda) {
            if (time >= erdaCool && time >= immune) {
                erdaCnt++;
                erdaCool = time + 100;
                immune = time + 90;
            }
        }
        
        immune = 0;
        int originCool = 0;
        int originCnt = 0;
        for (int time : origin) {
            if (time >= originCool && time >= immune) {
                originCnt++;
                originCool = time + 360;
                immune = time + 90;
            }
        }

        System.out.print(erdaCnt + " " + originCnt);
    }
}