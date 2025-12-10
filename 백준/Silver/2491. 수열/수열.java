import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int[] big = new int[N];
        int[] small = new int[N];
        Arrays.fill(big, 1);
        Arrays.fill(small, 1);

        for (int i = 1; i < N; i++) {
            if (arr[i] >= arr[i - 1]) {
                big[i] = big[i - 1] + 1;
            }

            if (arr[i] <= arr[i - 1]) {
                small[i] = small[i - 1] + 1;
            }
        }

        Arrays.sort(big);
        Arrays.sort(small);
        System.out.println(Math.max(big[N - 1], small[N - 1]));
    }
}