/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 7569                              :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: lelelzhong <boj.kr/u/lelelzhong>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/7569                           #+#        #+#      #+#    */
/*   Solved: 2025/03/14 21:01:04 by lelelzhong    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int M, N, H;
    static int[][][] tomatoes;
    static int[] layers = {1, -1, 0, 0, 0, 0};
    static int[] rows = {0, 0, 1, -1, 0, 0};
    static int[] cols = {0, 0, 0, 0, 1, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        H = Integer.parseInt(st.nextToken());
        tomatoes = new int[H][N][M];
        Queue<int[]> queue = new LinkedList<>();

        int unripeCnt = 0;
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < N; j++) {
                st = new StringTokenizer(br.readLine());
                for (int k = 0; k < M; k++) {
                    tomatoes[i][j][k] = Integer.parseInt(st.nextToken());
                    if (tomatoes[i][j][k] == 1)
                        queue.offer(new int[]{i, j, k, 0});
                    else if (tomatoes[i][j][k] == 0)
                        unripeCnt++;
                }
            }
        }

        if (unripeCnt == 0) {
            System.out.print(0);
            return;
        }

        int days = 0;
        while (!queue.isEmpty()) {
            int[] curr = queue.poll();
            int x = curr[0], y = curr[1], z = curr[2], day = curr[3];
            for (int i = 0; i < 6; i++) {
                int nx = x + layers[i];
                int ny = y + rows[i];
                int nz = z + cols[i];

                if (isValid(nx, ny, nz) && tomatoes[nx][ny][nz] == 0) {
                    tomatoes[nx][ny][nz] = 1;
                    queue.offer(new int[]{nx, ny, nz, day + 1});
                    days = Math.max(days, day + 1);
                    unripeCnt--;
                }
            }
        }
        System.out.print(unripeCnt == 0 ? days : -1);
    }

    static boolean isValid(int x, int y, int z) {
        return x >= 0 && x < H && y >= 0 && y < N && z >= 0 && z < M;
    }
}