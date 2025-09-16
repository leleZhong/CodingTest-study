import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        HashSet<Integer> set = new HashSet<>();
        st = new StringTokenizer(br.readLine());
        while (A --> 0) {
            set.add(Integer.parseInt(st.nextToken()));
        }

        int cnt = 0;
        st = new StringTokenizer(br.readLine());
        while (B --> 0) {
            if (!set.remove(Integer.parseInt(st.nextToken()))) {
                cnt++;
            }
        }

        cnt += set.size();
        System.out.print(cnt);
    }
}