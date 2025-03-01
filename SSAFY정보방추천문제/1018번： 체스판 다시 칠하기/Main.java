/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 1018                              :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: lelezhong <boj.kr/u/lelezhong>              +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/1018                           #+#        #+#      #+#    */
/*   Solved: 2025/03/01 19:45:32 by lelezhong     ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;

public class Main {
    static char[][] board;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        board = new char[n][m];
        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            board[i] = str.toCharArray();
        }

        int min = Integer.MAX_VALUE;
        for (int i = 0; i <= n - 8; i++) {
            for (int j = 0; j <= m - 8; j++) {
                int cnt = repaint(i, j);
                if (min > cnt)
                    min = cnt;
            }
        }
        System.out.println(min);
    }

    static int repaint(int y, int x) {
        int cntB = 0, cntW = 0;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                char startB = ((i + j) % 2 == 0) ? 'B' : 'W';
                char startW = ((i + j) % 2 == 0) ? 'W' : 'B';
                if (board[y + i][x + j] != startB)
                    cntB++;
                if (board[y + i][x + j] != startW)
                    cntW++;
            }
        }
        return Math.min(cntB, cntW);
    }
}