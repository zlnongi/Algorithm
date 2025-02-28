import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i=0; i<n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());

            if (x>0) {
                pq.add(x);

            } else if (x == 0) {
               if (pq.isEmpty()) {
                    pq.add(0);
                }
                System.out.println(pq.poll());
            }
            
        }


    }

}
