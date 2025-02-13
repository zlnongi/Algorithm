import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int H = Integer.parseInt(st.nextToken());
        int W = Integer.parseInt(st.nextToken());

        int[] height = new int[W];
        st = new StringTokenizer(br.readLine(), " ");
        for (int i=0; i<W; i++) {
            height[i] = Integer.parseInt(st.nextToken());
        }

        int count = 0;
        for (int i = 1; i< W-1; i++) {  // 2번째부터 마지막까지
            int left = 0;
            int right = 0;

            // 왼쪽 최대벽 높이 탐색
            for (int j = 0; j< i; j++) {
                if (height[j] > height[i]) {
                    left = Math.max(left, height[j]);
                }
            }

            // 오른쪽 최대벽 높이
            for (int j = i+1; j<W ; j++) {
                if (height[j] > height[i]) {
                    right = Math.max(right, height[j]);
                }
            }

            // 현재 열 벽이 왼쪽, 오른쪽 벽보다 작을 때
            if(height[i] < left && height[i] < right) {
                count += Math.min(left,right) - height[i];
            }
        }
        System.out.println(count);

    }

}
