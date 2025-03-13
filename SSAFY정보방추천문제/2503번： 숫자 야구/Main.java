/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 2503                              :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: lelelzhong <boj.kr/u/lelelzhong>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/2503                           #+#        #+#      #+#    */
/*   Solved: 2025/03/13 22:05:31 by lelelzhong    ###          ###   ##.kr    */
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
        int[][] question = new int[n][3];
        int[] strikes = new int[n];
        int[] balls = new int[n];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String num = st.nextToken();
            for (int j = 0; j < 3; j++) {
                question[i][j] = num.charAt(j) - '0';
            }
            strikes[i] = Integer.parseInt(st.nextToken());
            balls[i] = Integer.parseInt(st.nextToken());
        }

        int cnt = 0;
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                if (i == j) {
                    continue;
                }
                for (int k = 1; k < 10; k++) {
                    if (i == k || j == k)
                        continue;
                    
                    int[] current = {i, j, k};
                    boolean isEqual = true;
                    for (int m = 0; m < n; m++) {
                        int[] strikeBall = getStrikeBall(current, question[m]);
                        if (strikes[m] != strikeBall[0] || balls[m] != strikeBall[1]) {
                            isEqual = false;
                            break;
                        }
                    }
                    if (isEqual)
                        cnt++;
                }
            }
        }
        System.out.print(cnt);
    }
    
    static int[] getStrikeBall(int[] tmp, int[] question) {
        int strike = 0;
        int ball = 0;

        for (int i = 0; i < 3; i++) {
            if (tmp[i] == question[i])
                strike++;
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i != j && tmp[i] == question[j])
                    ball++;
            }
        }
        return new int[] {strike, ball};
    }
}