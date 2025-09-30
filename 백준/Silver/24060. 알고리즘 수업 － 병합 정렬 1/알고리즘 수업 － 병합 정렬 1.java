import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    static int N, K;
    static int[] arr;
    static int[] tmp;
    static int cnt = 0;
    static int ans = -1;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        arr = new int[N];
        tmp = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        sort(0, N - 1);

        System.out.println(ans);
    }

    static void sort(int l, int r) {
        if (cnt > K) {
            return;
        }

        if (l < r) {
            int mid = (l + r) / 2;
            sort(l, mid);
            sort(mid + 1, r);
            merge(l, mid, r);
        }
    }

    static void merge(int l, int mid, int r) {
        int i = l;
        int j = mid + 1;
        int t = 0;

        while (i <= mid && j <= r) {
            if (arr[i] <= arr[j]) {
                tmp[t++] = arr[i++];
            } else {
                tmp[t++] = arr[j++];
            }
        }

        while (i <= mid) {
            tmp[t++] = arr[i++];
        }

        while (j <= r) {
            tmp[t++] = arr[j++];
        }

        i = l;
        t = 0;
        while (i <= r) {
            cnt++;
            if (cnt == K) {
                ans = tmp[t];
                return;
            }

            arr[i++] = tmp[t++];
        }
    }
}