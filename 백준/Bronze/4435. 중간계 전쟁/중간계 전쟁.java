import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        int[] gandalf = {1, 2, 3, 3, 4, 10};
        int[] sauron = {1, 2, 2, 2, 3, 5, 10};
        String g = "Good triumphs over Evil";
        String s = "Evil eradicates all trace of Good";
        String n = "No victor on this battle field";

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int battleG = 0;
            for (int j = 0; j < gandalf.length; j++) {
                battleG += Integer.parseInt(st.nextToken()) * gandalf[j];
            }

            st = new StringTokenizer(br.readLine());
            int battleS = 0;
            for (int j = 0; j < sauron.length; j++) {
                battleS += Integer.parseInt(st.nextToken()) * sauron[j];
            }

            sb.append("Battle ").append(i).append(": ");
            if (battleG > battleS)
                sb.append(g).append("\n");
            else if (battleG < battleS) 
                sb.append(s).append("\n");
            else
                sb.append(n).append("\n");
        }

        System.out.print(sb);
    }
}