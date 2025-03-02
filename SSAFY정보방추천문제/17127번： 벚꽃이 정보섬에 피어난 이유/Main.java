/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 17127                             :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: lelezhong <boj.kr/u/lelezhong>              +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/17127                          #+#        #+#      #+#    */
/*   Solved: 2025/03/02 14:10:27 by lelezhong     ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] cherryBlossom = new int[n];
        for (int i = 0; i < n; i++) {
            cherryBlossom[i] = Integer.parseInt(st.nextToken());
        }

        int max = 0;
        for (int i = 1; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    int tmp = 1;
                    int sum = 0;
                    for (int w = 0; w < i; w++) {
                        tmp *= cherryBlossom[w];
                    }
                    sum += tmp;
                    tmp = 1;
                    for (int x = i; x < j; x++) {
                        tmp *= cherryBlossom[x];
                    }
                    sum += tmp;
                    tmp = 1;
                    for (int y = j; y < k; y++) {
                        tmp *= cherryBlossom[y];
                    }
                    sum += tmp;
                    tmp = 1;
                    for (int z = k; z < n; z++) {
                        tmp *= cherryBlossom[z];
                    }
                    sum += tmp;
                    max = Math.max(max, sum);
                }
            }
        }
        System.out.print(max);
    }
}