import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String s;
        while((s = br.readLine()) != null) {
            int N = Integer.parseInt(s);

            System.out.println(recur(N));
        }
    }

    static String recur(int n) {
        if (n == 0) {
            return "-";
        }

        StringBuilder s = new StringBuilder();
        int size = (int) Math.pow(3, n - 1);
        s.append(recur(n - 1));
        for (int i = 0; i < size; i++) {
            s.append(" ");
        }
        s.append(recur(n - 1));

        return s.toString();
    }
}