import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

class Main {
    static boolean[][] marked;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int[][] bingo = new int[5][5];
        marked = new boolean[5][5];
        HashMap<Integer, int[]> map = new HashMap<>(); // 숫자->좌표
        for (int i = 0; i < 5; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 5; j++) {
                int num = Integer.parseInt(st.nextToken());
                bingo[i][j] = num;
                map.put(num, new int[] { i, j });
            }
        }

        for (int i = 0; i < 5; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 5; j++) {
                int num = Integer.parseInt(st.nextToken());
                int[] idx = map.get(num);
                marked[idx[0]][idx[1]] = true;

                if (check() >= 3) {
                    System.out.println(i * 5 + j + 1);
                    return;
                }
            }
        }
    }

    static int check() {
        int cnt = 0;
        for (int i = 0; i < 5; i++) {
            boolean findRow = true;
            boolean findCol = true;
            for (int j = 0; j < 5; j++) {
                if (!marked[i][j]) {
                    findRow = false;
                }
                if (!marked[j][i]) {
                    findCol = false;
                }
            }

            if (findRow) cnt++;
            if (findCol) cnt++;
        }

        boolean findCross = true, findCross2 = true;
        for (int i = 0; i < 5; i++) {
            if (!marked[i][i]) {
                findCross = false;
            }
            if (!marked[4 - i][i]) {
                findCross2 = false;
            }
        }

        if (findCross) cnt++;
        if (findCross2) cnt++;

        return cnt;
    }
}