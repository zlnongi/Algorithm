import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i=0; i<N; i++) {
            arr[i] = Integer.parseInt(st.nextToken()); // 배열에 잘 들어갓다
        }

        Arrays.sort(arr); // 정렬 필요

        int start = 0;
        int end = N-1;
        int cnt = 0;

        while (start < end) { // 
            int sum = arr[start] + arr[end];
            if (sum < M) {
                start++;
            } else if (sum > M) {
                end--;
            } else {
                cnt++;
                end --;
                start++;
            }
        } System.out.println(cnt);



    }

}
