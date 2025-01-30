/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 3003                              :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: lelezhong <boj.kr/u/lelezhong>              +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/3003                           #+#        #+#      #+#    */
/*   Solved: 2025/01/30 13:20:55 by lelezhong     ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */
import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int[] black = {1, 1, 2, 2, 2, 8};
        for (int i = 0; i < black.length; i++) {
            sb.append(black[i] - Integer.parseInt(st.nextToken())).append(" ");
        }
        System.out.print(sb);
        br.close();
    }
}