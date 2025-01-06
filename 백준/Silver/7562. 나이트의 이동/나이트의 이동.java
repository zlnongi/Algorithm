import java.util.*;
import java.io.*;

public class Main {
    //public static int T;
    public static int I; // 체스판 크기
    public static int [][] input;
    public static int [][] visited;
    public static Node currentPosition;
    public static Node newPosition;


    public static Node[] dir = {
      new Node (-2,1),
      new Node (-1,2),
      new Node (1, 2),
      new Node(2,1),
      new Node(-2,-1),
      new Node(-1,-2),
      new Node(1,-2),
      new Node(2,-1)
    };

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine()); // test case 개수

        StringBuilder sb = new StringBuilder(); // 값 출력

        while(T-- > 0) {
            I = Integer.parseInt(br.readLine());

            StringTokenizer inputCurrentPosition = new StringTokenizer(br.readLine());
            currentPosition = new Node(Integer.parseInt(inputCurrentPosition.nextToken()), Integer.parseInt(inputCurrentPosition.nextToken()));

            StringTokenizer inputNewPosition = new StringTokenizer(br.readLine());
            newPosition = new Node(Integer.parseInt(inputNewPosition.nextToken()), Integer.parseInt(inputNewPosition.nextToken()));

            // bfs 실행
            sb.append(bfs()).append('\n');

        }
        // print문
        System.out.println(sb);


    }

    public static int bfs() {
        Queue<Node> q = new LinkedList<>();
        visited = new int [I][I]; // 방문 배열 -> 이동횟수 저장

        if (currentPosition.x == newPosition.x && currentPosition.y == newPosition.y) {
            return 0;
        }

        // 시작점
        q.offer(new Node(currentPosition.x, currentPosition.y)); // 값 넣어주기
        visited[currentPosition.x][currentPosition.y] = 1; // 시작 위치 방문 + 이동 횟수

        while (!q.isEmpty()) {
            Node current = q.poll();

            for(int d=0; d<8; d++) { // 8방향으로 탐색
                int newX = current.x + dir[d].x;
                int newY = current.y + dir[d].y;

                // 체스판 범위
                if(newX < 0 || newX >= I || newY < 0 || newY >= I) {
                    continue;
                }

                if(visited[newX][newY] == 0) {
                    if (newPosition.x == newX && newPosition.y == newY) { // 목적지까지 왔다!!!!!
                        return visited[current.x][current.y]; // 여기서 newX newY 쓰면 안됨!!! 현재 위치까지의 이동 횟수 필요
                    }

                    // 큐에 새로운 위치
                    q.offer(new Node(newX, newY));
                    visited[newX][newY] = visited[current.x][current.y] + 1; // 현재 이동횟수 + 1


                }
            }
        }

        return -1;

    }



    public static class Node {
        int x;
        int y;

        Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
