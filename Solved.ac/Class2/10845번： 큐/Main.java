/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 10845                             :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: lelelzhong <boj.kr/u/lelelzhong>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/10845                          #+#        #+#      #+#    */
/*   Solved: 2025/03/09 21:50:33 by lelelzhong    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static class MyQueue {
        int[] queue;
        int front, rear, size;

        public MyQueue(int size) {
            queue = new int[size];
            front = 0;
            rear = 0;
            size = 0;
        }

        public void push(int x) {
            queue[rear++] = x;
            size++;
        }

        public int pop() {
            if (size == 0)
                return -1;
            int val = queue[front++];
            size--;
            return val;
        }

        public int size() {
            return size;
        }

        public int empty() {
            return size == 0 ? -1 : 0;
        }

        public int front() {
            return size == 0 ? -1 : queue[front];
        }

        public int back() {
            return size == 0 ? -1 : queue[rear - 1];
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;

        MyQueue queue = new MyQueue(n);

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String command = st.nextToken();

            if (command.equals("push")) {
                int x = Integer.parseInt(st.nextToken());
                queue.push(x);
            }
            else if (command.equals("pop")) {
                sb.append(queue.pop()).append("\n");
            }
            else if (command.equals("size")) {
                sb.append(queue.size()).append("\n");
            }
            else if (command.equals("empty")) {
                sb.append(queue.empty()).append("\n");
            }
            else if (command.equals("front")) {
                sb.append(queue.front()).append("\n");
            }
            else if (command.equals("back")) {
                sb.append(queue.back()).append("\n");
            }
        }
        System.out.print(sb);
    }
}