import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        String G = st.nextToken(); // 게임 종류

        int num = 0;
        if (G.equals("Y")) {
            num = 2;
        } else if (G.equals("F")) {
            num = 3;
        } else if (G.equals("O")) {
            num = 4;
        }

        HashSet<String> play = new HashSet<>();
        int cnt = 0;
        int tmp = 0;
        while (N --> 0) {
            if (play.add(br.readLine())) {
                tmp++;
            }
            
            if (tmp == num - 1) { // 이미 한 명이 채워져 있으므로 
                tmp = 0;
                cnt++;
            }
        }
        System.out.print(cnt);
    }
}