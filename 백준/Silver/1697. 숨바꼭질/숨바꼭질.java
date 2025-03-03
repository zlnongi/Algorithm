import java.util.*;
import java.io.*;

public class Main {
    public static int min = Integer.MAX_VALUE;
    public static int max = 100000;
    public static int N;
    public static int K;
    public static boolean[] visited;
    public static Queue<Node> q = new LinkedList<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        visited = new boolean[100001];
        bfs();
        System.out.println(min);



    }

    public static void bfs() {
        q.offer(new Node(N,0));
        while (!q.isEmpty()) {
            Node cur = q.poll();
            visited[cur.x] = true;
            if(cur.x == K) {
                min = Math.min(min, cur.time);
            }
            if (cur.x * 2 <= max && visited[cur.x * 2] == false) q.offer(new Node(cur.x * 2, cur.time+1));
            if (cur.x +1 <= max && visited[cur.x+1] == false) q.offer(new Node(cur.x + 1, cur.time+1));
            if (cur.x -1 >=0 && visited[cur.x-1] == false) q.offer(new Node(cur.x - 1 , cur.time+1 ));
        }

    }

    public static class Node {
        int x;
        int time;
        public Node(int x, int time) {
            this.x = x;
            this.time = time;
        }
    }


}
