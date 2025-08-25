import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] arr = br.readLine().toCharArray();

        char[][] mbti = { { 'E', 'I' }, { 'S', 'N' }, { 'T', 'F' }, { 'J', 'P' } };

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 2; j++) {
                if (arr[i] == mbti[i][j]) {
                    sb.append(mbti[i][(j + 1) % 2]);
                }
            }
        }

        System.out.print(sb);
    }
}