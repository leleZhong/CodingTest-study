import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int m = 8 + (N - 1) * 7;
        int y = 2024 + m / 12;
        m %= 12;
        System.out.println(m == 0 ? y - 1 + " " + 12 : y + " " + m);
    }
}