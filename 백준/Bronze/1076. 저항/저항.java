import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] color = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};
        String[] num = {"", "0", "00", "000", "0000", "00000", "000000", "0000000", "00000000", "000000000"};

        String first = br.readLine();
        String second = br.readLine();
        String third = br.readLine();
        
        StringBuilder sb = new StringBuilder();
        int f = 0, s = 0, t = 0;
        for (int i = 0; i < color.length; i++) {
            if (color[i].equals(first))
                f = i;
            if (color[i].equals(second))
                s = i;
            if (color[i].equals(third))
                t = i;
        }

        sb.append(f).append(s).append(num[t]);
        System.out.print(Long.parseLong(sb.toString()));
    }
}