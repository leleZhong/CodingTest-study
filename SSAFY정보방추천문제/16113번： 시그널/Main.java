/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 16113                             :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: lelelzhong <boj.kr/u/lelelzhong>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/16113                          #+#        #+#      #+#    */
/*   Solved: 2025/02/04 20:46:48 by lelelzhong    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */
import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        String signal = br.readLine();

        int[][] decode = new int[5][n / 5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < n / 5; j++) {
                decode[i][j] = signal.charAt(i * (n / 5) + j) == '#' ? 1 : 0;
            }
        }

        int col = 0;
        while (col < n / 5) {
            if (decode[0][col] == 0) {
                col++;
                continue;
            }

            if (col == n / 5 - 1) {
                sb.append(1);
                break;
            }

            if (decode[0][col + 1] == 0) {
                if (decode[3][col] == 1) {
                    sb.append(1);
                    col += 1;
                }
                else {
                    sb.append(4);
                    col += 3;
                }
            }
            else {
                if (decode[1][col] == 1 && decode[1][col+ 2] == 1) {
                    if (decode[2][col+1] == 0)
                        sb.append(0);
                    else {
                        if (decode[3][col] == 1)
                            sb.append(8);
                        else
                            sb.append(9);
                    }
                }
                else if (decode[1][col] == 0 && decode[1][col+ 2] == 1) {
                    if (decode[2][col] == 0)
                        sb.append(7);
                    else {
                        if (decode[3][col] == 1)
                            sb.append(2);
                        else
                            sb.append(3);
                    }
                }
                else {
                    if (decode[3][col] == 0)
                        sb.append(5);
                    else
                        sb.append(6);
                }
                col += 3;
            }
        }
        System.out.print(sb);
    }
}