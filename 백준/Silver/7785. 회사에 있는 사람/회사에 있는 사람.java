import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        TreeSet<String> set = new TreeSet<>(Collections.reverseOrder());
        while (N --> 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            if (st.nextToken().equals("enter")) {
                set.add(name);
            } else {
                set.remove(name);
            }
        }

        StringBuilder sb = new StringBuilder();
        for (String s : set) {
            sb.append(s).append("\n");
        }

        System.out.print(sb);
    }
}