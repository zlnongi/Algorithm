import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PriorityQueue<Integer> card = new PriorityQueue<>();

        int n = Integer.parseInt(br.readLine());    // 카드 묶음수

        for(int i=0; i<n; i++) {
            card.add(Integer.parseInt(br.readLine()));
        }

        int sum=0;
        while(card.size() > 1) {
            int a = card.poll();
            int b=card.poll();
            card.add(a + b);

            sum += a+b;
        }

        System.out.println(sum);
    }


}
