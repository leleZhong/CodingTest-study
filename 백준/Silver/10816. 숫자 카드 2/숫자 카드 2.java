import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[20000001];
        StringTokenizer st = new StringTokenizer(br.readLine());
        while (N-- > 0) {
            arr[Integer.parseInt(st.nextToken()) + 10000000]++;
        }

        int M = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        st = new StringTokenizer(br.readLine());
        while (M-- > 0) {
            sb.append(arr[Integer.parseInt(st.nextToken()) + 10000000]).append(" ");
        }

        System.out.print(sb);
    }
}