import java.util.*;
import java.io.*;

public class Main {
    public static int N;
    public static int M;
    public static int[][] map;
    public static boolean[] visited;
    public static Queue<Integer> q = new LinkedList<>();
    public static void main(String[] args) throws IOException {
        // 점점의 개수 N
        // 간선의 개수 M
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        map = new int[N+1][N+1];
        visited = new boolean[N+1];

        for(int i=0; i<M; i++) {
            StringTokenizer st1 = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st1.nextToken());
            int v = Integer.parseInt(st1.nextToken());

            // 양방향 확인
            map[u][v] = 1;
            map[v][u] = 1;     // 연결 되어있다는걸 보여줘야됨 ㅇㅇ
        }

        int answer = 0;

        for (int i=1; i<=N; i++) {  // 노드 1 2 3 4 5 6
            if (!visited[i]) {  // 아직 방문하지 않았다면
                bfs(i);
                answer++;

            }
        }
        System.out.println(answer);
    }

    public static void bfs(int x) {
        visited[x] = true; // 방문했다고 만들어주고
        q.offer(x);  // 큐에 노드 넣어줌
        while(!q.isEmpty()) {
            int cur = q.poll(); // 현재 상태 큐에서 하나 꺼냄
            // 하나 꺼낸거랑 연관된거 있는지 찾아봐야지
            for (int i=1; i<=N; i++) {   // 모든 노드 다 관계있는지 찾아보기
                if (map[cur][i] == 1 && visited[i]== false) {
                    q.offer(i);   // 그 관련있는 노드 큐에 집어넣음
                    visited[i] = true; // 방문했다고 표시해주기
                }
            }
        }
    }

}
