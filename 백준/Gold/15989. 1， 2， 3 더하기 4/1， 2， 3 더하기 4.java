import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        int[][] dp = new int[100001][4]; // 100000보다 작거나 같다 이면 dp[100000]이 와야하는데 100001까지 크기를 만들어놔야 10000을 할 수 있음
        dp[1][1] = 1; // 1
        dp[2][1] = 1; // 1+1
        dp[2][2] = 1; // 2
        dp[3][1] = 1; // 1+1+1
        dp[3][2] = 1; // 1+2
        dp[3][3] = 1; // 3

        for (int i = 4; i<=10000; i++) {
            dp[i][1] = dp[i-1][1];
            dp[i][2] = dp[i-2][2] + dp[i-2][1];
            dp[i][3] = dp[i-3][3] + dp[i-3][2] + dp[i-3][1];
        }

        while(T-- > 0){
            int num = Integer.parseInt(br.readLine());
            sb.append(dp[num][1] + dp[num][2] + dp[num][3] + "\n");
        }
        System.out.println(sb);
    }

}
