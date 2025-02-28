import java.util.*;
import java.io.*;

public class Main {
    public static int[] arr;
    public static boolean[] visited;
    public static PriorityQueue<Integer> pq = new PriorityQueue<>();


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        arr = new int[N+1];
        visited = new boolean[N+1];
        for (int i=1; i<=N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        // 사이클이 발생하는 경우를 찾고,
        // 이 경우에 대한 최대의 사이클 개수를 센다.
        for (int i=1; i<=N; i++) {
            visited[i] = true;
            dfs(i, i);
            visited[i] = false;
        }

        StringBuilder sb = new StringBuilder();
        sb.append(pq.size()).append("\n");
        for (int num: pq) {
            sb.append(num).append("\n");
        }

        System.out.println(sb);
        br.close();

    }

    public static void dfs (int cur, int start) {
        if (arr[cur] == start) {
            pq.add(start);
        } else if (!visited[arr[cur]]) {
            visited[arr[cur]] = true;
            dfs(arr[cur], start);
            visited[arr[cur]] = false;
        }

    }

}
