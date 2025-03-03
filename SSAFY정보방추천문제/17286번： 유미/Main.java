/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 17286                             :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: lelelzhong <boj.kr/u/lelelzhong>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/17286                          #+#        #+#      #+#    */
/*   Solved: 2025/03/03 13:31:24 by lelelzhong    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[][] points = new int[4][2];
    static double[][] dist = new double[4][4];
    static boolean[] isVisited = new boolean[4];
    static int[] order = new int[3]; // 선택된 순서 저장
    static int min = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        for (int i = 0; i < 4; i++) {
            st = new StringTokenizer(br.readLine());
            points[i][0] = Integer.parseInt(st.nextToken());
            points[i][1] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < 4; i++) {
            for (int j = i + 1; j < 4; j++) {
                dist[i][j] = dist[j][i] = getDistance(points[i], points[j]);
            }
        }

        selectOrder(0);
        System.out.print(min);
    }

    static double getDistance(int[] start, int[] end) {
        int dx = start[0] - end[0];
        int dy = start[1] - end[1];
        return Math.sqrt(dx * dx + dy * dy);
    }

    static void selectOrder(int depth) {
        if (depth == 3) {
            min = Math.min(min, calculate());
            return;
        }
        
        for (int i = 1; i < 4; i++) {
            if (!isVisited[i]) {
                isVisited[i] = true;
                order[depth] = i;
                selectOrder(depth + 1);
                isVisited[i] = false;
            }
        }
    }

    static int calculate() {
        double sum = 0;
        int curr = 0;

        for (int i = 0; i < 3; i++) {
            sum += dist[curr][order[i]];
            curr = order[i];
        }
        return (int) sum;
    }
}