import java.util.*;
import java.io.*;

public class Main {
    // 전역 변수로 사용하자
    public static int min = Integer.MAX_VALUE;
    public static int N, K;
    public static boolean visited[];
    static int max = 100000;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " "); // 공백으로 분리

        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        visited = new boolean[1000001];
        bfs();
        System.out.println(min);
        // 최소비용 찾는 문제이므로 bfs 사용


    }

    public static void bfs() {
        Queue<Node> q = new LinkedList<>();
        q.offer(new Node(N,0));

        while (!q.isEmpty()) {
            Node node = q.poll();
            visited[node.x] = true;
            if (node.x == K) {
                min = Math.min(min, node.time);
            }
            if(node.x * 2 <= max && visited[node.x * 2] == false) q.offer(new Node(node.x * 2, node.time));
            if(node.x + 1 <= max && visited[node.x + 1] == false) q.offer(new Node(node.x + 1, node.time + 1));
            if(node.x - 1 >= 0 && visited[node.x - 1] == false) q.offer(new Node(node.x - 1, node.time + 1));
        }


    }

    public static class Node {
        int x;
        int time ;

        Node(int x, int time) {
            this.x=x;
            this.time=time;
        }
    }

}
