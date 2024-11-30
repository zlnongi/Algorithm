import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        
        Queue<Integer> queue = new LinkedList<>();
        ArrayList<Integer> result = new ArrayList<>();
        
        // queue에 1부터 N까지 숫자 넣기
        for (int i = 1; i <= N; i++) {
            queue.offer(i);
        }
        
        // 요세푸스 순열 만들기
        while (!queue.isEmpty()) {
            // K-1번 만큼 앞에서 빼서 뒤로 넣기
            for (int i = 0; i < K-1; i++) {
                queue.offer(queue.poll());
            }
            // K번째 수는 결과 리스트에 추가
            result.add(queue.poll());
        }
        
        // 결과 출력
        StringBuilder sb = new StringBuilder();
        sb.append("<");
        for (int i = 0; i < result.size(); i++) {
            sb.append(result.get(i));
            if (i < result.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append(">");
        
        System.out.println(sb.toString());
    }
}