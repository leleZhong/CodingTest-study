import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    static final int MOD = 1000000007;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());

        if (n == 0) {
            System.out.println(0);
            return;
        }

        long[][] base = { { 1, 1 }, { 1, 0 } };
        long[][] result = pow(base, n);
        System.out.println(result[0][1]);
    }

    static long[][] pow(long[][] matrix, long n) {
        if (n == 1) {
            return matrix;
        }

        long[][] half = pow(matrix, n / 2);
        long[][] result = multiply(half, half);
        if (n % 2 != 0) {
            result = multiply(result, matrix);
        }
        return result;
    }

    static long[][] multiply(long[][] A, long[][] B) {
        long[][] result = new long[2][2];

        for (int i = 0; i <= 1; i++) {
            for (int j = 0; j <= 1; j++) {
                for (int k = 0; k <= 1; k++) {
                    result[i][j] += A[i][k] * B[k][j];
                    result[i][j] %= MOD;
                }
            }
        }
        return result;
    }
}