import java.util.*;

public class 나누어_떨어지는_숫자_배열{
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] arr = {3, 2, 6};
        int divisor = 10;

        int[] answer = sol.solution(arr, divisor);
        for (int i : answer) {
            System.out.println(i);
        }
    }

    public static class Solution{
        public int[] solution(int[] arr, int divisor){
            int[] answer = {};
            List<Integer> dataList = new ArrayList<Integer>();

            for (int i : arr) {
                if (i % divisor == 0){
                    dataList.add(i);
                }
            }

            if (dataList.size() == 0){
                answer = new int[]{-1};
                return answer;
            }

            Collections.sort(dataList);

            answer = new int[dataList.size()];
            for(int i=0; i<answer.length; i++){
                answer[i] = dataList.get(i);
            }

            return answer;
        }
    }
}