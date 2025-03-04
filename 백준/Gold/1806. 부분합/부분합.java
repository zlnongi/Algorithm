import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());
        int[] arr = new int[N+1];

        StringTokenizer st1 = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++) {
            arr[i] = Integer.parseInt(st1.nextToken());
        }

        int min = Integer.MAX_VALUE;
        int start = 0;
        int end = 0;
        int sum = 0;

        while (start <= N && end <= N) {
            if (sum >= S) {
                sum -= arr[start];
                min = Math.min(min, end-start);
                start++;
            } else if (sum < S) {
                sum += arr[end];
                end++;
            }
        }
        if (min == Integer.MAX_VALUE) System.out.println(0);
        else System.out.println(min);
    }
}
