import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        boolean[] num = new boolean[10001];
        for (int n = 1; n < 10001; n++) {
            int dn = n;
            int tmp = n;
            while (tmp > 0) {
                dn += tmp % 10;
                tmp /= 10;
            }
            
            if (dn < 10001) num[dn] = true;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < 10001; i++) {
            if (!num[i]) sb.append(i).append("\n");
        }

        System.out.print(sb);
    }
}