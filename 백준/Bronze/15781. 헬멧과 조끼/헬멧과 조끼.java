import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] helmet = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            helmet[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(helmet);

        int[] vest = new int[M];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            vest[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(vest);

        System.out.println(helmet[N - 1] + vest[M - 1]);
    }
}