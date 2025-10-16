import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.StringTokenizer;

class Main {
    static int[][] sudoku = new int[9][9];
    static ArrayList<int[]> location = new ArrayList<>();
    static int cnt = 0;
    static boolean solved = false;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 9; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 9; j++) {
                sudoku[i][j] = Integer.parseInt(st.nextToken());
                if (sudoku[i][j] == 0) {
                    location.add(new int[] { i, j });
                }
            }
        }
        cnt = location.size();

        recur(0);
    }

    static void recur(int depth) {
        if (solved) {
            return;
        }

        if (depth == cnt) {
            if (checkComplete()) {
                StringBuilder sb = new StringBuilder();
                for (int[] arr : sudoku) {
                    for (int n : arr) {
                        sb.append(n).append(" ");
                    }
                    sb.append("\n");
                }
                System.out.print(sb);
                solved = true;
            }
            return;
        }

        int[] cur = location.get(depth);
        int x = cur[0];
        int y = cur[1];
        for (int i = 1; i <= 9; i++) {
            if (isValid(x, y, i)) {
                sudoku[x][y] = i;
                recur(depth + 1);
                sudoku[x][y] = 0;

                if (solved) {
                    return;
                }
            }
        }
    }

    static boolean isValid(int x, int y, int n) {
        for (int j = 0; j < 9; j++) {
            if (sudoku[x][j] == n)
                return false;
        }

        for (int i = 0; i < 9; i++) {
            if (sudoku[i][y] == n)
                return false;
        }

        int sx = (x / 3) * 3;
        int sy = (y / 3) * 3;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (sudoku[sx + i][sy + j] == n)
                    return false;
            }
        }

        return true;
    }

    static boolean checkComplete() {
        return row() && col() && square();
    }

    static boolean row() {
        HashSet<Integer> set = new HashSet<>();
        for (int[] r : sudoku) {
            for (int num : r) {
                if (!set.add(num)) {
                    return false;
                }
            }
            set.clear();
        }
        return true;
    }

    static boolean col() {
        HashSet<Integer> set = new HashSet<>();
        for (int j = 0; j < 9; j++) {
            for (int i = 0; i < 9; i++) {
                if (!set.add(sudoku[i][j])) {
                    return false;
                }
            }
            set.clear();
        }
        return true;
    }

    static boolean square() {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < 9; i += 3) {
            for (int j = 0; j < 9; j += 3) {
                for (int m = 0; m < 3; m++) {
                    for (int n = 0; n < 3; n++) {
                        if (!set.add(sudoku[i + m][j + n])) {
                            return false;
                        }
                    }
                }
                set.clear();
            }
        }
        return true;
    }
}