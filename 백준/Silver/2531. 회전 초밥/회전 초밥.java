import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());  // 회전초밥벨트에 놓인 접시의 수
        int d = Integer.parseInt(st.nextToken());  // 초밥의 가짓수
        int k = Integer.parseInt(st.nextToken());  // 연속해서 먹는 접시의 수
        int c = Integer.parseInt(st.nextToken());  // 쿠폰 번호
        int[] chobab = new int[n];

        for (int i=0; i<n; i++) {
            chobab[i] = Integer.parseInt(br.readLine());
        }
        int[] chk = new int[d+1];  // c까지 포함

        int cnt = 0;
        int max = 0;
        for (int i=0; i<k; i++) {
            if (chk[chobab[i]]== 0) cnt ++;
            chk[chobab[i]] ++;
        }

        // 초기 윈도우에 대한 최대값 계산 (쿠폰 포함)
        if (chk[c]==0) max = cnt+1;
        else max = cnt;

        for (int i=1; i<n ;i++) {
            if(max <= cnt) {
                if (chk[c]==0) max = cnt+1;
                else max = cnt;
            }

            int start = chobab[i-1];
            int end = chobab[(i+k-1)%n];

            // 가장 왼쪽 요소 제거
            chk[start]--;
            if (chk[start]==0) cnt--;

            if(chk[end]==0) cnt++;
            chk[end]++;

            // 현재 윈도우에 대한 최대값 계산 (쿠폰 포함)
            int current = cnt;
            if (chk[c]==0) current++;
            max = Math.max(max, current);
        }
        System.out.println(max);

    }

}
