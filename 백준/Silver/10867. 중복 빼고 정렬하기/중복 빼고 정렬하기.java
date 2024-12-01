import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine()); // N
        StringTokenizer string = new StringTokenizer(reader.readLine()); // 공백으로 구분된 값

        // 1. 같은 수 제거
        // 2. 오름차순으로 정렬
        TreeSet<Integer> set = new TreeSet<>();
        for (int i = 0; i < N; i++) {
            set.add(Integer.parseInt(string.nextToken()));
        }

        ArrayList<Integer> list = new ArrayList<>(set);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < set.size(); i++ ){
            sb.append(list.get(i)).append(" ");
        }

        System.out.println(sb);



        reader.close();
    }

}
