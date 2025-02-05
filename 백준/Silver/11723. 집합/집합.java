import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader (new InputStreamReader(System.in));

        int M = Integer.parseInt(bufferedReader.readLine());
        StringBuilder result = new StringBuilder();
        Set<Integer> set = new HashSet<>();

        for (int i=0; i<M; i++) {
            StringTokenizer st = new StringTokenizer(bufferedReader.readLine());
            String cal = st.nextToken();
            int x;

            switch (cal) {
                case "add":
                    x = Integer.parseInt(st.nextToken());
                    set.add(x);
                    break;
                case "remove":
                    x = Integer.parseInt(st.nextToken());
                    set.remove(x);
                    break;
                case "check":
                    x = Integer.parseInt(st.nextToken());
                    if (set.contains(x)) {
                        result.append(1+ "\n");
                    } else {
                        result.append(0+ "\n");
                    }
                    break;
                case "toggle":
                    x = Integer.parseInt(st.nextToken());
                    if (set.contains(x)) {
                        set.remove(x);
                    } else {
                        set.add(x);
                    }
                    break;
                case "all":
                    for (int j=1; j<=20; j++) {
                        set.add(j);
                    }
                    break;
                case "empty":
                    set.clear();
                    break;
            }


        }
        System.out.println(result);
    }

}
