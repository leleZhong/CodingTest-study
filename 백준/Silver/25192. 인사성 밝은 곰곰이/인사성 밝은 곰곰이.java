import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int cnt = 0;
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            if (s.equals("ENTER"))
                set.clear();
            else {
                if (set.add(s))
                    cnt++;
            }
        }
        System.out.print(cnt);
    }
}