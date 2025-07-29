import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);

        int level = 0;
        int ability = 0;
        if (N < 42) {
            for (int num : arr) {
                level += num;
                ability += num >= 60 ? num >= 100 ? num >= 140 ? num >= 200 ? num >= 250 ? 5 : 4 : 3 : 2 : 1 : 0;
            }
        } else {
            for (int i = N - 42; i < N; i++) {
                int num = arr[i];
                level += num;
                ability += num >= 60 ? num >= 100 ? num >= 140 ? num >= 200 ? num >= 250 ? 5 : 4 : 3 : 2 : 1 : 0;
            }
        }

        System.out.print(level + " " + ability);
    }
}