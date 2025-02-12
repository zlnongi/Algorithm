import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         int n = Integer.parseInt(br.readLine());
         StringTokenizer st = new StringTokenizer(br.readLine(), " ");
         int[] request = new int[n];

         for (int i=0; i<n; i++) {
             request[i] = Integer.parseInt(st.nextToken());
         }  // 120 110 140 150

        Arrays.sort(request);  // 정렬해주기 110 120 140 150

         int budget = Integer.parseInt(br.readLine());  // 485

        int left = 0;
        int right = request[n-1];
       // int result = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2; // 첨에 230됨 -> 내야할 세금
            long budgetSum = 0; // 모든 지방 세금의 합

            for (int i = 0; i < n; i++) {
                if (request[i] < mid) {
                    budgetSum += request[i];
                } else {
                    budgetSum += mid;
                }
            }

            if (budgetSum > budget) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        System.out.println(right);


    }

}
