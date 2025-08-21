import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // (학점 * 과목평점)sum / 학점 sum
        double sumA = 0;
        double sumB = 0;
        for (int i = 0; i < 20; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            st.nextToken();
            double credit = Double.parseDouble(st.nextToken());

            String tmp = st.nextToken();
            double grade = 0;

            if (tmp.equals("P")) {
                continue;
            }

            switch (tmp.charAt(0)) {
                case 'A':
                    grade += 4;
                    break;
                case 'B':
                    grade += 3;
                    break;
                case 'C':
                    grade += 2;
                    break;
                case 'D':
                    grade += 1;
                    break;
                case 'F':
                    break;
            }

            if (tmp.length() == 2 && tmp.charAt(1) == '+') {
                grade += 0.5;
            }

            sumA += credit * grade;
            sumB += credit;
        }

        System.out.print(sumA / sumB);
    }
}