import java.util.*;

public class 프린터 {
    public static void main(String[] args) {
        int[] priorities = {
            1, 1, 9, 1, 1, 1
        };
        int location = 0;

        프린터 sol = new 프린터();
        System.out.println(sol.solution(priorities, location));
    }

    public int solution(int[] priorities, int location) {
        int answer = 0;
        int[] checkPrior = priorities.clone();
        Queue<Integer> queue = new LinkedList<>();

        for(int i=0; i<priorities.length; i++){
            queue.add(priorities[i]);
        }

        int targetIndex = location;
        int targetData = 0;
        // for(int i=0; i<queue.size(); i++){
        while(queue.size() != 0){
            // 음수이면 맨 뒤로 포커스를 옮김
            if (targetIndex < 0){
                targetIndex = queue.size() - 1;
            }
            targetData = queue.remove();

            // 대기열에 큰 값이 들어있으면
            if (checkLargePriorData(checkPrior, targetData)){
                queue.add(targetData);
                targetIndex--;
            }
            // 대기열 뒤에 큰 값이 없고 targetIndex가 0이면 (맨 앞자리면)
            else if (targetIndex == 0 && !checkLargePriorData(checkPrior, targetData)){
                answer++;
                break;
            }
            // 인쇄할 데이터 뒤의 대기열에 큰 값이 없으면
            else {
                // targetData = queue.remove();
                priorDataRemove(checkPrior, targetData);
                targetIndex--;
                answer++;
            }
        }

        return answer;
    }

    public void priorDataRemove(int[] prior, int data){
        for(int i=0; i<prior.length; i ++){
            if (prior[i] == data){
                prior[i] = 0;
                break;
            }
        }
    }

    public boolean checkLargePriorData(int[] prior, int data){
        for(int i=0; i<prior.length; i++){
            if (prior[i] > data){
                return true; 
            }
        }

        return false;
    }
}
