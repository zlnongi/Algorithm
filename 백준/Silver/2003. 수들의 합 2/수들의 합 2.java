import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] num = new int[n];

        StringTokenizer st1 = new StringTokenizer(br.readLine());
        for (int i=0; i<n; i++) {
            num[i] = Integer.parseInt(st1.nextToken());
        }

        int start = 0;
        int sum = 0;
        int cnt = 0;

        for (int end=0; end<n; end++) {
            sum += num[end];
            if (sum == m) cnt++;
            while (sum >= m) {
                sum -= num[start];
                if(sum == m) cnt++;
                start++;
            }

        }
        System.out.println(cnt);
    }

}
