import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int tc = 1; tc <= T; tc++) {
            sb.append("Case #").append(tc).append(": ");
            int N = Integer.parseInt(br.readLine());
            if (N == 0) {
                sb.append("INSOMNIA").append("\n");
                continue;
            }
            sb.append(search(N)).append("\n");
        }
        System.out.println(sb);
    }

    static int search(int N) {
        boolean[] record = new boolean[10];

        int nN = N;
        while (true) {
            int tmp = nN;
            while (tmp > 0) {
                record[tmp % 10] = true;
                tmp /= 10;
            }

            boolean valid = true;
            for (int i = 0; i < 10; i++) {
                if (!record[i]) {
                    valid = false;
                    break;
                }
            }

            if (valid) {
                return nN;
            }
            nN += N;
        }
    }
}