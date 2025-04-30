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
        String input = br.readLine();
        List<Character> list = new LinkedList<>();
        for (int i = 0; i < input.length(); i++) {
            list.add(input.charAt(i));
        }
        ListIterator<Character> cursor = list.listIterator();
        while (cursor.hasNext()) {
            cursor.next();
        }

        int M = Integer.parseInt(br.readLine());
        for (int i = 0; i < M; i++) {
            String command = br.readLine();
            char c = command.charAt(0);
            switch (c) {
                case 'L':
                    if (cursor.hasPrevious())
                        cursor.previous();
                    break;
                case 'D':
                    if (cursor.hasNext())
                        cursor.next();
                    break;
                case 'B':
                    if (cursor.hasPrevious()) {
                        cursor.previous();
                        cursor.remove();    // remove()는 next()나 previous()로 반환된 최근 요소를 제거
                    }
                    break;
                case 'P':
                    char add = command.charAt(2);
                    cursor.add(add);
            }
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (char c : list) {
            bw.write(c);
        }
        bw.flush();
        bw.close();
    }
}