import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int max = 1000000;
        boolean[] primeCheck = new boolean[max + 1];
        primeCheck[0] = primeCheck[1] = true;
        for (int i = 2; i * i <= max; i++) {
            if (!primeCheck[i]) {
                for (int j = i * i; j <= max; j += i) {
                    primeCheck[j] = true;
                }
            }
        }

        int[] count = new int[max + 1];
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 2; i <= max; i++) {
            if (!primeCheck[i]) {
                list.add(i);
                count[i] = count[i - 1] + 1;
            } else {
                count[i] = count[i - 1];
            }
        }

        StringBuilder sb = new StringBuilder();
        while (N-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            int k = count[b] - count[a - 1];
            if (k % 2 == 0 || k == 0) {
                sb.append(-1);
            } else {
                sb.append(list.get(count[a - 1] + k / 2));
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }
}