/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 15312                             :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: lelezhong <boj.kr/u/lelezhong>              +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/15312                          #+#        #+#      #+#    */
/*   Solved: 2025/03/01 17:13:29 by lelezhong     ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */
import java.io.*;

public class Main {
    static int[][] cal;
    static StringBuilder sb;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        char[] a = br.readLine().toCharArray();
        char[] b = br.readLine().toCharArray();

        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int[] stroke = {3, 2, 1, 2, 3, 3, 2, 3, 3, 2, 2, 1, 2, 2, 1, 2, 2, 2, 1, 2, 1, 1, 1, 2, 2, 1};
        cal = new int[a.length * 2 - 1][a.length * 2];

        for (int i = 0; i < a.length ; i++) {
            cal[0][2 * i] = stroke[alphabet.indexOf(a[i])];
            cal[0][2 * i + 1] = stroke[alphabet.indexOf(b[i])];
        }
        
        calculate();
        System.out.print(sb);
    }

    static void calculate() {
        for (int i = 0; i < cal.length - 1; i++) {
            for (int j = 0; j < cal[i].length - 1 - i; j++) {
                cal[i + 1][j] = (cal[i][j] + cal[i][j + 1]) % 10;
            }
        }
        sb.append(cal[cal.length - 1][0]).append(cal[cal.length - 1][1]);
    }
}