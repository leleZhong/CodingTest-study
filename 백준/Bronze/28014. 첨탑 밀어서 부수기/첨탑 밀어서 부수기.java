import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int cnt = 0;
        int before = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        while (N --> 0) {
            int num = Integer.parseInt(st.nextToken());
            if (before <= num) {
                cnt++;
            }

            before = num;
        }

        System.out.println(cnt);
    }
}