/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 1816                              :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: lelelzhong <boj.kr/u/lelelzhong>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/1816                           #+#        #+#      #+#    */
/*   Solved: 2025/02/13 21:29:23 by lelelzhong    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        long[] s = new long[n];

        for (int i = 0; i < n; i++) {
            s[i] = Long.parseLong(br.readLine());

            boolean isAvailable = true;
            for (int j = 2; j <= 1000000; j++) {
                if (s[i] % j == 0) {
                        isAvailable = false;
                    break;
                }
            }

            if (isAvailable)
                sb.append("YES").append("\n");
            else
                sb.append("NO").append("\n");
        }

        System.out.print(sb);
    }
}