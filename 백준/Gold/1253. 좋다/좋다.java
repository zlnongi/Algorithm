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
        }

        Arrays.sort(arr); // 정렬 해줘야됨 !!! 1 2 3 4 이런식으로 안 나올 수도 있으니까
        int cnt = 0;
        for (int i=0; i<n; i++) {
            int start = 0;
            int end = n-1;

            while (true) {  // 무한 루프 생성 후 break 통해 빠져나오는 패턴
                // 자기 자신을 더하는 건 안 되므로 이동시키는 것 !!
                if (start == i) start++;
                if (end == i) end--;
                if (start >= end) break;

                if (arr[start] + arr[end] < arr[i]) start++;
                else if (arr[start] + arr[end] > arr[i]) end--;
                else if (arr[start] + arr[end] == arr[i]) {
                    cnt++;
                    break;
                }
            }

        }
        System.out.println(cnt);

    }

}
