import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        int[] arr = { 13, 7, 5, 3, 3, 2 };

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int cho = 0;
        for (int i = 0; i < 6; i++) {
            cho += arr[i] * Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        double han = 1.5;
        for (int i = 0; i < 6; i++) {
            han += arr[i] * Integer.parseInt(st.nextToken());
        }

        System.out.println(cho > han ? "cocjr0208" : "ekwoo");
    }
}