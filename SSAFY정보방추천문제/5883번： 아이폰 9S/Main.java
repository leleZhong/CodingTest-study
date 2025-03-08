/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 5883                              :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: lelelzhong <boj.kr/u/lelelzhong>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/5883                           #+#        #+#      #+#    */
/*   Solved: 2025/03/08 22:57:24 by lelelzhong    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] b = new int[n];
        Set<Integer> num = new HashSet<>();
        for (int i = 0; i < n; i++) {
            b[i] = Integer.parseInt(br.readLine());
            num.add(b[i]);
        }

        int max = 0;
        for (int i : num) {
            int cnt = 1;
            int pre = -1;
            for (int j = 0; j < n; j++) {
                if (i == b[j])
                    continue;
                if (pre == b[j])
                    cnt++;
                else {
                    max = Math.max(max, cnt);
                    cnt = 1;
                    pre = b[j];
                }
            }
            max = Math.max(max, cnt);
        }
        System.out.print(max);
    }
}