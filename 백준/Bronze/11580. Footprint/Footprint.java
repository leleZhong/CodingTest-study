import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int L = Integer.parseInt(br.readLine());
        char[] command = br.readLine().toCharArray();

        int x = 0, y = 0;
        HashSet<String> set = new HashSet<>();
        set.add(x + "," + y);
        for (char c : command) {
            switch (c) {
                case 'E':
                    x++;
                    break;
                case 'W':
                    x--;
                    break;
                case 'S':
                    y--;
                    break;
                case 'N':
                    y++;
                    break;
            }
            set.add(x + "," + y);
        }

        System.out.print(set.size());
    }
}