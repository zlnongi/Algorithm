import java.io.*;
import java.util.*;

public class Main {

    public static List<Node>[] graph;
    public static int[] maxWeight;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] temp = br.readLine().split(" ");

        int N = Integer.parseInt(temp[0]); // 섬
        int M = Integer.parseInt(temp[1]); // 다리

        graph = new LinkedList[N + 1];
        maxWeight = new int[N + 1]; //dist

        for (int i = 1; i <= N; i++) {
            graph[i] = new LinkedList<>();
            maxWeight[i] = -1;
        }

        for (int i = 1; i <= M; i++) {
            temp = br.readLine().split(" ");

            int A = Integer.parseInt(temp[0]);
            int B = Integer.parseInt(temp[1]);
            int C = Integer.parseInt(temp[2]);

            graph[A].add(new Node(B, C)); // 양방향
            graph[B].add(new Node(A, C));
        }

        temp = br.readLine().split(" ");
        int start = Integer.parseInt(temp[0]);
        int end = Integer.parseInt(temp[1]);

        int maxWeight = dijkstra(start, end);

        System.out.println(maxWeight);
    }

    public static int dijkstra(int start, int end) {
        PriorityQueue<Node> pq = new PriorityQueue<>((o1, o2) -> Integer.compare(o2.weight, o1.weight)); // 가중치 큰 간선 우선

        maxWeight[start] = Integer.MAX_VALUE;
        pq.add(new Node(start, maxWeight[start]));

        while (!pq.isEmpty()) {
            Node n = pq.poll();

            if(n.weight < maxWeight[n.num]) continue;


            for (Node next : graph[n.num]) {
                int currWeight = Math.min(n.weight, next.weight);
                if (currWeight > maxWeight[next.num]) {
                    maxWeight[next.num] = currWeight;
                    pq.add(new Node(next.num, maxWeight[next.num]));
                }
            }
        }

        return maxWeight[end];
    }

    public static class Node {

        int num;
        int weight;

        public Node(int num, int weight) {
            this.num = num;
            this.weight = weight;
        }
    }


}