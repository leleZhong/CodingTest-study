import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        ArrayList<Integer> l = new ArrayList<>();
        while (N --> 0) {
            l.add(Integer.parseInt(br.readLine()));
        }
        Collections.sort(l);

        StringBuilder sb = new StringBuilder();
        for (int i : l) {
            sb.append(i).append("\n");
        }

        System.out.print(sb);
    }
}