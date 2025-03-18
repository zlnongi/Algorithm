import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int[] lis = LIS(arr);

        int[] reversedArr = new int[n];
        for (int i=0; i<n; i++) {
            reversedArr[i] = arr[n-1-i];  // 뒤집어서 lds 값
        }
        int[] lds = LIS(reversedArr);

        int max = Integer.MIN_VALUE;
        for (int i=0; i<n; i++) {
            int len = lis[i] + lds[n-1-i] - 1;
            max = Math.max(max, len);
        }

        System.out.println(max);



    }

    public static int[] LIS(int[] arr) {
        int n = arr.length;
        int[] dp = new int[n];

        Arrays.fill(dp, 1);

        for (int i = 1; i<n; i++) {
            for (int j=0; j<i; j++) {
                if (arr[j] < arr[i]) {
                    dp[i] = Math.max(dp[i], dp[j]+1);
                }
            }
        }

        return dp;
    }
}