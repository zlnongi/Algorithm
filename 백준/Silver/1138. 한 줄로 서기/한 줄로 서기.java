import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[n];
        Arrays.fill(arr, -1);

        for (int i=0; i<n; i++) {
            int pc = Integer.parseInt(st.nextToken());
            int blankcnt = 0;
            for (int j=0; j<n; j++) {
                if(arr[j] == -1) {
                    if (blankcnt == pc) {
                        arr[j] = i+1;
                        break;
                    }
                    blankcnt++;
                }

            }

        }

        for (int i=0; i<n; i++) {
            System.out.print(arr[i] +" ");
        }




    }


}
