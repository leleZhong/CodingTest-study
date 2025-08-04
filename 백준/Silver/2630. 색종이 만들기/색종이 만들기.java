import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N;
    static int[][] arr;
    static int cntW = 0, cntB = 0;;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        arr = new int[N][N];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        dfs(N, 0, 0);

        System.out.print(cntW + "\n" + cntB);
    }

    static void dfs(int size, int row, int col) {
        boolean allWhite = true, allBlue = true;
        for (int i = row; i < row + size; i++) {
            for (int j = col; j < col + size; j++) {
                if (arr[i][j] == 0) {
                    allBlue = false;
                } else {
                    allWhite = false;
                }
            }
            
            if (!allBlue && !allWhite) {
                break;
            }
        }

        if (allWhite) {
            cntW++;
            return;
        } else if (allBlue) {
            cntB++;
            return;
        } else {
            int next = size / 2;
            dfs(next, row, col);
            dfs(next, row, col + next);
            dfs(next, row + next, col);
            dfs(next, row + next, col + next);
        }
    }
}