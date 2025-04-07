import java.io.*;
import java.util.*;

public class Main {
    public static int[] arr1;
    public static int[] arr2;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader (System.in));

        int n = Integer.parseInt(br.readLine());
        int[] A = new int[n];
        int[] B = new int[n];
        int[] C = new int[n];
        int[] D = new int[n];

        for (int i=0; i<n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            A[i] = Integer.parseInt(st.nextToken());
            B[i] = Integer.parseInt(st.nextToken());
            C[i] = Integer.parseInt(st.nextToken());
            D[i] = Integer.parseInt(st.nextToken());
        }

        arr1 = new int[n*n];  // A와 B의 모든 조합의 합
        arr2 = new int[n*n];   // C와 D의 모든 조합의 합
        int idx = 0;
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                arr1[idx] = A[i] + B[j];
                arr2[idx] = C[i] + D[j];
                idx++;
            }
        }

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        long answer = 0;
        int start = 0;
        int end = n*n-1;

        while (start<n*n && end>=0) {
            if(arr1[start] + arr2[end] < 0) {
                start++;
            } else if (arr1[start] + arr2[end] >0) {
                end--;
            } else {   // arr1[start] + arr2[start] = 0일 때 같은 값이 여러 개 있는 경우를 고려해줘야됨
                long startCnt = 1;
                long endCnt = 1;
                while (start + 1< n*n && (arr1[start] == arr1[start+1])) {
                    startCnt++;
                    start++;
                }
                while (end >0 && (arr2[end]== arr2[end-1])) {
                    endCnt++;
                    end--;
                }
                answer += startCnt * endCnt;
                start++;

            }
        }

        System.out.println(answer);




    }


}
