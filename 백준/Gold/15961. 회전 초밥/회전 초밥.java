import java.util.*;
import java.io.*;

// 슬라이딩 윈도우 + 투포인터

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());  // 벨트에 놓인 접시의 수
        int d = Integer.parseInt(st.nextToken());  // 초밥의 가짓수
        int k = Integer.parseInt(st.nextToken());  // 연속해서 먹는 접시의 개수
        int c = Integer.parseInt(st.nextToken());  // 쿠폰 번호

        int[] sushi = new int[n];
        int[] chk = new int[d+1];

        for (int i=0; i<n; i++) {
            sushi[i] = Integer.parseInt(br.readLine());    // 7 9 7 30 2 7 9 25
        }

        int cnt = 0;
        int max = 0;

        // 첫 윈도우
        for (int i=0; i<k; i++) {   // 7 9 7 30
            if (chk[sushi[i]] == 0) cnt++;  // 새로운 종류면 새로운 초밥수 증가
            chk[sushi[i]]++;  // 그 초밥의 개수 증가
        }

        if (chk[c]==0) {
            max = cnt+1;
        } else max = cnt;

        // 다음 윈도우
        for (int i=1; i<n; i++) {   // i-k
            int start = sushi[i-1];
            int end = sushi[(i+k-1)%n];

            chk[start]--;   // 첫번째 요소 제거
            if (chk[start] == 0) cnt--;

            if (chk[end] == 0) cnt ++;
            chk[end]++;

            int current = cnt;
            if (chk[c]==0) current++;

            max = Math.max(max, current);
        }
        System.out.println(max);



    }
}
