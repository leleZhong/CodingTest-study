import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        boolean[] arr = new boolean[26];
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'A'] = true;
        }

        if (arr['M' - 'A'] && arr['O' - 'A'] && arr['B' - 'A'] && arr['I' - 'A'] && arr['S' - 'A']) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}