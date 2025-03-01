import java.util.*;
import java.io.*;

public class Main {
    public static int n, m;
    public static int[][] map;
    public static int[][] distance;
    public static boolean[][] visited;
    public static int[] dx = {-1, 0, 1, 0};
    public static int[] dy = {0, 1, 0, -1};
    public static Queue<Node> q = new LinkedList<>();

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        map = new int[n][m];
        distance = new int[n][m];
        visited = new boolean[n][m];

        int startY = 0;
        int startX = 0;

        for (int i=0; i<n; i++) {
            StringTokenizer st1 = new StringTokenizer(br.readLine());
            for (int j=0; j<m; j++) {
                map[i][j] = Integer.parseInt(st1.nextToken());
                if (map[i][j]==2) {
                    startY = i;
                    startX = j;
                }
             //   q.offer(new Node(i,j)); 이렇게 작성하면 bfs의 시작 개념이 사라져서 불필요한 처리를 많이 하게 됨
                // 보통은 시작점만 큐에 넣고 시작해야됨!!!!!!

                // 갈 수 없는 땅 아니고, 도달할 수 없는 위치
                if (map[i][j] != 0) {
                    distance[i][j] = -1;
                }
            }
        }
        bfs(startY, startX);

        StringBuilder sb = new StringBuilder();
        for (int i=0; i<n; i++) {
            for (int j=0; j<m; j++) {
                sb.append(distance[i][j]).append(" ");
            }
            sb.append("\n");
        }

        System.out.println(sb);



    }

    public static void bfs(int startY, int startX) {
        q.offer(new Node(startY, startX));
        visited[startY][startX] = true;
        distance[startY][startX] = 0;
        // 시작점 큐에 넣어주고, Vistied true로 만들어주고 distance는 0으로 만들어줌

        while (!q.isEmpty()) {
            Node cur = q.poll();
            for (int i=0; i<4; i++) {
                int ny = cur.y + dy[i];
                int nx = cur.x + dx[i];

                if (nx>=0 && nx<m && ny>=0 && ny<n && map[ny][nx]==1 && !visited[ny][nx]) {
                    visited[ny][nx] = true;
                    distance[ny][nx] = distance[cur.y][cur.x] + 1;
                    q.offer(new Node(ny, nx));
                }

            }

        }

    }


    public static class Node {
        int y, x;
        public Node(int y, int x) {
            this.x = x;
            this.y = y;
        }
    }

}
