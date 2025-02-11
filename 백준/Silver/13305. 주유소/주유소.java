import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 4
        int[] distance = new int[N-1];  // 3
        int[] cost = new int[N];  // 4

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for (int i=0; i<N-1; i++) { // 2 3 1
            distance[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine(), " ");
        for (int i=0; i<N ; i++) {
            cost[i] = Integer.parseInt(st.nextToken());
        }

        int sum = 0;
        int minCost = cost[0];

        for (int i=0; i<N-1; i++) {
            if (cost[i] < minCost) {
                minCost = cost[i];
            }
            sum += minCost * distance[i];
        }

        System.out.println(sum);

    }

}
