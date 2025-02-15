import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());

        StringTokenizer st1 = new StringTokenizer(br.readLine());
        int[] visitSumList = new int[N+1];
        for (int i = 1; i <= N; i++) {
            visitSumList[i] = visitSumList[i-1] + Integer.parseInt(st1.nextToken());
        }

        int maxVisit = 0;
        int maxVisitCount = 0;
        for (int i=X; i<=N; i++) {
            int currentVisit = visitSumList[i] - visitSumList[i-X];
            if (currentVisit > maxVisit) {
                maxVisit = currentVisit;
                maxVisitCount = 1;
            } else if (currentVisit == maxVisit) {
                maxVisitCount++;
            }
        }

        if (maxVisit == 0) {
            System.out.println("SAD");
        } else {
            System.out.println(maxVisit);
            System.out.println(maxVisitCount);
        }

    }
}