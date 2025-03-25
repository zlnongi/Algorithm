import java.util.*;
import java.io.*;

public class Main {

    static int w, h, k;
    static int[][] map;
    static boolean[][][] visited;
    static int[] dx = {0, 0, 1, -1};
    static int[] dy = {1, -1, 0, 0};
    static int[] hx = {-1, -2, -2, -1, 1, 2, 2, 1};
    static int[] hy = {-2, -1, 1, 2, 2, 1, -1, -2};

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        k = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        w = Integer.parseInt(st.nextToken());
        h = Integer.parseInt(st.nextToken());

        map = new int[h][w];
        visited = new boolean[h][w][k+1];
        for(int i=0; i<h; i++) {
            StringTokenizer st1 = new StringTokenizer(br.readLine());
            for(int j=0; j<w; j++) {
                map[i][j] = Integer.parseInt(st1.nextToken());
            }
        }

        int ans = bfs(0, 0, k);

        System.out.println(ans);
    }

    static int bfs(int x, int y, int k) {
        Queue<Node> que = new LinkedList<>();

        que.add(new Node(x, y, 0, 0));
        visited[x][y][0] = true;

        while(!que.isEmpty()) {
            Node cur = que.poll();


            if(cur.x == h-1 && cur.y == w-1) { // 목적지에 도착하면 종료
                return cur.mCnt;
            }
            for(int t=0; t<4; t++) {
                int nx = cur.x + dx[t];
                int ny = cur.y + dy[t];

                if(nx < 0 || ny < 0 || nx >= h || ny >= w) continue;
                if(visited[nx][ny][cur.hCnt]) continue;

                if(map[nx][ny] == 0) {
                    visited[nx][ny][cur.hCnt] = true;
                    que.add(new Node(nx, ny, cur.hCnt, cur.mCnt + 1));
                }
            }

            if(cur.hCnt < k) {
                for(int t=0; t<8; t++) {
                    int nx = cur.x + hx[t];
                    int ny = cur.y + hy[t];

                    if(nx < 0 || ny < 0 || nx >= h || ny >= w) continue;
                    if(visited[nx][ny][cur.hCnt + 1]) continue;

                    if(map[nx][ny] == 0) {
                        visited[nx][ny][cur.hCnt + 1] = true;
                        que.add(new Node(nx, ny, cur.hCnt + 1, cur.mCnt + 1));
                    }
                }
            }


        }

        return -1;
    }

    public static class Node{
        int x, y;
        int hCnt;// 말 점프 횟수
        int mCnt;// 움직인 횟수

        public Node(int x, int y, int hCnt, int mCnt){
            this.x = x;
            this.y = y;
            this.hCnt = hCnt;
            this.mCnt = mCnt;
        }
    }

}