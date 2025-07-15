import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int L = Integer.parseInt(br.readLine());

        int[][] arc = { { 200, 210, 220 }, { 210, 220, 225 }, { 220, 225, 230 }, { 225, 230, 235 }, { 230, 235, 245 },
                { 235, 245, 250 } };
        int[][] gra = { { 260, 265, 270 }, { 265, 270, 275 }, { 270, 275, 280 }, { 275, 280, 285 }, { 280, 285, 290 },
                { 285, 290, 295 }, { 290, 295, 300 } };

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arc.length; i++) {
            sb.append(L >= arc[i][0] ? L >= arc[i][1] ? L >= arc[i][2] ? 100 : 300 : 500 : 0).append(" ");
        }
        sb.append("\n");
        for (int i = 0; i < gra.length; i++) {
            sb.append(L >= gra[i][0] ? L >= gra[i][1] ? L >= gra[i][2] ? 100 : 300 : 500 : 0).append(" ");
        }
        System.out.print(sb);
    }
}