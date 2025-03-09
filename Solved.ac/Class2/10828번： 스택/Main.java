/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 10828                             :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: lelelzhong <boj.kr/u/lelelzhong>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/10828                          #+#        #+#      #+#    */
/*   Solved: 2025/03/09 21:35:40 by lelelzhong    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static class MyStack {
        int[] stack;
        int top;

        public MyStack(int size) {
            stack = new int[size];
            top = -1;   // 비어있음
        }

        public void push(int x) {
            stack[++top] = x;
        }

        public int pop() {
            return (top == -1) ? -1 : stack[top--];
        }

        public int size() {
            return top + 1;
        }

        public int empty() {
            return (top == -1) ? 1 : 0;
        }

        public int top() {
            return (top == -1) ? -1 : stack[top];
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;

        MyStack stack = new MyStack(n);

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String command = st.nextToken();

            if (command.equals("push")) {
                int x = Integer.parseInt(st.nextToken());
                stack.push(x);
            }
            else if (command.equals("pop")) {
                sb.append(stack.pop()).append("\n");
            }
            else if (command.equals("size")) {
                sb.append(stack.size()).append("\n");
            }
            else if (command.equals("empty")) {
                sb.append(stack.empty()).append("\n");
            }
            else if (command.equals("top")) {
                sb.append(stack.top()).append("\n");
            }
        }
        System.out.print(sb);
    }
}