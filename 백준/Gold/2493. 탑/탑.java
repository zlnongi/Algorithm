import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());  // 탑의 수
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();

        Stack<int []> tower = new Stack<>(); // 탑 저장용 스택

        for (int i=1; i<=N; i++) {
            int height = Integer.parseInt(st.nextToken()); // 높이 입력

            while (!tower.isEmpty()) {
                if(tower.peek()[0] > height) {  // 첫 요소 비교
                    sb.append(tower.peek()[1] + " ");
                    break;
                }
                tower.pop();
            }


            if (tower.isEmpty()) {
                sb.append("0 ");
            }
            tower.push(new int[] {height, i});
        }
        System.out.println(sb.toString());
    }

}
