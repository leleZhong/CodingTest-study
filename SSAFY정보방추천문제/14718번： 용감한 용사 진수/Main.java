/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 14718                             :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: lelelzhong <boj.kr/u/lelelzhong>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/14718                          #+#        #+#      #+#    */
/*   Solved: 2025/03/09 22:40:22 by lelelzhong    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[][] enemies = new int[n][3];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 3; j++) {
                enemies[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int str, spd, intl;
        int total;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int l = 0; l < n; l++) {
                    str = enemies[i][0];
                    spd = enemies[j][1];
                    intl = enemies[l][2];
                    total = str + spd + intl;

                    int cnt = 0;
                    for (int[] enemy : enemies) {
                        if (enemy[0] <= str && enemy[1] <= spd && enemy[2] <= intl)
                            cnt++;
                    }
                    if (cnt >= k) {
                        min = Math.min(min, total);
                    }
                }
            }
        }
        
        System.out.print(min);
    }
}