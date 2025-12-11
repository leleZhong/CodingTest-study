import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int first = N * 22 / 100;
        int second = N * 20 / 100 * 22 / 100;
        System.out.println((N - first) + " " + (N - second));
    }
}