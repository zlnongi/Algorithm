import java.io.*;
import java.util.*;

public class Main {
    public static void main (String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader (System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // 정렬
        Arrays.sort(arr);

        int start = 0;
        int end = n-1;
        // min 에는 0에서 뺀 것 절대값이 가장 작은거!!!
        int min = Integer.MAX_VALUE;


        while (start < end) {
            int sum = arr[start] + arr[end];
            // sum이 절대값으로 했을 때 더 작은 친구를 min으로 두기 -> 먀이너스 붙어있는 애면 어떡하지?... 하 그럼 그냥 그 뺀 값을 다시 리턴해줘야함

            if (Math.abs(sum) < Math.abs(min)) {
                min = sum;
            }
            if (sum == 0) {
                break;
            } else if (sum > 0) {
                end--;
            } else if (sum < 0) {
                start ++;
            }


        }

        System.out.println(min);


    }

}
