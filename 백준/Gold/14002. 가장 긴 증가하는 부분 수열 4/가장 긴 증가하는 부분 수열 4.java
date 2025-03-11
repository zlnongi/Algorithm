import java.util.*;
import java.io.*;

public class Main {
    public static void main (String[] args) throws IOException{
        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        int[] dp = new int[n];   // 각 위치에서 끝나는 LIS 길이 저장

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int ans = 0;

        Arrays.fill(dp, 1);  // 모든 원소 그 자체로 길이 1인 LIS
        for (int i=0; i<n; i++) {
            for (int j=0; j<i; j++) {
                if (arr[i] > arr[j]) {
                    dp[i] = Math.max(dp[i], dp[j]+1);
                }
            }
            ans = Math.max(ans, dp[i]);
        }

        StringBuilder sb = new StringBuilder();
        sb.append(ans + "\n");

        int value = ans;
        Stack<Integer> stack = new Stack<>();
        for (int i = n-1; i >= 0; i--) {
            if (dp[i] == value) {
                stack.push(arr[i]);
                value--;
            }
        }
        while(!stack.isEmpty()) {
            sb.append(stack.pop() + " ");
        }

        System.out.println(sb);



    }

}
