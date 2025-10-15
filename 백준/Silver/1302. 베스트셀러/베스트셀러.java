import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        HashMap<String, Integer> map = new HashMap<>();
        String ans = null;
        int max = 0;
        while (N --> 0) {
            String s = br.readLine();
            map.put(s, map.getOrDefault(s, 0) + 1);

            int cnt = map.get(s);
            if (cnt > max || (cnt == max && (ans == null || s.compareTo(ans) < 0))) {
                max = cnt;
                ans = s;
            }
        }
        System.out.println(ans);
    }
}