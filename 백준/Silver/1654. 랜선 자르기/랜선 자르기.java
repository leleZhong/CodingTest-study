import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int K = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        long[] lan = new long[K];
        for (int i = 0; i < K; i++) {
            lan[i] = Long.parseLong(br.readLine());
        }
        Arrays.sort(lan);

        long mid = 0;
        long left = 1, right = lan[K - 1];
        int cnt = 0;
        while (left <= right) {
            mid = (left + right) / 2;

            for (int i = 0; i < K; i++) {
                cnt += lan[i] / mid;
            }
            if (cnt >= N) 
                left =  mid + 1;
            else
                right = mid - 1;
            cnt = 0;
        }
        System.out.print(right);
    }
}