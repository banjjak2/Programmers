import java.util.Arrays;

public class 예산 {
    public static void main(String[] args){
        Solution sol = new Solution();
        int[] d = {2, 2, 3, 3};
        int budget = 10;

        System.out.println(sol.solution(d, budget));
    }

    public static class Solution{
        public int solution(int[] d, int budget){
            int answer = 0;
            Arrays.sort(d);

            for(int i=0; i<d.length; i++){
                if (budget - d[i] >= 0){
                    answer++;
                    budget -= d[i];
                }
            }

            return answer;
        }
    }
}
