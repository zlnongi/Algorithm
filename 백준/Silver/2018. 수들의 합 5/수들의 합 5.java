import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int start = 1;
        int end = 1;
        int sum = 1;
        int cnt = 0;

        while (start <= N){
            if (sum < N) {
                end ++;
                sum += end;
            } else if (sum > N) {
                sum -= start;
                start ++;
            } else {
                cnt ++;
                end ++;
                sum += end;
            }
        }
        System.out.println(cnt);


    }

}
