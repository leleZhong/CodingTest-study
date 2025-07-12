import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int num = 0;
    static int r, c;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        r = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());

        int num = 0;
        for (int n = N; n > 0; n--) {
            int size = (int) Math.pow(2, n);
            int location = r < size / 2 ? c < size / 2 ? 0 : 1 : c < size / 2 ? 2 : 3;
            num += (int) Math.pow(4, n - 1) * location;

            int scale = (int) Math.pow(2, n - 1);
            r = r >= scale ? r - scale : r;
            c = c >= scale ? c - scale : c;
        }

        System.out.print(num + 2 * r + c);
    }
}