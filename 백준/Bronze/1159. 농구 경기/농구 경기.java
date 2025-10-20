import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[26];
        while (N --> 0) {
            arr[br.readLine().charAt(0) - 'a']++;
        }

        StringBuilder sb = new StringBuilder();
        boolean possible = false;
        for (int i = 0; i < 26; i++) {
            if (arr[i] >= 5) {
                possible = true;
                sb.append((char) (i + 'a'));
            }
        }

        System.out.println(possible ? sb : "PREDAJA");
    }
}