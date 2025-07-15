import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            list.add(i);
        }

        StringBuilder sb = new StringBuilder();
        sb.append("<");
        int idx = K - 1;
        while (!list.isEmpty()) {
            sb.append(list.remove(idx));
            if (list.size() > 0) {
                sb.append(", ");
            }
            else {
                sb.append(">");
                break;
            }
            idx = (idx + K - 1) % list.size();
        }
        System.out.print(sb);
    }
}