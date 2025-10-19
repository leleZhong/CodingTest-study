import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());
        int D = Integer.parseInt(br.readLine());
        int E = Integer.parseInt(br.readLine());

        boolean frozen = A < 0;
        int sec = 0;
        int degree = A;
        while (degree < B) {
            if (frozen) {
                if (degree < 0) {
                    sec += C;
                    degree++;
                } else {
                    sec += D;
                    frozen = false;
                }
            } else {
                sec += E;
                degree++;
            }
        }

        System.out.println(sec);
    }
}