import java.util.*;
import java.io.*;

// 토마토 3d
public class Main {
    public static int m, n, h;
    public static int[][][] tomato;
    public static int[][][] visited;

    public static int[] dx = {-1, 1, 0, 0, 0, 0 };
    public static int[] dy = {0, 0, -1, 1, 0, 0};
    public static int[] dz = {0,0, 0, 0, 1, -1};
    public static Queue<Node> q = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        m = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());
        h = Integer.parseInt(st.nextToken());
        tomato = new int[h][n][m];
        visited = new int[h][n][m];
        int answer = Integer.MIN_VALUE;

        for(int k=0; k<h; k++) {
            for (int i=0; i<n; i++) {
                StringTokenizer st1= new StringTokenizer(br.readLine());
                for (int j=0; j<m; j++) {
                    tomato[k][i][j] = Integer.parseInt(st1.nextToken());
                    if (tomato[k][i][j] == 1) q.offer(new Node(k,i,j));
                }
            }
        }

        bfs();
        boolean flag = true; // 익지 않은 토마토 확인 (0이 남아있는지)
        for (int k=0; k<h; k++) {
            for (int i=0; i<n; i++) {
                for (int j=0; j<m; j++) {
                    if (tomato[k][i][j] == 0) flag = false;    // 아직 익지 않은 토마토 있는지 체크 필요
                }
            }
        }
        if (flag) {
            for (int k=0; k<h; k++) {
                for (int i=0; i<n; i++) {
                    for (int j=0; j<m; j++) {
                        answer = Math.max(answer, visited[k][i][j]);
                    }
                }
            }
            System.out.println(answer);
        } else {
            System.out.println("-1");
        }


    }

    public static void bfs() {
        while(!q.isEmpty()) {
            Node cur = q.poll();
            for (int i=0; i<6; i++) {    // new Node (k,i,j) 순서 잘 맞춰야함
               int nz = cur.z + dz[i];
               int ny = cur.y + dy[i];
               int nx = cur.x + dx[i];

                if(nx>=0 && nx<m && ny>=0 && ny<n && nz>=0 && nz<h && tomato[nz][ny][nx]==0) {
                    tomato[nz][ny][nx] = 1;
                    q.offer(new Node(nz,ny,nx));
                    visited[nz][ny][nx] = visited[cur.z][cur.y][cur.x] + 1;
                }
            }
        }
    }

    public static class Node {
        int z, y, x;
        public Node(int z, int y, int x) {
            this.x = x;
            this.y = y;
            this.z = z;
        }
    }
}
