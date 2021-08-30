import java.util.Arrays;
import java.util.Collections;

public class 문자열_내림차순으로_배치하기 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String s = "Zbcdefg";

        System.out.println(sol.solution(s));
    }

    public static class Solution{
        public String solution(String s){
            StringBuilder answer = new StringBuilder();
            char[] arrChars = s.toCharArray();
            Arrays.sort(arrChars);

            for(int i=arrChars.length - 1; i>=0; i--){
                answer.append(arrChars[i]);
            }

            return answer.toString();
        }
    }
}
