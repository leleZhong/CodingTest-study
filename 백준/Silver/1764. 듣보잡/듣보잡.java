import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        HashSet<String> arrN = new HashSet<>();
        for (int i = 0; i < N; i++) {
            arrN.add(br.readLine());
        }

        int cnt = 0;
        HashSet<String> arrM = new HashSet<>();
        List<String> ans = new ArrayList<>();
        for (int i = 0; i < M; i++) {
            String input = br.readLine();
            arrM.add(input);
            if (arrN.contains(input)) {
                cnt++;
                ans.add(input);
            }
        }

        ans.sort(Comparator.naturalOrder());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < ans.size(); i++) {
            sb.append(ans.get(i)).append("\n");
        }

        System.out.println(cnt);
        System.out.print(sb);
    }
}