import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[][] town = new int[N][3];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            town[i][0] = Integer.parseInt(st.nextToken());
            town[i][1] = Integer.parseInt(st.nextToken());
            town[i][2] = Integer.parseInt(st.nextToken());
        }

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < N; i++) {
            int d1 = Integer.MAX_VALUE;
            int d2 = Integer.MAX_VALUE;
            for (int j = 0; j < N; j++) {
                if (i == j)
                    continue;
                int d = Math.abs(town[i][0] - town[j][0]) + Math.abs(town[i][1] - town[j][1])
                        + Math.abs(town[i][2] - town[j][2]);
                if (d < d1) {
                    d2 = d1;
                    d1 = d;
                } else if (d < d2) {
                    d2 = d;
                }
            }
            min = Math.min(min, d1 + d2);
        }

        System.out.println(min);
    }
}