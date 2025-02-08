import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int newScore = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());

        int[] rankScore = new int[N];

        if (N > 0) {
            st = new StringTokenizer(br.readLine());
            for (int i=0; i<N; i++) {
                rankScore[i] = Integer.parseInt(st.nextToken());
            }
        } else {
            System.out.println("1");
            return;
        }

       // Arrays.sort(rankScore);

        if (P==N && rankScore[rankScore.length -1] >= newScore) {
            System.out.println("-1");
        } else {
            int rank = 1;
            for (int i=0; i<N; i++) {
                if (rankScore[i] > newScore) {
                    rank ++;
                }
            }
            System.out.println(rank);
        }



    }

}
