import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] input = br.readLine().toCharArray();
        LinkedList<Character> list = new LinkedList<>();
        for (int i = 0; i < input.length; i++) {
            list.add(input[i]);
        }

        ListIterator<Character> cursor = list.listIterator();
        while (cursor.hasNext()) {
            cursor.next();
        }

        int M = Integer.parseInt(br.readLine());
        while (M-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            switch (st.nextToken()) {
                case "L":
                    if (cursor.hasPrevious()) {
                        cursor.previous();
                    }
                    break;
                case "D":
                    if (cursor.hasNext()) {
                        cursor.next();
                    }
                    break;
                case "B":
                    if (cursor.hasPrevious()) {
                        cursor.previous();
                        cursor.remove();
                    }
                    break;
                case "P":
                    cursor.add(st.nextToken().charAt(0));
                    break;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (char c : list) {
            sb.append(c);
        }

        System.out.print(sb);
    }
}