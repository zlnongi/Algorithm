import java.util.*;
import java.io.*;

public class Main {
    public static int num;
    public static int connect;
    public static int[][] map;
    public static boolean[] visited;
    public static Queue<Integer> q = new LinkedList<>();
    public static int answer;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        num = Integer.parseInt(br.readLine());
        connect = Integer.parseInt(br.readLine());
        map = new int[num+1][num+1];
        visited = new boolean[num+1];

        for(int i=0; i<connect; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());

            map[u][v] = 1;
            map[v][u] = 1;

        }

        if (visited[1] == false) {

            bfs();
        }
        System.out.println(answer);
    }

    public static void bfs() {
        visited[1] = true;
        q.offer(1);
        answer = 0;

        while(!q.isEmpty()) {
            int cur = q.poll();

            for(int i=1; i<=num; i++) {
                if (map[cur][i] == 1 && visited[i]==false) {
                    visited[i] = true;
                    q.offer(i);
                    answer ++;
                }
            }
        }
    }

}
