import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class Main {
    static char[][] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        arr = new char[N][N];
        for (int i = 0; i < N; i++) {
            Arrays.fill(arr[i], ' ');
        }

        recur(N, 0, 0);

        StringBuilder sb = new StringBuilder();
        for (char[] tmp : arr) {
            for (char c : tmp) {
                sb.append(c);
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }

    static void recur(int n, int x, int y) {
        if (n == 3) {
            arr[x][y] = '*';
            arr[x][y + 1] = '*';
            arr[x][y + 2] = '*';
            arr[x + 1][y] = '*';
            arr[x + 1][y + 2] = '*';
            arr[x + 2][y] = '*';
            arr[x + 2][y + 1] = '*';
            arr[x + 2][y + 2] = '*';
            return;
        }

        int size = n / 3;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == 1 && j == 1) continue;
                recur(size, x + i * size, y + j * size);
            }
        }
    }
}