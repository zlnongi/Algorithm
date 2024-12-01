import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader (new InputStreamReader(System.in)); // N
        int N = Integer.parseInt(reader.readLine());
        StringTokenizer st = new StringTokenizer(reader.readLine()); // N 숫자카드

        int M = Integer.parseInt(reader.readLine());
        StringTokenizer st1 = new StringTokenizer(reader.readLine()); // M

        // 1. Hashmap
        HashMap<Integer, Boolean> map = new HashMap<>();
        for (int i = 0; i < N; i++){
            map.put(Integer.parseInt(st.nextToken()), Boolean.TRUE); // {1=true, 3=true, 5=true, 7=true} 이런 구조로 저장
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < M; i++){
            if(map.containsKey(Integer.parseInt(st1.nextToken()))){
                sb.append("1 ");
            } else {
                sb.append("0 ");
            }
        }

        System.out.println(sb);
        reader.close();



    }

}
