import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] player = {Integer.parseInt(st.nextToken()) - 1, Integer.parseInt(st.nextToken()) - 1};    // 배열이 1부터 시작하므로 보정
        char[][] map = new char[10][10];
        for (int i = 0; i < 10; i++) {
            map[i] = br.readLine().toCharArray();
        }

        boolean[][] unsafe = new boolean[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (map[i][j] == 'o') {
                    for (int k = 0; k < 10; k++) {
                        unsafe[i][k] = true;
                        unsafe[k][j] = true;
                    }
                }
            }
        }

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (!unsafe[i][j]) {
                    min = Math.min(min, Math.abs(player[0] - i) + Math.abs(player[1] - j));
                }
            }
        }

        System.out.print(min);
    }
}