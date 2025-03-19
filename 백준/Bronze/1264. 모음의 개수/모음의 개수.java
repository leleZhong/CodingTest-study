import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        char[] vowel = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        while (true) {
            String input = br.readLine();
            if (input.equals("#"))
                break;
            
            char[] arr = input.toCharArray();
            int cnt = 0;
            for (char c : arr) {
                for (char v : vowel) {
                    if (c == v) {
                        cnt++;
                        break;
                    }
                }
            }
            sb.append(cnt).append("\n");
        }
        System.out.print(sb);
    }
}