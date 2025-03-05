import java.util.*;
import java.io.*;

// 선분의 기울기 활용
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] buildingHeight = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i=0; i<n; i++) {
            buildingHeight[i] = Integer.parseInt(st.nextToken());
        }

        int maxCnt = 0;
        for (int i=0; i<n; i++) {   // 각 빌딩마다 계산
            double leftHighInclination = -1000000000;  // 왼쪽 기울기 최대
            double rightHighInclination = -1000000000;  // 오른쪽 기울기 최대
            int leftCnt = 0;    // 왼쪽에서 볼 수 있는 빌딩 수
            int rightCnt = 0;    // 오른쪽에서 볼 수 있는 빌딩 수

            // 왼쪽에서 볼 때
            for (int j= i-1; j >= 0; j--) {
                // 기울기 : (높이차이) / (i-j)
                double tempInclination = (double) (buildingHeight[j]-buildingHeight[i])/(i-j);   // 다른건물에서 현재선택된 빌딩까지의 기울기
                if (tempInclination > leftHighInclination) {
                    leftHighInclination = tempInclination;
                    leftCnt++;
                }
            }

            // 오른쪽에서 볼 때
            for (int j = i+1; j<n; j++) {
                // 기울기 : (높이차이) / (j-i)
                double tempInclination = (double) (buildingHeight[j] - buildingHeight[i]) / (j-i);
                if (tempInclination > rightHighInclination) {
                    rightHighInclination = tempInclination;
                    rightCnt++;
                }
            }
            int sumCnt = leftCnt + rightCnt;
            maxCnt = Math.max(maxCnt, sumCnt);
        }

        System.out.println(maxCnt);






    }

}
