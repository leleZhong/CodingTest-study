/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 17290                             :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: lelelzhong <boj.kr/u/lelelzhong>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/17290                          #+#        #+#      #+#    */
/*   Solved: 2025/03/04 17:31:42 by lelelzhong    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static boolean[][] unsafe;
    static int r, c;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        r = Integer.parseInt(st.nextToken()) - 1;
        c = Integer.parseInt(st.nextToken()) - 1;
        char[][] field = new char[10][10];
        for (int i = 0; i < 10; i++) {
            field[i] = br.readLine().toCharArray();
        }

        unsafe = new boolean[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (field[i][j] == 'o')
                    boom(i, j);
            }
        }

        int min = calculate();
        System.out.print(min);
    }

    static void boom(int i, int j) {
        for (int row = 0; row < 10; row++) {
            unsafe[row][j] = true;
        }
        for (int col = 0; col < 10; col++) {
            unsafe[i][col] = true;
        }
    }

    static int calculate() {
        int min = Integer.MAX_VALUE;
        int tmp = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (!unsafe[i][j]) {
                    tmp = Math.abs(i - r) + Math.abs(j - c);
                    min = Math.min(min, tmp);
                }
            }
        }
        return min;
    }
}