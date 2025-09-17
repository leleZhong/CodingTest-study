import java.util.*;

class Solution {
    static int N, M;
    static char[][] arr;
    static boolean[][] visited;
    
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};
    
    public int[] solution(String[] maps) {
        N = maps.length;
        M = maps[0].length();
        arr = new char[N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                arr[i][j] = maps[i].charAt(j);
            }
        }
        
        
        visited = new boolean[N][M];
        
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (!visited[i][j] && arr[i][j] != 'X') {
                    list.add(bfs(i, j));
                }
            }
        }
        
        if (list.size() == 0) {
            return new int[] {-1};
        } else {
            int[] answer = new int[list.size()];
            for (int i = 0; i < list.size(); i++) {
                answer[i] = list.get(i);
            }
            Arrays.sort(answer);
            
            return answer;
        }
    }
    
    static int bfs(int i, int j) {
        ArrayDeque<int[]> queue = new ArrayDeque<>();
        queue.add(new int[] {i, j});
        visited[i][j] = true;
        
        int sum = arr[i][j] - '0';
        while (!queue.isEmpty()) {
            int cur[] = queue.poll();
            int x = cur[0];
            int y = cur[1];
            for (int k = 0; k < 4; k++) {
                int nx = x + dx[k];
                int ny = y + dy[k];
                if (nx < 0 || nx >= N || ny < 0 || ny >= M) continue;
                
                if (!visited[nx][ny] && arr[nx][ny] != 'X') {
                    sum += arr[nx][ny] - '0';
                    visited[nx][ny] = true;
                    queue.add(new int[] {nx, ny});
                }
            }
        }
        
        return sum;
    }
}