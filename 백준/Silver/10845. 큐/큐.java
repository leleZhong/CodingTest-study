import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class Main {
    static ArrayDeque<Integer> queue = new ArrayDeque<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        while (N --> 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            switch (st.nextToken()) {
                case "push":
                    push(Integer.parseInt(st.nextToken()));
                    break;
                case "pop":
                    sb.append(pop()).append("\n");
                    break;
                case "size":
                    sb.append(size()).append("\n");
                    break;
                case "empty":
                    sb.append(empty()).append("\n");
                    break;
                case "front":
                    sb.append(front()).append("\n");
                    break;
                case "back":
                    sb.append(back()).append("\n");
                    break;
            }
        }

        System.out.print(sb);
    }

    static void push(int X) {
        queue.offer(X);
    }

    static int pop() {
        return queue.isEmpty() ? -1 : queue.poll();
    }

    static int size() {
        return queue.size();
    }

    static int empty() {
        return queue.isEmpty() ? 1 : 0;
    }

    static int front() {
        return queue.isEmpty() ? -1 : queue.peek();
    }

    static int back() {
        return queue.isEmpty() ? -1 : queue.peekLast();
    }
}