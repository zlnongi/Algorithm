import java.io.*;
import java.util.*;

public class Main {
    public static int n;
    public static char[][] color;
    public static boolean[][] visited;
    public static int[] dx = {-1, 1, 0, 0};
    public static int[] dy = {0, 0, -1, 1};
    public static Queue<Node> q = new LinkedList<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));

        n = Integer.parseInt(br.readLine());
        color = new char[n][n];
        visited = new boolean[n][n];

        for (int i=0; i<n; i++) {
            color[i] = br.readLine().toCharArray();
        }

        int answer1 = 0;

        for (int x=0; x<n; x++) {
            for (int y=0; y<n; y++) {
                if (!visited[x][y]) {
                    bfs(x, y);
                    answer1++;
                }
            }
        }

        int answer2 = 0;
        visited = new boolean[n][n];
        for (int x=0; x<n; x++) {
            for (int y=0; y<n; y++) {
                if (!visited[x][y]) {
                    bfs(x,y);
                    answer2++;
                }
            }
        }

        System.out.println(answer1 + " " + answer2);




    }

    public static void bfs(int x, int y) {
        q.offer(new Node(x,y));
        visited[x][y] = true;

        while(!q.isEmpty()) {
            Node cur = q.poll();

            for (int i=0; i<4; i++) {
                int nx = cur.x + dx[i];
                int ny = cur.y + dy[i];

                if (nx < 0 || nx >= n || ny < 0 || ny>= n) continue;
                if (visited[nx][ny] || color[cur.x][cur.y] != color[nx][ny]) continue;
                visited[nx][ny] = true;
                q.offer(new Node(nx, ny));

            }

            if (color[cur.x][cur.y] == 'R') {
                color[cur.x][cur.y] = 'G';
            }

        }

    }

    public static class Node {
        int x;
        int y;

        public Node(int x, int y) {
            this.x =x;
            this.y = y;
        }
    }


}
