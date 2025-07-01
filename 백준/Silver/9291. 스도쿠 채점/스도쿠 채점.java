import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        for (int tc = 1; tc <= T; tc++) {
            sb.append("Case ").append(tc).append(": ");
            
            int[][] arr = new int[9][9];
            for (int i = 0; i < 9; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                for (int j = 0; j < 9; j++) {
                    arr[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            sb.append(find(arr) ? "CORRECT" : "INCORRECT").append("\n");
            
            br.readLine();
        }
        System.out.print(sb);
    }

    static boolean find(int[][] arr) {
        // 가로
        boolean[] row = new boolean[10];
        for (int i = 0; i < 9; i++) {
            Arrays.fill(row, false);
            for (int j = 0; j < 9; j++) {
                if (row[arr[i][j]]) {
                    return false;
                }
                row[arr[i][j]] = true;
            }
        }

        // 세로
        boolean[] col = new boolean[10];
        for (int i = 0; i < 9; i++) {
            Arrays.fill(col, false);
            for (int j = 0; j < 9; j++) {
                if (col[arr[j][i]]) {
                    return false;
                }
                col[arr[j][i]] = true;
            }
        }

        // 3x3
        boolean[] three = new boolean[10];
        for (int i = 0; i < 9; i += 3) {
            for (int j = 0; j < 9; j += 3) {
                Arrays.fill(three, false);
                for (int x = 0; x < 3; x++) {
                    for (int y = 0; y < 3; y++) {
                        if (three[arr[i + x][j + y]]) {
                            return false;
                        }
                        three[arr[i + x][j + y]] = true;
                    }
                }
            }
        }

        return true;
    }
}