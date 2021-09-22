import java.util.*;

public class 짝지어_제거하기 {
    public static void main(String[] args) {
        String s = "cdcd";

        짝지어_제거하기 sol = new 짝지어_제거하기();
        System.out.println(sol.solution(s));
    }

    public int solution(String s)
    {
        int answer = 0;
        char prevChr = ' ';
        char curChr = ' ';
        StringBuilder sb = new StringBuilder(s);

        Stack<Character> stack = new Stack<Character>();

        for(int i=0; i<sb.length(); i++){
            curChr = sb.charAt(i);

            if (stack.size() != 0){
                prevChr = stack.pop();

                if (curChr != prevChr){
                    stack.push(prevChr);
                    stack.push(curChr);
                }

            }
            else {
                stack.push(curChr);
            }
        }

        if (stack.size() == 0){
            answer = 1;
        }
        else {
            answer = 0;
        }
        
        return answer;
    }
}