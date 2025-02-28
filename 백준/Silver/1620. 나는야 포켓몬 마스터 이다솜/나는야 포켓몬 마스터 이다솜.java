import java.io.*;
import java.util.*;

public class Main {
    public static void main (String[] args) throws IOException {
        // 첫째 줄: 도감에 수록되어 있는 포켓몬의 개수 N
        // 둘째 줄: 내가 맞춰야 하는 문제의 개수 M
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();

        HashMap<Integer,String> NumtoString = new HashMap<>(); // 숫 -> 문
        HashMap<String, Integer> StringtoNum = new HashMap<>(); // 문 -> 순
        // value에 맞는 key 값을 뽑아내려하니까 시간초과남

        for (int i=1; i<=N; i++) {
            String s = br.readLine(); // 문자열 입력
            NumtoString.put(i,s);
            StringtoNum.put(s,i);
        }

        for (int i=0; i<M; i++){
            String s = br.readLine(); // 문자열 입력
            if(s.charAt(0) >= 'A' && s.charAt(0) <= 'Z') { // 문자열이면 숫자로
                sb.append(StringtoNum.get(s)).append('\n');
            } else { // 숫자에서 문자로
                sb.append(NumtoString.get(Integer.parseInt(s))).append('\n');
            }

        }
        System.out.println(sb);
        
    }


}
