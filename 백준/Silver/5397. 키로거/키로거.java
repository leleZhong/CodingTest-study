import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int t = 0; t < tc; t++) {
            String input = br.readLine();
            List<Character> list = new LinkedList<>();
            ListIterator<Character> it = list.listIterator();

            for (int i = 0; i < input.length(); i++) {
                char c = input.charAt(i);
                switch (c) {
                    case '-':
                        if (it.hasPrevious()) {
                            it.previous();
                            it.remove();
                        }
                        break;
                    case '<':
                        if (it.hasPrevious())
                            it.previous();
                        break;
                    case '>':
                        if (it.hasNext())
                            it.next();
                        break;
                    default:
                        it.add(c);
                        break;
                }
            }
            

            for (char c : list) {
                bw.write(c);
            }
            bw.write("\n");
        }

        bw.flush();
        bw.close();
    }
}