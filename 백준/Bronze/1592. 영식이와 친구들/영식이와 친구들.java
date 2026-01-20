import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];
        int cnt = 0;
        int idx = 0;
        while (true) {
            if (++arr[idx] == M) {
                break;
            }

            cnt++; // 공 던지기
            if (arr[idx] % 2 == 0) {
                idx = (idx + N - L) % N;
            } else {
                idx = (idx + L) % N;
            }
        }

        System.out.println(cnt);
    }
}