import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int K = Integer.parseInt(br.readLine());

        int[][] map = new int[N + 1][N + 1];
        for (int i = 0; i < K; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            map[x][y] = 1;
        }

        boolean[][] snake = new boolean[N + 1][N + 1];
        snake[1][1] = true;

        int L = Integer.parseInt(br.readLine());
        HashMap<Integer, Character> turn = new HashMap<>();
        while (L-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int X = Integer.parseInt(st.nextToken());
            char C = st.nextToken().charAt(0);

            turn.put(X, C);
        }

        int time = 0;
        int[] dx = { -1, 1, 0, 0 }; // 상하좌우
        int[] dy = { 0, 0, -1, 1 };
        int dir = 3;

        ArrayDeque<int[]> snakeBody = new ArrayDeque<>();
        snakeBody.offer(new int[] { 1, 1 });

        int hx = 1;
        int hy = 1;

        while (true) {
            time++;

            hx += dx[dir];
            hy += dy[dir];

            if (hx < 1 || hx > N || hy < 1 || hy > N || snake[hx][hy]) {
                break;
            }

            snakeBody.offer(new int[] { hx, hy });
            snake[hx][hy] = true;

            if (map[hx][hy] == 1) {
                map[hx][hy] = 0;
            } else {
                int[] tail = snakeBody.poll();
                snake[tail[0]][tail[1]] = false;
            }

            if (turn.containsKey(time)) {
                char val = turn.get(time);
                switch (dir) {
                    case 0:
                        if (val == 'L') {
                            dir = 2;
                        } else {
                            dir = 3;
                        }
                        break;
                    case 1:
                        if (val == 'L') {
                            dir = 3;
                        } else {
                            dir = 2;
                        }
                        break;
                    case 2:
                        if (val == 'L') {
                            dir = 1;
                        } else {
                            dir = 0;
                        }
                        break;
                    case 3:
                        if (val == 'L') {
                            dir = 0;
                        } else {
                            dir = 1;
                        }
                        break;
                }
            }
        }

        System.out.println(time);
    }
}