import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int P = Integer.parseInt(br.readLine());
        int[] arr = new int[20];

        for (int i =0; i<P; i++) {
            int cnt = 0;
            StringTokenizer st = new StringTokenizer(br.readLine());
            Integer.parseInt(st.nextToken());

            for (int j =0; j<20; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
            }

            for (int j =0; j<20; j++) {
                for (int k = 0; k < j; k++) {
                    if (arr[j] < arr[k]) {
                        cnt++;
                    }
                }
            }

            System.out.println((i+1)+ " " +cnt);

        }





    }
}
