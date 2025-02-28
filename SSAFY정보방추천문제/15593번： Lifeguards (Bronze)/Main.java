/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 15593                             :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: lelelzhong <boj.kr/u/lelelzhong>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/15593                          #+#        #+#      #+#    */
/*   Solved: 2025/02/28 20:40:09 by lelelzhong    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        int[][] guards = new int[n][2];
        int[] num = new int[1001];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            guards[i][0] = Integer.parseInt(st.nextToken());
            guards[i][1] = Integer.parseInt(st.nextToken());
            for (int j = guards[i][0]; j < guards[i][1]; j++) {
                num[j]++;
            }
        }

        int total = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] > 0)
                total++;
        }

        int max = 0;
        for (int i = 0; i < n; i++) {
            int start = guards[i][0];
            int end = guards[i][1];

            int except = 0;
            for (int j = start; j < end; j++) {
                if (num[j] == 1)
                    except++;
            }

            int cnt = total - except;
            if (max < cnt)
                max = cnt;
        }
        System.out.print(max);
    }
}