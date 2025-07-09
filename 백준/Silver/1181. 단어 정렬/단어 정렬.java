import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] arr = new String[N];
        for (int i = 0; i < N; i++) {
            arr[i] = br.readLine();
        }

        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                if (a.length() != b.length())
                    return a.length() - b.length();;
                return a.compareTo(b);
            }
        });

        StringBuilder sb = new StringBuilder();
        sb.append(arr[0]).append("\n");
        for (int i = 1; i < N; i++) {
            if (!arr[i].equals(arr[i - 1]))
                sb.append(arr[i]).append("\n");
        }
        System.out.print(sb);
    }
}