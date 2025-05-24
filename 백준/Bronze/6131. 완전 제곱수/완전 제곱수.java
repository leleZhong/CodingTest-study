import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        int cnt = 0;
        for (int i = 1; i <= 500; i++) {
            for (int j = i; j <= 500; j++) {
                if (j * j == i * i + N)
                    cnt++;
            }
        }

        System.out.print(cnt);
    }
}