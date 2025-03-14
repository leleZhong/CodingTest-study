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
        tomatoes = new int[H][M][N];
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < M; j++) {
                for (int k = 0; k < N; k++) {
                    st = new StringTokenizer(br.readLine());
                    tomatoes[i][j][k] = Integer.parseInt(st.nextToken());
                }
            }
        }

        int days = 0;
        while (true) {
            boolean isAnyTomatoUnripe = false;
            for (int i = 0; i < H; i++) {
                for (int j = 0; j < M; j++) {
                    for (int k = 0; k < N; k++) {
                        if (tomatoes[i][j][k] == 0) {
                            if (!checkNearbyTomatoes(i, j, k)) {
                                System.out.print(-1);
                                return;
                            }
                            isAnyTomatoUnripe = true;
                        }
                    }
                }
            }
            if (isAnyTomatoUnripe)
                days++;
            else {
                System.out.print(days);
                return;
            }
        }
    }

    static boolean checkNearbyTomatoes(int x, int y, int z) {
        boolean isTomatoNearby = false;
        for (int i = 0; i < 6; i++) {
            int currX = x + layers[i];
            int currY = y + rows[i];
            int currZ = z + cols[i];
            if (!isValid(currX, currY, currZ) || tomatoes[currX][currY][currZ] != 1)
                continue;
            if (tomatoes[currX][currY][currZ] != -1)
                isTomatoNearby = true;
            else if (tomatoes[currX][currY][currZ] == 1)
                tomatoes[x][y][z] = 1;
        }
        return isTomatoNearby;
    }

    static boolean isValid(int x, int y, int z) {
        return x >= 0 && x < H && y >= 0 && y < M && z >= 0 && z < N;
    }
}