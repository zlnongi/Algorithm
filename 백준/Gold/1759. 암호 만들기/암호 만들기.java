import java.util.*;
import java.io.*;


public class Main {
    public static int l,c;
    public static char[] word;
    public static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());


        l = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());

        word = new char[c];
        visited = new boolean[c];

        StringTokenizer st1 = new StringTokenizer(br.readLine());
        for (int i=0; i<c; i++) {
            word[i] = st1.nextToken().charAt(0);
        }

        Arrays.sort(word);

        dfs(0, 0);


    }

    public static void dfs(int start, int cnt) {
       if (cnt==l) { // 문자수가 4개일때 종료
           String code = "";
           int mo = 0;  // 모음
           int ja = 0;  // 자음

           for (int i=0; i<c; i++) {
               if (visited[i]) {
                    code += word[i];
                    if (word[i] == 'a' || word[i]=='e' || word[i]=='i' || word[i]=='o' || word[i]=='u') {
                        mo++;
                    } else {  // 자음일때
                        ja++;
                    }
               }
           }

           if ( mo >= 1 && ja >=2) {
               System.out.println(code);
           }


       }

       for(int i=start; i<c;i++) {   // 재귀 호풀 후 visited[i] =  false로 해당 문자 선택 취소하여 다른 조합 탐색하게
           visited[i] = true;
           dfs(i+1, cnt+1);
           visited[i] = false;

       }

    }



}
