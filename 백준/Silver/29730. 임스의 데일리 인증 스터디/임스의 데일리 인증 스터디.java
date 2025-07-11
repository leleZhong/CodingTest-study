import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        ArrayList<Integer> baekjoon = new ArrayList<>();
        ArrayList<String> etc = new ArrayList<>();
        while (N --> 0) {
            String s = br.readLine();
            if (s.startsWith("boj.kr/")) {
                baekjoon.add(Integer.parseInt(s.substring(7)));
            } else {
                etc.add(s);
            }
        }

        Collections.sort(baekjoon);
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
        for (int i : baekjoon) {
            sb.append("boj.kr/").append(i).append("\n");
        }

        System.out.print(sb);
    }
}