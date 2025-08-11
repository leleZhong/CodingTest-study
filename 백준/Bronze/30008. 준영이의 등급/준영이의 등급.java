import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[] arr = new int[K];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < K; i++) {
            arr[i] = Integer.parseInt(st.nextToken()) * 100 / N;
        }

        StringBuilder sb = new StringBuilder();
        int grade = 0;
        for (int i = 0; i < K; i++) {
            if (arr[i] <= 4) {
                grade = 1;
            } else if (arr[i] <= 11) {
                grade = 2;
            } else if (arr[i] <= 23) {
                grade = 3;
            } else if (arr[i] <= 40) {
                grade = 4;
            } else if (arr[i] <= 60) {
                grade = 5;
            } else if (arr[i] <= 77) {
                grade = 6;
            } else if (arr[i] <= 89) {
                grade = 7;
            } else if (arr[i] <= 96) {
                grade = 8;
            } else {
                grade = 9;
            }

            sb.append(grade).append(" ");
        }

        System.out.print(sb);
    }
}