/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 1440                              :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: lelelzhong <boj.kr/u/lelelzhong>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/1440                           #+#        #+#      #+#    */
/*   Solved: 2025/02/02 21:17:54 by lelelzhong    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */
import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), ":");

        int[] clock = {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};

        int[] cases = {0, 2, 4, 6}; // cnt가 1, 2, 3일 때의 경우의 수

        int cnt = 0;
        int zero = 0;
        for (int num : clock) {
            if (num == 0)
                zero++;
            else if (num <= 12) {
                cnt++;
            }
            else if (num > 59) {
                System.out.print(cases[0]);
                return;
            }
        }
        if (zero == 3) {
            System.out.print(cases[0]);
            return;
        }
        System.out.print(cases[cnt]);
    }
}