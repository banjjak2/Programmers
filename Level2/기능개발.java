import java.util.*;

public class 기능개발 {
    public static void main(String[] args) {
        기능개발 sol = new 기능개발();
        int[] progresses = {
            95, 90, 99, 99, 80, 99
        };
        int[] speeds = {
            1, 1, 1, 1, 1, 1
        };

        int[] answer = sol.solution(progresses, speeds);
        for (int i : answer) {
            System.out.println(i);
        }
    }

    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};
        int maxDay = 0;
        int releaseDay = 0;

        Stack<Integer> stack = new Stack<Integer>();
        int tmp = 0;
        for(int i=0; i<progresses.length; i++){
            releaseDay = (int)Math.ceil((double)(100 - progresses[i]) / speeds[i]);

            if (!stack.isEmpty()){
                if (maxDay >= releaseDay){ // 현재 배포시간이 앞쪽 배포 시간보다 작거나 같으면
                    tmp = stack.pop() + 1;
                    stack.push(tmp);
                }
                else { // 앞쪽 배포시간보다 길면
                    maxDay = releaseDay;
                    stack.push(1);
                }
            }
            else {
                stack.push(1);
                maxDay = releaseDay;
            }
        }

        answer = new int[stack.size()];
        for(int i=answer.length - 1; i>=0; i--){
            answer[i] = stack.pop();
        }

        return answer;
    }
}
