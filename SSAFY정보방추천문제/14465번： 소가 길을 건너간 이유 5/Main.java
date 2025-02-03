/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 14465                             :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: lelelzhong <boj.kr/u/lelelzhong>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/14465                          #+#        #+#      #+#    */
/*   Solved: 2025/02/03 23:45:05 by lelelzhong    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        boolean[] broken = new boolean[n + 1];
        for (int i = 0; i < b; i++) {
            int j =Integer.parseInt(br.readLine());
            broken[j] = true;
        }

        int cnt = 0;
        for (int i = 1; i <= k; i++) {
            if (broken[i])
                cnt++;
        }
        int min = cnt;

        for (int i = 2; i <= n - k + 1; i++) {
            if (broken[i - 1])
                cnt--;
            if (broken[i + k - 1])
                cnt++;
            if (cnt < min)
                min = cnt;
        }
        System.out.print(min);
    }
}