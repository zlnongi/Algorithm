import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] ondo = new int[n+1];

        StringTokenizer st1= new StringTokenizer(br.readLine());
        for (int i=1; i<=n; i++) {
            ondo[i] = Integer.parseInt(st1.nextToken());
        }
        int max = Integer.MIN_VALUE;

        for (int i=1; i<=n-k+1; i++) {
            int sum = 0;

            for (int j = i; j <= i+k-1; j++) {
                sum += ondo[j];
            }

            if (max < sum) max = sum;

        }
        System.out.println(max);


    }
}
