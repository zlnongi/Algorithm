import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());
        int[] arr = new int[n+1];

        StringTokenizer st1 = new StringTokenizer(br.readLine());
        for (int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(st1.nextToken());
        }

        int start = 0;
        int end = 0;
        int sum = 0;
        int min = Integer.MAX_VALUE;
        int cnt = 0;

        while (start<=n && end<=n) {

            if (sum < s) {
                sum += arr[end];
                end++;

            } else if (sum >= s) {
                sum -= arr[start];
                min = Math.min(min, end-start);
                start++;
            }
        }

        if (min == Integer.MAX_VALUE) System.out.println("0");
        else System.out.println(min);
    }
}
