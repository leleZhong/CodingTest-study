import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[5];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[Integer.parseInt(st.nextToken())]++;
        }

        int cnt = arr[4];
        cnt += arr[3];
        if (arr[3] >= arr[1]) {
            arr[3] = 0;
            arr[1] = 0;
        } else {
            arr[1] -= arr[3];
            arr[3] = 0;
        }

        cnt += arr[2] / 2;
        if (arr[2] % 2 == 0) {
            arr[2] = 0;
        } else {
            arr[2] = 1;
        }

        if (arr[2] > 0) {
            cnt++;
            if (arr[1] >= 2) {
                arr[1] -= 2;
            }
        }

        cnt += arr[1] / 4;
        if (arr[1] % 4 == 0) {
            arr[1] %= 4;
        }
        if (arr[1] > 0) {
            cnt++;
        }
        
        System.out.println(cnt);
    }
}