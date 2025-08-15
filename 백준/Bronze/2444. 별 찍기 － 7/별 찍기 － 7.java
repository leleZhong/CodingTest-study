import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        int star = 1;
        int blank = N - 1;
        for (int i = 0; i < N; i++) {
            for (int b = 0; b < blank; b++) {
                sb.append(" ");
            }
            for (int s = 0; s < star; s++) {
                sb.append("*");
            }
            blank--;
            star += 2;
            sb.append("\n");
        }

        blank++;
        star -= 2;

        for (int i = 0; i < N - 1; i++) {
            blank++;
            star -= 2;
            for (int b = 0; b < blank; b++) {
                sb.append(" ");
            }
            for (int s = 0; s < star; s++) {
                sb.append("*");
            }
            sb.append("\n");
        }

        System.out.print(sb);
    }
}