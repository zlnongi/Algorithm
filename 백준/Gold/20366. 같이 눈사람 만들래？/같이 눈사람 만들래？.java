import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());    // 각 눈덩이의 지름
        }

        Arrays.sort(arr);


        int min = Integer.MAX_VALUE;

        for (int i=0; i<n; i++) {
            for (int j= i+1; j<n; j++) {
                int start = 0;
                int end = n-1;
                int snowman1 = arr[i] + arr[j];
                while (start<end) {
                    if(start == i || start == j) {
                        start++;
                        continue;
                    }
                    if(end==i || end==j) {
                        end--;
                        continue;
                    }
                    int snowman2 = arr[start] + arr[end];
                    min = Math.min(Math.abs(snowman2-snowman1), min);

                    if (snowman1 > snowman2) {
                        start++;
                    } else if (snowman1 < snowman2) {
                        end--;
                    } else {
                        System.out.println("0");
                        return;
                    }
                }
            }

        }
        System.out.println(min);


    }
}
