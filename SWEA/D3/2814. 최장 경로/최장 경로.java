import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Solution {
	static int N, M;
	static ArrayList<Integer>[] graph;
	static int max;
	static boolean[] visited;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		for (int tc = 1; tc <= T; tc++) {
			sb.append("#").append(tc).append(" ");
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			N = Integer.parseInt(st.nextToken());
			M = Integer.parseInt(st.nextToken());
			
			graph = new ArrayList[N + 1];
			for (int i = 1; i <= N; i++) {
				graph[i] = new ArrayList<>();
			}
			
			for (int i = 0; i < M; i++) {
				st = new StringTokenizer(br.readLine());
				int x = Integer.parseInt(st.nextToken());
				int y = Integer.parseInt(st.nextToken());
				
				graph[x].add(y);
				graph[y].add(x);
			}
			
			max = 0;
			for (int i = 1; i <= N; i++) {
				visited = new boolean[N + 1];
				visited[i] = true;
				dfs(i, 1);
				visited[i] = false;
			}
			
			sb.append(max).append("\n");
		}
		System.out.print(sb);
	}
	
	static void dfs(int cur, int depth) {
			max = Math.max(max, depth);
		
		for (int next : graph[cur]) {
			if (!visited[next]) {
				visited[next] = true;
				dfs(next, depth + 1);
				visited[next] = false;
			}
		}
	}
}
