import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        HashSet<String> set = new HashSet<>();  // 중복 불허, 순서보장없는 집합


        int N = Integer.parseInt(st.nextToken());
        String game = st.nextToken();

        for (int i = 0; i<N; i++) {
            String name = br.readLine();
            set.add(name);  // 중복 없이 집합에 저장
        }

        int cnt = 0;
        if (game.equals("Y")) {
            System.out.println(set.size()/1);
        } else if (game.equals("F")) {
            System.out.println(set.size()/2);
        } else {
            System.out.println(set.size()/3);
        }


    }


}
