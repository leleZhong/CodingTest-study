/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 1193                              :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: lelelzhong <boj.kr/u/lelelzhong>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/1193                           #+#        #+#      #+#    */
/*   Solved: 2025/02/18 22:51:50 by lelelzhong    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());

        int i = 1;
        int numerator = 1;  // 분자
        int denominator = 1;    // 분모
        while (i != x) {
            if ((numerator + denominator) % 2 == 0) {
                if (numerator == 1) {
                    denominator++;
                    i++;
                }
                else {
                    numerator--;
                    denominator++;
                    i++;
                }
            }
            else {
                if (denominator == 1) {
                    numerator++;
                    i++;
                }
                else {
                    denominator--;
                    numerator++;
                    i++;
                }
            }
        }
        System.out.printf("%d/%d", numerator, denominator);
    }
}