import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        int[][] arr = new int[N][2];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            int grade = 1;
            for (int j = 0; j < N; j++) {
                if (i == j) {
                    continue;
                }
                
                if (arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1]) {
                    grade++;
                }
            }

            sb.append(grade).append(" ");
        }

        System.out.print(sb);
    }
}