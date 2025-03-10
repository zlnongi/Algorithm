import java.util.*;
import java.io.*;

public class Main {
    public static int n, k;
    public static boolean[] visited;
    public static int[] dist;
    public static int[] parents;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        // input

        bfs(n,k);

        System.out.println(dist[k]);
        pathToK(parents, k);

    }
    public static void bfs(int n, int k) {
        Queue<Integer> q = new LinkedList<>();
        dist = new int [100001];
        Arrays.fill(dist, -1);  // 모든 위치 미방문 상태로
        parents = new int[100001];    // 경로 추적 위한 부모 노드 배열
        Arrays.fill(parents, -1);

        q.offer(n);
        dist[n] = 0;

        while(!q.isEmpty()) {
            int current = q.poll();

            int[] nextPosition = new int[]{current-1, current+1, current*2};
            for(int i=0; i<nextPosition.length; i++) {
                int nextNode = nextPosition[i];
                if( 0<=nextNode && nextNode <=100000 && dist[nextNode] == -1) { // 범위 내이고 방문 x 상태
                    q.offer(nextNode);
                    dist[nextNode] = dist[current] + 1;
                    parents[nextNode] = current;

                    if(nextNode == k) {
                       // q.clear();
                        break;
                    }
                }


            }

        }
    }

    public static void pathToK(int[] parents, int k) {
        int i = k;
        StringBuilder sb = new StringBuilder();


        while(i != -1) {
            sb.insert(0, i + " ");
            i = parents[i];
        }

        System.out.println(sb.toString().trim());
    }

}
