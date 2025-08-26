import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        while (T --> 0) {
            char[] input = br.readLine().toCharArray();

            LinkedList<Character> list = new LinkedList<>();
            ListIterator<Character> it = list.listIterator();
            for (char c : input) {
                switch (c) {
                    case '-':
                        if (it.hasPrevious()) {
                            it.previous();
                            it.remove();
                        }
                        break;
                    case '<':
                        if (it.hasPrevious()) {
                            it.previous();
                        }
                        break;
                    case '>':
                        if (it.hasNext()) {
                            it.next();
                        }
                        break;
                    default:
                        it.add(c);
                        break;
                }
            }

            for (char c : list) {
                sb.append(c);
            }
            sb.append("\n");
        }

        System.out.print(sb);
    }
}