import java.util.*;
import java.io.*;

public class Main {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int arr[][] = new int[n][2];

        for (int i=0; i<n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }
        // 입력

        // 종료 시간 기준으로 정렬하기
        Arrays.sort(arr,(o1, o2) -> {
            // 종료 시간 같으면 시작 시간 빠른 순
            if(o1[1] == o2[1]) {
                return o1[0] - o2[0];
            } else {
                return o1[1] - o2[1];
            }
        } );

        int cnt = 0;
        int endTime = 0;

        for (int i=0; i<n; i++) {
            if (endTime <= arr[i][0]) {  // 직전 종료 시간이 다음 회의 시간보다 작거나 같다면 갱신
                endTime = arr[i][1];
                cnt++;
            }
        }

        System.out.println(cnt);





    }

}
