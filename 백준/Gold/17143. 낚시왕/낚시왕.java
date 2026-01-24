import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    static int R, C, M;
    static Shark[][] map;
    static Shark[] sharks;

    static int[] dr = new int[] { 0, -1, 1, 0, 0 };
    static int[] dc = new int[] { 0, 0, 0, 1, -1 };

    static class Shark {
        int idx;
        int r, c, s, d, z;

        void move() {
            for (int i = 1; i <= s; i++) {
                int nr = r + dr[d];
                int nc = c + dc[d];
                if (nr < 1 || nr > R || nc < 1 || nc > C) {
                    switch (d) {
                        case 1:
                            d = 2;
                            break;
                        case 2:
                            d = 1;
                            break;
                        case 3:
                            d = 4;
                            break;
                        case 4:
                            d = 3;
                            break;
                    }
                    nr = r + dr[d];
                    nc = c + dc[d];
                }
                r = nr;
                c = nc;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        map = new Shark[R + 1][C + 1];
        sharks = new Shark[M];
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            sharks[i] = new Shark();

            sharks[i].idx = i;
            sharks[i].r = Integer.parseInt(st.nextToken());
            sharks[i].c = Integer.parseInt(st.nextToken());
            sharks[i].s = Integer.parseInt(st.nextToken());
            sharks[i].d = Integer.parseInt(st.nextToken());
            sharks[i].z = Integer.parseInt(st.nextToken());

            map[sharks[i].r][sharks[i].c] = sharks[i];
        }

        int ans = 0;
        for (int i = 1; i <= C; i++) {
            ans += fish(i);
            move();
        }

        System.out.println(ans);
    }
    static int fish(int c) {
        for (int i = 1; i <= R; i++) {
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
        Shark[][] tmp = new Shark[R + 1][C + 1];
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