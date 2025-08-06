import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        HashMap<String, Integer> map1 = new HashMap<>();
        HashMap<Integer, String> map2 = new HashMap<>();
        for (int i = 1; i <= N; i++) {
            String s = br.readLine();
            map1.put(s, i);
            map2.put(i, s);
        }

        StringBuilder sb = new StringBuilder();
        while (M --> 0) {
            String s = br.readLine();
            if (s.charAt(0) > '9') {
                sb.append(map1.get(s));
            } else {
                sb.append(map2.get(Integer.parseInt(s)));
            }
            sb.append("\n");
        }

        System.out.print(sb);
    }
}