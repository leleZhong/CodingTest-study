import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();
        for (int t = 0; t < 4; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] first = new int[4];
            int[] second = new int[4];
            for (int i = 0; i < 4; i++) {
                first[i] = Integer.parseInt(st.nextToken());
            }
            for (int i = 0; i < 4; i++) {
                second[i] = Integer.parseInt(st.nextToken());
            }

            if (first[0] > second[2] || first[1] > second[3] || first[2] < second[0] || first[3] < second[1]) {
                sb.append("d");
            } else if ((first[1] == second[3] || first[3] == second[1])
                    && (first[2] == second[0] || first[0] == second[2])) {
                sb.append("c");
            } else if (first[1] == second[3] || first[3] == second[1] || first[2] == second[0] || first[0] == second[2]) {
                sb.append("b");
            } else {
                sb.append("a");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}