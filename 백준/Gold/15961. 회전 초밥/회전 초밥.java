import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        int[] chobab = new int[n];
        for (int i=0; i<n; i++) {
            chobab[i] = Integer.parseInt(br.readLine());    // 7 9 7 30 2 7 9 7 30
        }

        int[] chk = new int[d+1];
        int cnt = 0;
        int max = 0;
        // 가장 초기에 초밥 어디에 머 있는지 넣어주기
        for (int i=0; i<k; i++) {
            if(chk[chobab[i]] == 0) cnt++;
            chk[chobab[i]]++;
        }   // 7 9 7 30

        // 초기 최대값 계산
        if (chk[c] ==0 ) max = cnt+1;
        else max = cnt;

        // 초기 다음부터 윈도우
        for (int i=1; i<n; i++) {  // 1~7
            int start = chobab[i-1];   // 제거될 요소
            int end = chobab[(i+k-1)%n];    // 추가될 요소

            chk[start]--;  // 9 7 30
            if(chk[start]==0) cnt--;

            if(chk[end]==0) cnt++;
            chk[end]++;

            int current = cnt;
            if (chk[c]==0) current++;
            max = Math.max(max, current);


        }
        System.out.println(max);
    }


}
