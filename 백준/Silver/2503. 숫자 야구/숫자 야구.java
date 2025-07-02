import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] arr = new int[N][3];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 3; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int cnt = 0;
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                if (i == j)
                    continue;
                for (int k = 1; k <= 9; k++) {
                    if (i == k || j == k)
                        continue;
                    boolean possible = true;
                    for (int[] a : arr) {
                        int strike = 0;
                        int ball = 0;
                        int num = a[0];
                        int z = num % 10;
                        num /= 10;
                        int y = num % 10;
                        num /= 10;
                        int x = num % 10;

                        if (x == i)
                            strike++;
                        else if (x == j || x == k)
                            ball++;

                        if (y == j)
                            strike++;
                        else if (y == i || y == k)
                            ball++;

                        if (z == k)
                            strike++;
                        else if (z == i || z == j)
                            ball++;

                        if (strike != a[1] || ball != a[2]) {
                            possible = false;
                            break;
                        }
                    }
                    if (possible)
                        cnt++;
                }
            }
        }
        System.out.print(cnt);
    }
}