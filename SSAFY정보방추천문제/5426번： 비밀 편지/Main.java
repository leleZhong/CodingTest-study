/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 5426                              :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: lelelzhong <boj.kr/u/lelelzhong>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/5426                           #+#        #+#      #+#    */
/*   Solved: 2025/02/27 13:23:30 by lelelzhong    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static StringBuilder sb;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());

        for (int tc = 0; tc < t; tc++) {
            char[] input = br.readLine().toCharArray();
            int len = 0;
            for (int i = 0; i <= input.length; i++) {
                if (i * i == input.length) {
                    len = i;
                    break;
                }
            }

            char[][] cyper = new char[len][len];
            for (int i = 0; i < len; i++) {
                for (int j = 0; j < len; j++) {
                    cyper[i][j] = input[i * len + j];
                }
            }

            for (int j = cyper.length - 1; j >= 0; j--) {
                for (int i = 0; i < cyper.length; i++) {
                    sb.append(cyper[i][j]);
                }
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}