import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        ArrayList<String> baekjoon = new ArrayList<>();
        ArrayList<String> etc = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            if (s.length() > 7 && s.substring(0, 7).equals("boj.kr/")) {
                baekjoon.add(s);
            } else {
                etc.add(s);
            }
        }

        Collections.sort(baekjoon, (a, b) -> {
            return Integer.parseInt(a.substring(7)) - Integer.parseInt(b.substring(7));
        });
        
        Collections.sort(etc, (a, b) -> {
            if (a.length() != b.length()) {
                return a.length() - b.length();
            }
            return a.compareTo(b);
        });

        StringBuilder sb = new StringBuilder();
        for (String s : etc) {
            sb.append(s + "\n");
        }
        for (String s : baekjoon) {
            sb.append(s + "\n");
        }

        System.out.print(sb);
    }
}