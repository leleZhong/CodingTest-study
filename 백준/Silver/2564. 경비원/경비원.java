import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int R = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        int N = Integer.parseInt(br.readLine());
        int[][] arr = new int[N][2];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        int dir = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());

        int len = (R + C) * 2;
        int sum = 0;
        for (int i = 0; i < N; i++) {
            if (dir == arr[i][0]) {
                sum += Math.abs(x - arr[i][1]);
                continue;
            }
        
            int tmp = 0;
            if ((dir == 1 && arr[i][0] == 2) || (dir == 2 && arr[i][0] == 1)) {
                tmp = C + x + arr[i][1];
                sum += Math.min(tmp, len - tmp);
            } else if ((dir == 3 && arr[i][0] == 4) || (dir == 4 && arr[i][0] == 3)) {
                tmp = R + x + arr[i][1];
                sum += Math.min(tmp, len - tmp);
            } else if (dir == 1) {
                if (arr[i][0] == 3) {
                    sum += x + arr[i][1];
                } else if (arr[i][0] == 4) {
                    sum += (R - x) + arr[i][1];
                }
            } else if (dir == 2) {
                if (arr[i][0] == 3) {
                    sum += x + (C - arr[i][1]);
                } else if (arr[i][0] == 4) {
                    sum += (R - x) + (C - arr[i][1]);
                }
            } else if (dir == 3) {
                if (arr[i][0] == 1) {
                    sum += x + arr[i][1];
                } else if (arr[i][0] == 2) {
                    sum += (C - x) + arr[i][1];
                }
            } else if (dir == 4) {
                if (arr[i][0] == 1) {
                    sum += x + (R - arr[i][1]);
                } else if (arr[i][0] == 2) {
                    sum += (C - x) + (R - arr[i][1]);
                }
            }
        }

        System.out.println(sum);
    }
}