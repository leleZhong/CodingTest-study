import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    static int R, C, M;
    static Shark[][] map;
    static Shark[] sharks;

    static int[] dr = new int[] { -1, 1, 0, 0 };
    static int[] dc = new int[] { 0, 0, 1, -1 };

    static class Shark {
        int idx;
        int r, c, s, d, z;

        void move() {
            if (d == 0 || d == 1) {
                int t = 2 * (R - 1);    // 주기
                int x = d == 1 ? r : (t - r);
                x = (x + s) % t;

                if (x < R) {
                    r = x;
                    d = 1;
                } else {
                    r = t - x;
                    d = 0;
                }
            } else {
                int t = 2 * (C - 1);
                int x = d == 2 ? c : (t - c);
                x = (x + s) % t;

                if (x < C) {
                    c = x;
                    d = 2;
                } else {
                    c = t - x;
                    d = 3;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        map = new Shark[R][C];
        sharks = new Shark[M];
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            sharks[i] = new Shark();

            sharks[i].idx = i;
            sharks[i].r = Integer.parseInt(st.nextToken()) - 1;
            sharks[i].c = Integer.parseInt(st.nextToken()) - 1;
            sharks[i].s = Integer.parseInt(st.nextToken());
            sharks[i].d = Integer.parseInt(st.nextToken()) - 1;
            sharks[i].z = Integer.parseInt(st.nextToken());

            map[sharks[i].r][sharks[i].c] = sharks[i];
        }

        int ans = 0;
        for (int i = 0; i < C; i++) {
            ans += fish(i);
            move();
        }

        System.out.println(ans);
    }
    static int fish(int c) {
        for (int i = 0; i < R; i++) {
            if (map[i][c] != null) {
                Shark s = map[i][c];
                map[i][c] = null;
                sharks[s.idx] = null;
                return s.z;
            }
        }
        return 0;
    }

    static void move() {
        Shark[][] tmp = new Shark[R][C];
        for (int idx = 0; idx < M; idx++) {
            if (sharks[idx] == null) continue;
            sharks[idx].move();

            int r = sharks[idx].r;
            int c = sharks[idx].c;
            if (tmp[r][c] != null) {
                if (tmp[r][c].z > sharks[idx].z) {
                    sharks[idx] = null;
                } else {
                    sharks[tmp[r][c].idx] = null;
                    tmp[r][c] = sharks[idx];
                }    
            } else {
                tmp[r][c] = sharks[idx];
            }
        }
        map = tmp;
    }
}