import java.io.*;
import java.util.*;

public class Main {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] dp = new int[n+1][n+1];

        for (int i=1; i<=n; i++) {
            StringTokenizer st1 = new StringTokenizer(br.readLine());
            for (int j=1; j<=n; j++) {
                dp [i][j] = dp[i][j-1] + Integer.parseInt(st1.nextToken());     // 누적합
            }
        }

        for (int i =0; i<m; i++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            int sum = 0;

            int x1 = Integer.parseInt(st2.nextToken());
            int y1 = Integer.parseInt(st2.nextToken());
            int x2 = Integer.parseInt(st2.nextToken());
            int y2 = Integer.parseInt(st2.nextToken());

            for (int j = x1; j<=x2; j++) {
                sum = sum + (dp[j][y2] - dp[j][y1-1]);
            }

            System.out.println(sum);

        }



    }


}
