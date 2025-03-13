/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 16955                             :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: lelelzhong <boj.kr/u/lelelzhong>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/16955                          #+#        #+#      #+#    */
/*   Solved: 2025/03/10 17:35:50 by lelelzhong    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static char[][] board;
    static int[] row = {1, 0, 1, -1};
    static int[] col = {0, 1, 1, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        board = new char[10][10];
        for (int i = 0; i < 10; i++) {
            board[i] = br.readLine().toCharArray();
        }
        
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (board[i][j] == '.') {
                    board[i][j] = 'X';
                    if (checkSequence(i, j)) {
                        System.out.print(1);
                        return;
                    }
                    board[i][j] = '.';
                }
            }
        }
        System.out.print(0);
    }

    static boolean checkSequence(int x, int y) {
        for (int i = 0; i < 4; i++) {
            int cnt = 1;
            for (int step = 1; step < 5; step++) {
                int currX = x + row[i] * step;
                int currY = y + col[i] * step;
                if (!isValid(currX, currY) || board[currX][currY] != 'X')
                    break;
                cnt++;
            }

            for (int step = 1; step < 5; step++) {
                int currX = x - row[i] * step;
                int currY = y - col[i] * step;
                if (!isValid(currX, currY) || board[currX][currY] != 'X')
                    break;
                cnt++;
            }

            if (cnt >= 5)
                return true;
        }
        return false;
    }

    static boolean isValid(int x, int y) {
        return x >= 0 && x <= 9 && y >= 0 && y <= 9;
    }
}