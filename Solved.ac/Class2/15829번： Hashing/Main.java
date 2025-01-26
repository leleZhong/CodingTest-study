/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 15829                             :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: lelezhong <boj.kr/u/lelezhong>              +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/15829                          #+#        #+#      #+#    */
/*   Solved: 2025/01/26 14:31:50 by lelezhong     ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        int r = 31;
        long m = 1234567891;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int l = Integer.parseInt(br.readLine());
        char[] chars = br.readLine().toCharArray();

        long sum = 0;
        long pow = 1;
        for (int i = 0; i < l; i++) {
            sum += (chars[i] - 'a' + 1) * pow % m;
            pow = pow % m * r;
        }
        System.out.println(sum % m);
    }
}