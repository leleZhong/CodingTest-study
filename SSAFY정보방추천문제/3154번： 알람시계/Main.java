/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 3154                              :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: lelezhong <boj.kr/u/lelezhong>              +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/3154                           #+#        #+#      #+#    */
/*   Solved: 2025/01/30 18:05:14 by lelezhong     ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */
import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), ":");
        int h = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int minEffort = WholeEffort(h / 10, h % 10, m / 10, m % 10);
        int minH = h;
        int minM = m;
        for (int hour = h; hour < 100; hour += 24){
            for (int min = m; min < 100; min += 60) {
                int effort = WholeEffort(hour / 10, hour % 10, min / 10, min % 10);
                if (minEffort > effort) {
                    minEffort = effort;
                    minH = hour;
                    minM = min;
                }
            }
        }
        System.out.printf("%02d:%02d", minH, minM);
    }

    public static int Effort(int a, int b) {
        int[][] keyboard = {{1, 3}, {0, 0}, {1, 0}, {2, 0}, {0, 1}, {1, 1}, {2, 1}, {0, 2},
                            {1, 2}, {2, 2}};
        int xa, xb, ya, yb;
        xa = keyboard[a][0];
        ya = keyboard[a][1];
        xb = keyboard[b][0];
        yb = keyboard[b][1];
        return Math.abs(xa - xb) + Math.abs(ya - yb);
    }

    public static int WholeEffort(int a, int b, int c, int d) {
        return Effort(a, b) + Effort(b, c) + Effort(c, d);
    }
}