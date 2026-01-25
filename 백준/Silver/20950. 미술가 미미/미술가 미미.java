import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    static int N;
    static int[][] arr;
    static int[] target;

    static int min = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        arr = new int[N][3];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 3; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        StringTokenizer st = new StringTokenizer(br.readLine());
        target = new int[] { Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()),
                Integer.parseInt(st.nextToken()) };
        
        mix(0, 0, 0, 0, 0);

        System.out.println(min);
    }

    static void mix(int idx, int r, int g, int b, int sel) {
        if (sel >= 2) {
            int diff = Math.abs(r / sel - target[0]) + Math.abs(g / sel - target[1]) + Math.abs(b / sel - target[2]);
            min = Math.min(min, diff);
        }
        if (idx == N || sel == 7) return;

        // 현재 인덱스 선택
        mix(idx + 1, r + arr[idx][0], g + arr[idx][1], b + arr[idx][2], sel + 1);
        // 선택x
        mix(idx + 1, r, g, b, sel);
    }
}