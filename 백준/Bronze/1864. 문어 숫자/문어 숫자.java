import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        char[] marks = {'/', '-', '\\', '(', '@', '?', '>', '&', '%'};

        while (true) {
            String input = br.readLine();
            if (input.equals("#"))
                break;
            
            char[] octoNums = input.toCharArray();
            int output = 0;
            for (int i = 0; i < octoNums.length; i++) {
                for (int j = 0; j < marks.length; j++) {
                    if (octoNums[i] == marks[j]) {
                        output += (j - 1) * Math.pow(8, octoNums.length - (i + 1));
                    }
                }
            }
            sb.append(output).append("\n");
        }
        
        System.out.print(sb);
    }
}