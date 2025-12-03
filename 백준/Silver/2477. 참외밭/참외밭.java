import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int K = Integer.parseInt(br.readLine());

        int[][] arr = new int[6][2];
        int maxWNum = 0, maxHNum = 0;
        int maxW = 0, maxH = 0;
        int maxIdx = 0;
        for (int i = 0; i < 6; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());

            if ((arr[i][0] == 1 || arr[i][0] == 2)) {
                if (maxW < arr[i][1]) {
                    maxWNum = arr[i][0];
                    maxW = arr[i][1];
                    maxIdx = i;
                }
            } else {
                if (maxH < arr[i][1]) {
                    maxHNum = arr[i][0];
                    maxH = arr[i][1];
                }
            }
        }

        int minW = 0, minH = 0;
        if (maxWNum == 1) {
            if (maxHNum == 3) {
                minW = arr[(maxIdx + 2) % 6][1];
                minH = arr[(maxIdx + 3) % 6][1];
            } else {
                minW = arr[(maxIdx + 4) % 6][1];
                minH = arr[(maxIdx + 3) % 6][1];
            }
        } else {
            if (maxHNum == 3) {
                minW = arr[(maxIdx + 4) % 6][1];
                minH = arr[(maxIdx + 3) % 6][1];
            } else {
                minW = arr[(maxIdx + 2) % 6][1];
                minH = arr[(maxIdx + 3) % 6][1];
            }
        }

        System.out.print((maxW * maxH - minW * minH) * K);
    }
}