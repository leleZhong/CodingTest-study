import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        HashSet<Character> set = new HashSet<>();
        for (char c : br.readLine().toCharArray()) {
            set.add(c);
        }

        br.readLine();
        for (char c : br.readLine().toCharArray()) {
            set.add(c);
        }

        br.readLine();
        for (char c : br.readLine().toCharArray()) {
            if (set.contains(c)) {
                set.remove(c);
            }
        }
        br.readLine();
        String delim = set.toString();
        StringTokenizer st = new StringTokenizer(br.readLine(), delim + " ");
        StringBuilder sb = new StringBuilder();
        while (st.hasMoreTokens()) {
            sb.append(st.nextToken()).append("\n");
        }

        System.out.print(sb);
    }
}