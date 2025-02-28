import java.util.*;
import java.io.*;

public class Main {
    public static int M, N, K;
    public static int [][] input;
    public static boolean[][] visited;
    public static Node[] dir = {
            new Node (1,0),
            new Node (0,1),
            new Node(-1, 0),
            new Node (0,-1),
    };
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine()); // t 입력

        StringBuilder sb = new StringBuilder(); // count값 출력


        while (T-- > 0) {
            // input
            StringTokenizer st = new StringTokenizer(br.readLine()); // m n k
            M = Integer.parseInt(st.nextToken()); // 가로 (열의 개수)
            N = Integer.parseInt(st.nextToken()); // 세로 (행의 개수)
            K = Integer.parseInt(st.nextToken());

            // 초기화
            int count = 0; // 지렁이 세기

            input = new int[N][M];
            visited = new boolean[N][M];

            for(int i =0; i < K; i++) {
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                input[y][x] = 1; // 이미 1로 채워져있음
            }

            // solve

            for(int i = 0; i < N; i++) {
                for(int j = 0; j < M; j++) {
                    // 좌표에 배추가 있는지 확인 , 내가 체크안한 곳인지 확인
                    if(visited[i][j] == false && input[i][j] == 1) {
                        bfs(i, j);
                        count++;
                    }

                }
            }
            sb.append(count).append('\n');
        }

       System.out.println(sb);

    }

    public static void bfs(int y, int x) {
        Queue<Node> q = new LinkedList<>();

        q.offer(new Node(y,x)); // 값 넣어주기
        visited[y][x] = true;

        while(!q.isEmpty()) {
            Node cur = q.poll();

            for (int d=0; d<4; d++ ) { // 상하좌우 탐색
                int dy = cur.y + dir[d].y;
                int dx = cur.x + dir[d].x;

                // 좌표가 배추밭을 벗어나게 되면
                if ( dx <0 || dy <0 || dx>= M || dy>=N ) continue;

                if( input[dy][dx] == 1 && visited[dy][dx] == false ) {
                    q.offer(new Node(dy, dx));
                    visited[dy][dx] = true; // 지나쳣으니까 true로 바꿔줌
                }
            }

        }

    }

    public static class Node {
        int x;
        int y;

        Node(int y, int x) {
            this.x = x;
            this.y = y;
        }
    }
}
