import java.util.*;
import java.io.*;

// 토마토 bfs
public class Main {
    public static int m,n;
    public static int[][] tomato, visited;
    public static int[] dx = {-1,0,1,0};
    public static int[] dy = {0,-1,0,1};
    public static Queue<Node> q = new LinkedList<>();

     public static void main(String[] args) throws IOException {
         BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
         StringTokenizer st = new StringTokenizer(br.readLine());
         m = Integer.parseInt(st.nextToken());  // 상자 가로  6
         n = Integer.parseInt(st.nextToken()); // 상자 세로  4
         tomato = new int[n][m];     // [4][6]
         visited = new int[n][m];

         for (int i=0; i<n; i++) {
             StringTokenizer st1 = new StringTokenizer(br.readLine());
             for (int j=0; j<m; j++) {
                 tomato[i][j] = Integer.parseInt(st1.nextToken());
                 if(tomato[i][j]==1) {
                     q.offer(new Node(i,j));      // 익은 토마토의 위치를 딱 큐에다 넣는 것임 (여기가 0레벨)
                 }
             }
         }
         bfs();  // bfs 실행
         boolean flag = true;
         int answer = Integer.MIN_VALUE;
         for (int i=0; i<n; i++) {
             for (int j=0; j<m; j++) {
                 if (tomato[i][j]==0) flag = false;
             }
         }
         if (flag) {
             for(int i=0; i<n; i++) {
                 for (int j=0; j<m; j++) {
                     answer = Math.max(answer, visited[i][j]);
                 }
             }
             System.out.println(answer);
         } else {
             System.out.println("-1");
         }



     }

     public static void bfs() {
         while (!q.isEmpty()) {
             Node cur = q.poll(); // 젤 먼저 들어간거 하나 꺼냄
             for (int i=0; i<4; i++) {   // 네 방향 찾음
                 int nx = cur.x + dx[i];
                 int ny = cur.y + dy[i];
                 if (nx>=0 && ny>=0 && nx<n && ny<m && tomato[nx][ny]==0) {
                     tomato[nx][ny] = 1;  // 네방향중 0인 애들 다 1 되고
                     q.offer(new Node(nx, ny));  // 큐에 새로운 노드 넣어줘서 depth ㅇㅇ
                     visited[nx][ny] = visited[cur.x][cur.y] + 1;


                 }
             }

         }
    }

     public static class Node {
         int x, y;
         Node (int x, int y) {
             this.x = x;
             this.y = y;
         }
     }

}
