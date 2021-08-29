import java.util.*;

public class 같은_숫자는_싫어 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        
        int[] arr = {1, 1, 3, 3, 0, 1, 1};
        int[] answer = sol.solution(arr);

        for (int i : answer) {
            System.out.println(i);
        }
    }

    public static class Solution{
        public int[] solution(int[] arr){
            int[] answer = {};
            List<Integer> dataList = new ArrayList<Integer>();
            int curData = -1;

            for (int i : arr) {
                if (curData != i){
                    dataList.add(i);
                }
                curData = i;
            }

            answer = new int[dataList.size()];
            for(int i=0; i<answer.length; i++){
                answer[i] = dataList.get(i);
            }

            return answer;
        }
    }
}
