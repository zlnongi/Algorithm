import java.util.*;
import java.io.*;

public class Main {
    public static int n = 0;
    public static int cnt = 0;
    public static Egg[] egg;
    public static int max = Integer.MIN_VALUE;

    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        egg = new Egg[n];

        for (int i=0; i<n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            egg[i] = new Egg(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
        }

        solve(0);

        System.out.println(max);

    }

    public static void solve(int k) {
        // 모든 계란 다 들어봤으면 최대값 갱신하고 종료
        if (k == n) {
            max = Math.max(max, cnt);
            return;
        }

        // 현재 들고 있는 계란이 깨졌거나, 이미 나머지 모든 계란이 깨진 경우
        if (egg[k].durability <= 0 || cnt == n-1) {
            solve(k+1);
            return;
        }

        // 모든 계란에 대해 현재 계란으로 계란치기 시도
        for (int i=0; i<n; i++) {
            // 자기 자신이거나 이미 깨진 계란은 건너뜀
            if(i==k || egg[i].durability <= 0) {
                continue;
            }
            // k번째 계란이 내가 들고있는거고 i번째 계란이 내가 치려는 계란임
            // 치려는게 깨져있을 경우 넘어가야함

            // k번째 계란으로 i번째 계란을 침
            egg[k].durability = egg[k].durability - egg[i].weight;
            egg[i].durability = egg[i].durability - egg[k].weight;

            // 깨진 계란 카운트 업데이트
            if(egg[i].durability <= 0) {
                cnt++;
            }
            if(egg[k].durability <= 0) {
                cnt++;
            }

            // 다음 계란으로 재귀호출
            solve(k+1);

            // 상태 되돌리기
            if(egg[i].durability <= 0){
                cnt--;
            }
            if(egg[k].durability <= 0){
                cnt--;
            }
            egg[k].durability = egg[k].durability + egg[i].weight;
            egg[i].durability = egg[i].durability + egg[k].weight;


        }
    }



    public static class Egg {
        int durability;
        int weight;

        Egg(int durability, int weight) {
            this.durability = durability;
            this.weight = weight;

        }
    }
}
