/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 16283                             :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: lelelzhong <boj.kr/u/lelelzhong>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/16283                          #+#        #+#      #+#    */
/*   Solved: 2025/02/07 20:28:32 by lelelzhong    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */
import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());

        int cnt_s = 0, cnt_g = 0; // ¾ç, ¿°¼Ò
        int tmp = 0;
        for (int i = 1; i < n; i++) {
            int j = n - i;
            if (i * a + j * b == w) {
                cnt_s = i;
                cnt_g = j;
                tmp++;
            }
        }
        if (tmp == 1)
            System.out.printf("%d %d", cnt_s, cnt_g);
        else
            System.out.print(-1);
    }
}