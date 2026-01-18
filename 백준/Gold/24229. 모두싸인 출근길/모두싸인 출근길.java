import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

class Main {
    static ArrayList<int[]> list;
    static int max = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[][] bridge = new int[N][2];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            bridge[i][0] = Integer.parseInt(st.nextToken());
            bridge[i][1] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(bridge, (a, b) -> Integer.compare(a[0], b[0]));

        list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            if (list.isEmpty()) {
                list.add(new int[] { bridge[i][0], bridge[i][1] });
            } else {
                int lastIdx = list.size() - 1;
                int[] last = list.get(lastIdx);
                if (bridge[i][0] <= last[1]) {
                    // 병합 (끝점은 최대값으로)
                    list.set(lastIdx, new int[] { last[0], Math.max(last[1], bridge[i][1]) });
                } else {
                    list.add(new int[] { bridge[i][0], bridge[i][1] });
                }
            }
        }

        search(0);
        System.out.println(max);
    }

    static void search(int idx) {
        if (idx == list.size() - 1) {
            max = Math.max(max, list.get(idx)[1]);
            return;
        }

        int curD = list.get(idx)[1] - list.get(idx)[0];
        for (int i = idx + 1; i < list.size(); i++) {
            if (list.get(i)[0] <= list.get(idx)[1] + curD) {
                search(i);
            } else {
                max = Math.max(max, list.get(idx)[1]);
                return;
            }
        }
    }
}