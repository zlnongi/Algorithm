import java.util.*;
import java.io.*;

// n번째 큰 수 우선순위 큐
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());  // 우선순위 높은 순이므로
        int n = Integer.parseInt(br.readLine());

        for(int i=0; i<n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j =0; j<n; j++) {
                pq.add(Integer.parseInt(st.nextToken()));
            }
        } // 격자판 입력

        for(int i=0; i<n-1; i++) {
            pq.poll();
        }

        System.out.println(pq.poll());
        


    }

}
