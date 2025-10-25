import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int K = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < K; i++) {
            for (int j = 0; j < K; j++) {
                sb.append("G");
            }

            for (int j = 0; j < K; j++) {
                sb.append("...");
            }

            sb.append("\n");
        }

        for (int i = 0; i < K; i++) {
            for (int j = 0; j < K; j++) {
                sb.append(".");
            }

            for (int j = 0; j < K; j++) {
                sb.append("I");
            }

            for (int j = 0; j < K; j++) {
                sb.append(".");
            }

            for (int j = 0; j < K; j++) {
                sb.append("T");
            }

            sb.append("\n");
        }

        for (int i = 0; i < K; i++) {
            for (int j = 0; j < K; j++) {
                sb.append("..");
            }

            for (int j = 0; j < K; j++) {
                sb.append("S");
            }

            for (int j = 0; j < K; j++) {
                sb.append(".");
            }

            sb.append("\n");
        }

        System.out.println(sb);
    }
}