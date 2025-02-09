import java.util.*;
import java.io.*;

public class Main { // 틀렸다 왜 자꾸 배열 생각을 아예 못하는거지 나는... 생각도 잘 안났음 ㅠㅠ
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int switchNum = Integer.parseInt(br.readLine()); // 스위치 개수
        int[] bulb = new int[switchNum+1]; // 스위치 개수만큼 배열 만들어주기

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 1; i <= switchNum; i++) {
           // int N = Integer.parseInt(st.nextToken());
            bulb[i] = Integer.parseInt(st.nextToken()); // 배열 안에 하나씩 넣어줌 아 이렇게 해야하는구나
        }

        int studentNum = Integer.parseInt(br.readLine()); // 학생 수

        for (int i=1; i<=studentNum; i++) {
            st = new StringTokenizer(br.readLine());

            int gender = Integer.parseInt(st.nextToken());  // 1 : 남학생 2 : 여학생
            int number = Integer.parseInt(st.nextToken());

            if (gender == 1) {
                for (int j=1; j<=switchNum; j++) { // 배수면 switch 바꿈
                    if (j%number ==0) {
                        if (bulb[j] ==0) bulb[j] = 1;
                        else bulb[j] = 0;
                    }
                }
            } else { // 여자의 경우
                // 주어진 번호는 무조건 변경
                if (bulb[number] ==0 ) bulb[number] = 1;
                else bulb[number] = 0;

                for(int j=1; j<=switchNum/2; j++) {
                        int left = number - j; // 수의 왼쪽
                        int right = number  + j; // 수의 오른쪽

                        // 범위 벗어나면 그대로 종료
                        if (right > switchNum || left < 1)
                            break;

                        if (bulb[left] == bulb[right]) {
                            if (bulb[left] == 0){
                                bulb[left] = 1;
                                bulb[right] = 1;
                            }
                            else  {
                                bulb[right] = 0;
                                bulb[left] = 0;
                            }
                        }
                        else
                            break;
                    }

                }
            }
        // 20번째마다 다른 줄에 출력 !!!!
        for (int i=1; i<=switchNum; i++) {
            System.out.print(bulb[i] + " "); // 옆으로 출력하다가
            // 20번쨰 되면 다른 줄로 출력
            if ( i%20 ==0) System.out.println();
        }

        }

}
