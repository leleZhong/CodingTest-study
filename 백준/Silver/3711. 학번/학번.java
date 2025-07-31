import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        while (N --> 0) {
            int G = Integer.parseInt(br.readLine());

            int[] student = new int[G];
            for (int i = 0; i < G; i++) {
                student[i] = Integer.parseInt(br.readLine());
            }

            int m = 1;
            int[] arr = new int[G];
            while (true) {
                boolean flag = true;
                for (int i = 0; i < G; i++) {
                    arr[i] = student[i] % m;

                    for (int j = 0; j < i; j++) {
                        if (arr[i] == arr[j]) {
                            flag = false;
                            break;
                        }
                    }

                    if (!flag) {
                        break;
                    }
                }

                if (flag) {
                    sb.append(m).append("\n");
                    break;
                } else {
                    m++;
                }
            }
        }

        System.out.print(sb);
    }
}