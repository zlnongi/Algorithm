import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String bomb = br.readLine();
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for (char c: str.toCharArray()) {
            stack.push(c);   // 문자를 스택에 넣음

            if(stack.size() >= bomb.length()) {   // 폭탄문자열보다 스택에 들어가있는 수가 더 많거나 같으면 확인필요
                boolean flag = true;
                for (int i=0; i<bomb.length(); i++) {   // 스택에 들어가있는 문자와 같은지 비교
                    if (bomb.charAt(i) != stack.get(stack.size() - bomb.length() + i)) {  // 같지 않으면
                        flag = false;
                        break;
                    }
                }
                if (flag) {   // 같으면 스택에서 Pop
                    for (int j=0; j<bomb.length(); j++) {
                        stack.pop();
                    }
                }

            }
        }

        if(stack.isEmpty()) {
            sb.append("FRULA");
        } else {
            for (char c : stack) {
                sb.append(c);
            }
        }

        System.out.println(sb);

    }

}
