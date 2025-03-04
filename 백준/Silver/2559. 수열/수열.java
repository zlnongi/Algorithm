import java.util.*;
import java.io.*;

// 누적합
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[] ondo = new int[N+1];
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        for (int i=1; i<=N; i++) {
            ondo[i] = ondo[i-1] + Integer.parseInt(st1.nextToken());
        }  // 입력

        int sum = 0;
        int max = Integer.MIN_VALUE;

        for (int i=1; i<=N-K+1; i++) {
            int start = i;
            int end = i+K-1;
            sum = ondo[end] - ondo[start-1];
            max = Math.max(max, sum);
        }
        System.out.println(max);

    }


}
