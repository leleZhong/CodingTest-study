import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int R = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

    int[][] map = new int[R][C];
    for (int i = 0; i < R; i++) {
        st = new StringTokenizer(br.readLine());
        for (int j = 0; j < C; j++) {
            map[i][j] = Integer.parseInt(st.nextToken());
        }
    }

    StringBuilder sb = new StringBuilder();
    if (R % 2 != 0) {
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C - 1; j++) {
                sb.append(i % 2 == 0 ? "R" : "L");
            }
            if (i == R - 1)
                continue;
            sb.append("D");
        }
    } else {
        if (C % 2 != 0) {
            for (int i = 0; i < R - 2; i++) {
                for (int j = 0; j < C - 1; j++) {
                    sb.append(i % 2 == 0 ? "R" : "L");
                }
                sb.append("D");
            }
            for (int i = 0; i < C / 2; i++) {
                sb.append("DRUR");
            }
            sb.append("D");
        } else {
            int minR = 0, minC = 0;
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < R; i++) {
                for (int j = 0; j < C; j++) {
                    if ((i + j) % 2 != 0 && min > map[i][j]) {
                        min = map[i][j];
                        minR = i;
                        minC = j;
                    }
                }
            }

            int prevMinR = minR / 2 * 2; // min값이 있는 짝+홀 묶음의 짝수 행 번호가 나옴
            for (int i = 0; i < prevMinR; i++) {
                for (int j = 0; j < C - 1; j++) {
                    sb.append(i % 2 == 0 ? "R" : "L");
                }
                sb.append("D");
            }

            //min값이 있는 짝+홀 행 묶음 처리
            int curR = 0;
            for (int curC = 0; curC < C; curC++) {
                if (curC == minC) {
                    if (curC != C - 1) {
                        sb.append("R");
                    }
                    continue;
                }

                if (curR == 0) {
                    sb.append("D");
                    curR = 1;
                } else {
                    sb.append("U");
                    curR = 0;
                }

                if (curC != C - 1) {
                    sb.append("R");
                }
            }

            // 나머지 행들 처리 : 짝수 행일 때 L, 홀수 행일 때 R
            for (int i = prevMinR + 2; i < R; i++) {
                sb.append("D");
                for (int j = 0; j < C - 1; j++) {
                    sb.append(i % 2 == 0 ? "L" : "R");
                }
            }
        }
    }
    System.out.println(sb);
}
}

