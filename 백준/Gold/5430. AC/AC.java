import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        while (T-- > 0) {
            char[] p = br.readLine().toCharArray();
            int n = Integer.parseInt(br.readLine());

            StringTokenizer st = new StringTokenizer(br.readLine(), ",[]");
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }

            int start = 0;
            int end = n - 1;
            boolean isEmpty = false;
            boolean reverse = false;
            for (char c : p) {
                if (c == 'R') {
                    if (reverse) {
                        reverse = false;
                    } else {
                        reverse = true;
                    }
                } else {
                    if (start > end) {
                        isEmpty = true;
                        break;
                    }

                    if (reverse) {
                        end--;;
                    } else {
                        start++;
                    }
                }
            }

            if (isEmpty) {
                sb.append("error\n");
            } else {
                sb.append("[");

                if (reverse) {
                    for (int i = end; i >= start; i--) {
                        sb.append(arr[i]);
                        if (i != start) {
                            sb.append(",");
                        }
                    }
                } else {
                    for (int i = start; i <= end; i++) {
                        sb.append(arr[i]);
                        if (i != end) {
                            sb.append(",");
                        }
                    }
                }
                sb.append("]\n");
            }
        }

        System.out.print(sb);
    }
}