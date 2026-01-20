import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    static int N, K;
    static int[][] queens;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int R = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        queens = new int[K][2];
        for (int i = 0; i < K; i++) {
            st = new StringTokenizer(br.readLine());
            queens[i][0] = Integer.parseInt(st.nextToken());
            queens[i][1] = Integer.parseInt(st.nextToken());
        }

        int[] dr = { -1, -1, -1, 0, 0, 1, 1, 1 };
        int[] dc = { -1, 0, 1, -1, 1, -1, 0, 1 };
        String ans = "NONE";

        if (isAttacked(R, C)) {
            boolean isCheck = false;
            for (int i = 0; i < 8; i++) {
                int nr = R + dr[i];
                int nc = C + dc[i];
                if (!inBorder(nr, nc)) continue;

                if (!isAttacked(nr, nc)) {
                    isCheck = true;
                    break;
                }
            }
            if (isCheck) ans = "CHECK";
            else ans = "CHECKMATE";
        } else {
            boolean isStale = true;
            for (int i = 0; i < 8; i++) {
                int nr = R + dr[i];
                int nc = C + dc[i];
                if (!inBorder(nr, nc)) continue;

                if (!isAttacked(nr, nc)) {
                    isStale = false;
                    break;
                }
            }
            if (isStale) ans = "STALEMATE";
        }

        System.out.println(ans);
    }

    static boolean inBorder(int r, int c) {
        if (r < 1 || r > N || c < 1 || c > N) return false;
        return true;
    }

    // 해당 위치가 공격받는지 확인
    static boolean isAttacked(int r, int c) {
        for (int i = 0; i < K; i++) {
            int qr = queens[i][0];
            int qc = queens[i][1];

            // 같은 행 또는 같은 열
            if (qr == r || qc == c) return true;

            // 같은 대각선 (행 차이 == 열 차이)
            if (Math.abs(qr - r) == Math.abs(qc - c)) return true;
        }
        return false;
    }
}