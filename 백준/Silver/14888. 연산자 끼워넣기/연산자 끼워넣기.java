import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    static int N;
    static int[] arr;
    static int[] operand;

    static int[] tmp;
    static int max = -Integer.MAX_VALUE;
    static int min = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        operand = new int[4];
        for (int i = 0; i < 4; i++) {
            operand[i] = Integer.parseInt(st.nextToken());
        }

        tmp = new int[N - 1];
        recur(0);

        System.out.println(max + "\n" + min);
    }

    static void recur(int depth) {
        if (depth == N - 1) {
            int result = calculate();
            max = Math.max(max, result);
            min = Math.min(min, result);
            return;
        }

        for (int i = 0; i < 4; i++) {
            if (operand[i] > 0) {
                operand[i]--;
                tmp[depth] = i;
                recur(depth + 1);
                operand[i]++;
            }
        }
    }

    static int calculate() {
        int res = arr[0];
        for (int i = 0; i < N - 1; i++) {
            switch (tmp[i]) {
                case 0:
                    res += arr[i + 1];
                    break;
                case 1:
                    res -= arr[i + 1];
                    break;
                case 2:
                    res *= arr[i + 1];
                    break;
                case 3:
                    res /= arr[i + 1];
                    break;
            }
        }

        return res;
    }
}