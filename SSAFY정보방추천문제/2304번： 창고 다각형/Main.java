/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 2304                              :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: lelelzhong <boj.kr/u/lelelzhong>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/2304                           #+#        #+#      #+#    */
/*   Solved: 2025/03/09 10:38:50 by lelelzhong    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        int[][] pillar = new int[n][2];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            pillar[i][0] = Integer.parseInt(st.nextToken());
            pillar[i][1] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(pillar, new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b) {
                return Integer.compare(a[0], b[0]);
            }
        });

        int area = 0;

        int leftPos = pillar[0][0];
        int leftMax = pillar[0][1];
        for (int i = 1; i < n; i++) {
            if (leftMax < pillar[i][1]) {
                area += (pillar[i][0] - leftPos) * leftMax;
                leftPos = pillar[i][0];
                leftMax = pillar[i][1];
            }
        }

        int rightPos = pillar[n - 1][0];
        int rightMax = pillar[n - 1][1];
        for (int i = n - 2; i >= 0; i--) {
            if (rightMax < pillar[i][1]) {
                area += (rightPos - pillar[i][0]) * rightMax;
                rightPos = pillar[i][0];
                rightMax = pillar[i][1];
            }
        }

        area += (rightPos - leftPos + 1) * leftMax;
        System.out.print(area);
    }
}