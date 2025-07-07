import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] arr = new int[N][2];
        int maxH = 0;
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
            maxH = Math.max(maxH, arr[i][1]);
        }
        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));

        int area = 0;
        int leftIdx = 0;
        for (int i = 1; i < N; i++) {
            if (arr[leftIdx][1] < arr[i][1]) {
                area += (arr[i][0] - arr[leftIdx][0]) * arr[leftIdx][1];
                leftIdx = i;
            }
            if (arr[leftIdx][1] == maxH) {
                break;
            }
        }

        int rightIdx = N - 1;
        for (int i = N - 1; i >= 0; i--) {
            if (arr[rightIdx][1] < arr[i][1]) {
                area += (arr[rightIdx][0] - arr[i][0]) * arr[rightIdx][1];
                rightIdx = i;
            }
            if (arr[rightIdx][1] == maxH) {
                break;
            }
        }

        area += (arr[rightIdx][0] - arr[leftIdx][0] + 1) * maxH;
        System.out.print(area);
    }
}