import java.util.*;
import java.io.*;

public class Main {
    public static int n, m, u, v;
    public static int[][] map;
    public static boolean[] visited;
    public static Queue<Integer> q = new LinkedList<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        map = new int[n+1][n+1];  // 노드가 1부터 시작하기 때문
        visited = new boolean[n+1];

        for (int i=0; i<m; i++) {
            StringTokenizer st1 = new StringTokenizer(br.readLine());

            u = Integer.parseInt(st1.nextToken());
            v = Integer.parseInt(st1.nextToken());

            map[u][v] = 1;
            map[v][u] = 1;
        }

        int answer = 0;
        for (int i=1; i<=n; i++) {
            if(!visited[i]) {
                bfs(i);
                answer++;
            }
        }
        System.out.println(answer);

    }

    public static void bfs(int x) {
        visited[x] = true;
        q.offer(x);

        while(!q.isEmpty()) {
            int cur = q.poll();
            for (int i=1; i<=n; i++) {
                if (map[cur][i]==1 && visited[i]==false) {
                    visited[i] = true;
                    q.offer(i);
                }
            }

        }

    }
}
