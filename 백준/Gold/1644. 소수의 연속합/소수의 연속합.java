import java.io.*;
import java.util.*;

public class Main {
    public static boolean[] prime;
    public static ArrayList<Integer> primeList;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        prime = new boolean[n+1];
        primeList = new ArrayList<>();

        // 에라토스테네스의 체 알고리즘 -> 소수 찾는 코드
        for (int i=2; i*i <= n; i++) {
            if(!prime[i]) {
                for (int j = i*i; j<=n; j+= i) {
                    prime[j]= true;
                }
            }
        }

        for (int i=2; i<=n; i++) {
            if (!prime[i]) {
                primeList.add(i);
            }
        }

        int start = 0;
        int end = 0;
        int sum = 0;
        int cnt = 0;
        int size = primeList.size();

        while (end <= size) {
            if (sum >= n) {  // 합이 n보다 크면 start 증가
                if (sum == n) cnt++;
                sum -= primeList.get(start);
                start++;

            }
            // 합이 작으면 end ++
            else {
                if (end == size) break;
                sum += primeList.get(end);
                end++;
            }
        }
        System.out.println(cnt);




    }
}
