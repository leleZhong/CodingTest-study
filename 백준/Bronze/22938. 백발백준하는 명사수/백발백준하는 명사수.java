import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long x1 = Long.parseLong(st.nextToken());
        long y1 = Long.parseLong(st.nextToken());
        long r1 = Long.parseLong(st.nextToken());

        st = new StringTokenizer(br.readLine());
        long x2 = Long.parseLong(st.nextToken());
        long y2 = Long.parseLong(st.nextToken());
        long r2 = Long.parseLong(st.nextToken());

        long d = (x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2);
        if (d < (r1 + r2) * (r1 + r2)) System.out.print("YES");
        else System.out.print("NO");
    }
}