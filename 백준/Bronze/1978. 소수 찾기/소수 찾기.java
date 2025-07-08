import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st= new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int cnt = 0;
        for (int num : arr) {
            if (num < 2) continue;

            boolean find = true;
            for (int i = 2; i * i <= num; i++) {
                if (num % i == 0) {
                    find = false;
                    break;
                }
            }
            
            if (find)
                cnt++;
        }
        System.out.print(cnt);
    }
}