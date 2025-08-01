import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;
        int[] arr = new int[3];
        StringBuilder sb = new StringBuilder();
        while (!(s = br.readLine()).equals("0 0 0")) {
            StringTokenizer st = new StringTokenizer(s);
            arr[0] = Integer.parseInt(st.nextToken());
            arr[1] = Integer.parseInt(st.nextToken());
            arr[2] = Integer.parseInt(st.nextToken());
            Arrays.sort(arr);

            sb.append((arr[0] * arr[0] + arr[1] * arr[1]) == arr[2] * arr[2] ? "right" : "wrong").append("\n");
        }

        System.out.print(sb);
    }
}