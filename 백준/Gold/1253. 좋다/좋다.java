import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }  // 입력

        Arrays.sort(arr);

        int cnt = 0;
        for (int i=0; i<n; i++) {  // 0-n까지
            int start = 0;
            int end = n-1;

            while(start < end) { // 진짜????>........ 조건(이분탐색이거나 투포인트의 경우 start<end)을 걸기..............
                if (start == i) {
                    start++;
                    continue;
                } else if (end == i){
                    end--;
                    continue;
                }

                int sum = arr[start] + arr[end];

                if (sum == arr[i]) {  // 내가 원하는 조건
                    cnt++;
                    break;
                } else if (sum > arr[i]) {
                    end--;
                } else {
                    start++;
                }

            }

        }
        System.out.println(cnt);


    }

}
