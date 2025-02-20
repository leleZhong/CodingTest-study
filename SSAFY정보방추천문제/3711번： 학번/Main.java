/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 3711                              :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: lelelzhong <boj.kr/u/lelelzhong>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/3711                           #+#        #+#      #+#    */
/*   Solved: 2025/02/20 17:24:40 by lelelzhong    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            int g = Integer.parseInt(br.readLine());
            int[] num = new int[g];
            for (int j = 0; j < g; j++) {
                num[j] = Integer.parseInt(br.readLine());
            }

            int m = g;
            while (true) {
                Set<Integer> remain = new HashSet<>();
                boolean isUnique = true;
                for (int j = 0; j < g; j++) {
                    int rem = num[j] % m;
                    if (!remain.add(rem)) {
                        isUnique = false;
                        break;
                    }
                }
                if (isUnique) {
                    sb.append(m).append("\n");
                    break;
                }
                m++;
            }
        }
        System.out.print(sb);
    }
}