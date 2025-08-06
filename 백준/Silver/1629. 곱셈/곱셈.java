import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static long A, B, C;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        A = Long.parseLong(st.nextToken());
        B = Long.parseLong(st.nextToken());
        C = Long.parseLong(st.nextToken());

        System.out.print(recur(B) % C);
    }

    static long recur(long b) {
        if (b == 1) {
            return A % C;
        }

        long half = recur(b / 2) % C;
        
        if (b % 2 == 0) {
            return (half * half) % C;
        } else {
            return ((half * half) % C * A) % C;
        }
    }
}