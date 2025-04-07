import java.io.*;
import java.util.*;

public class Main {

    public static int n;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        Flower[] flowers = new Flower[n];

        for (int i=0; i<n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int startMonth = Integer.parseInt(st.nextToken());
            int startDay = Integer.parseInt(st.nextToken());
            int endMonth = Integer.parseInt(st.nextToken());
            int endDay = Integer.parseInt(st.nextToken());

            int start = startMonth*100 + startDay;
            int end = endMonth*100 + endDay;
            flowers[i]= new Flower(start, end);

        }

        Arrays.sort(flowers);

        int start = 301;
        int end = 1201;
        int cnt = 0;
        int max = Integer.MIN_VALUE;
        int index = 0;

        while (start < end){
            boolean isFinded = false;

            for (int i=index; i<n; i++) {
                if(flowers[i].start > start) {
                    break;
                }

                if (max < flowers[i].end) {
                    isFinded = true;
                    max = flowers[i].end;
                    index = i+1;
                }
            }

            if(isFinded) {
                start = max;
                cnt++;
            }
            else {
                break;
            }
        }

        if(max<end) {
            System.out.println(0);
        } else {
            System.out.println(cnt);
        }


    }

    public static class Flower implements Comparable<Flower> {

        int start;
        int end;

        Flower(int start, int end) {
            this.start = start;
            this.end = end;
        }

        @Override
        public int compareTo(Flower f) {
            if (this.start < f.start) {
                return -1;
            } else if (this.start == f.start) {
                if (this.end > f.end) {
                    return -1;
                } else if (this.end == f.end) {
                    return 0;
                }
                return 1;
            } else {
                return 1;
            }
        }

    }

}