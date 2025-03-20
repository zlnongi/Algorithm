import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] agrs) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        List<Integer> nums = new ArrayList<>();
        List<Integer> renums = new ArrayList<>();

        for (int i=0; i<n; i++) {
            int num = Integer.parseInt(br.readLine());
            if (num <= 0) {
                renums.add(num);
            } else {
                nums.add(num);
            }

        }

        Collections.sort(nums, Collections.reverseOrder());    // 내림차순
        Collections.sort(renums);   // 올림차순


        // 수열은 단 한번만 묶거나, 묶지 않아야 함
        // 최대가 되는 값이므로
        // 양수 -> 큰수 * 큰수 근데 이때 1이면 곱하는 것보다 더하는게 유리하므로 더해주기!!
        // 음수 배열은 절댓값 순이라 생각하면 뒤에서부터 절대값 큰 거 곱해줌
        // 0이랑 음수면 곱해서 없애주는게 좋음??

        int sum = 0;
        int numNow = 0;

        // 양수
        while (numNow<nums.size()) {
            if (numNow +1 < nums.size() && nums.get(numNow) != 1 && nums.get(numNow+1) != 1) {
                sum += nums.get(numNow) * nums.get(numNow+1);
                numNow += 2;
            }
            else { // numNow 1일떄
                sum += nums.get(numNow);
                numNow++;
            }
        }

        int minusNow = 0;
        // 음수
        while (minusNow < renums.size()) {
            if (minusNow+1 < renums.size()) {  // 얜 1이고 뭐고 상관없음 0이어도 걍 곱하면 그만
                sum += renums.get(minusNow) * renums.get(minusNow +1);
                minusNow += 2;
            } else {
                sum += renums.get(minusNow);
                break;
            }
        }

        System.out.println(sum);
    }

}
