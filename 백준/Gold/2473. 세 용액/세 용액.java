import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        long[] arr = new long[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i=0; i<n; i++) {
            arr[i] = Long.parseLong(st.nextToken());
        }

        Arrays.sort(arr);  // -97 -6 -2 6 98

        long sum = 0;
        long[] answer = new long[3]; // 세 용액 저장
        long min = Long.MAX_VALUE;
        for (int i=0; i<n; i++) {
            int start = 0;
            int end = n-1;

            while (start < end ) {
                if (start == i) {
                    start++;
                } else if (end == i) {
                    end--;
                } else {

                    sum = arr[start] + arr[end] + arr[i];

                    if (Math.abs(sum) < min) {  // 절대값이 작은게 0에 가까우니까
                        min = Math.abs(sum);
                        answer[0] = arr[start];
                        answer[1] = arr[end];
                        answer[2] = arr[i];

                    }

                    if (sum <= 0) {
                        start++;
                    } else {
                        end--;
                    }
                }
            }

        }

        Arrays.sort(answer);
        System.out.println(answer[0] + " "+ answer[1] + " "+ answer[2]);

    }
}
