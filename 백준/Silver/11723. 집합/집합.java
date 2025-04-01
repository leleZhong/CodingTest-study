import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static boolean[] set = new boolean[21];
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.parseInt(br.readLine());

        for (int i = 0; i < M; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            switch (st.nextToken()) {
                case "add":
                    add(Integer.parseInt(st.nextToken()));
                    break;
                case "remove":
                    remove(Integer.parseInt(st.nextToken()));
                    break;
                case "check":
                    check(Integer.parseInt(st.nextToken()));
                    break;
                case "toggle":
                    toggle(Integer.parseInt(st.nextToken()));
                    break;
                case "all":
                    all();
                    break;
                case "empty":
                    empty();
                    break;
            }
        }

        System.out.print(sb);
    }

    static void add(int x) {
        if (set[x])
            return;
        else
            set[x] = true;
    }

    static void remove(int x) {
        if (set[x])
            set[x] = false;
        else
            return;
    }

    static void check(int x) {
        sb.append(set[x] ? 1 : 0).append("\n");
    }

    static void toggle(int x) {
        if (set[x])
            set[x] = false;
        else
            set[x] = true;
    }

    static void all() {
        for (int i = 1; i < 21; i++) {
            if (!set[i])
                set[i] = true;
        }
    }

    static void empty() {
        for (int i = 1; i < 21; i++) {
            if (set[i])
                set[i] = false;
        }
    }
}