import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        int tmp = A * A - B;
        int i = 0;
        while (true) {
            if (i * i == tmp)
                break;
            i++;
        }

        int ans1= - A - i;
        int ans2 = - A + i;
        if (i == 0)
            System.out.print(ans1);
        else
            System.out.print(ans1 + " " + ans2);
    }
}