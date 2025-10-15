import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map.Entry;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        HashMap<String, Integer> map = new HashMap<>();
        while (N --> 0) {
            String s = br.readLine();
            map.put(s, map.getOrDefault(s, 0) + 1);
        }

        String ans = null;
        int max = 0;
        for (Entry<String, Integer> e : map.entrySet()) {
            int cnt = e.getValue();
            if (cnt > max || (cnt == max && (ans == null || e.getKey().compareTo(ans) < 0))) {
                max = cnt;
                ans = e.getKey();
            }
        }

        System.out.println(ans);
    }
}