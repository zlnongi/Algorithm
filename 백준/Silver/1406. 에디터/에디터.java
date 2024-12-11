import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String N = br.readLine(); // 편집기에 입력되어 있는 문자열
        int M = Integer.parseInt(br.readLine()); // 입력할 명령어 개수

        // edit되는 string
        StringBuilder newN = new StringBuilder(N);
        // 커서 -> 문장의 맨 뒤에 위치
        int cursor = newN.length();

        // M개의 줄에 걸쳐 입력할 명령어
        // 명령어 L D B P
        for (int i =0; i < M; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine()); // P x 이런 식으로

            char command = st.nextToken().charAt(0); // 첫번째 글자

            switch (command) {
                case 'L':
                    if (cursor > 0) cursor--;
                    break;
                case 'D':
                    if (cursor < newN.length()) cursor++;
                    break;
                case 'B':
                    if (cursor > 0) {
                        newN.deleteCharAt(cursor-1);
                        cursor--;
                    }
                    break;
                case 'P':
                    newN.insert(cursor,st.nextToken());
                    cursor++;
                    break;

            }
        }
        System.out.println(newN);



        br.close();
    }
}
