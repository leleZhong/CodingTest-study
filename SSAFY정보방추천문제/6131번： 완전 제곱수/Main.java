/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 6131                              :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: lelelzhong <boj.kr/u/lelelzhong>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/6131                           #+#        #+#      #+#    */
/*   Solved: 2025/01/31 13:35:44 by lelelzhong    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int cnt = 0;
        for (int b = 1; b <= 500; b++) {
            int bSquare = b * b;
            for (int a = b; a <= 500; a++) {
                int aSquare = a * a;
                if (bSquare + n == aSquare)
                    cnt++;
            }
        }
        System.out.print(cnt);
    }
}