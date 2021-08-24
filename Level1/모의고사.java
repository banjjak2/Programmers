import java.util.Arrays;

public class 모의고사 {
    public static void main(String[] args){
        Solution sol = new Solution();
        int[] answers = new int[] {1, 3, 2, 4, 5};
        
        for (int i : sol.solution(answers)) {
            System.out.println(i);
        }
    }

    public static class Solution{
        public int[] solution(int[] answers){
            int[] answer = {};
        
            int[][] ggPeoples = new int[][] {
              {1, 2, 3, 4, 5},
              {2, 1, 2, 3, 2, 4, 2, 5},
              {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}  
            };

            int[] correctCount = new int[ggPeoples.length];
            int selectCorrectNumberIndexByMod = 0;
            for (int i = 0; i < answers.length; i++){
                for(int j=0; j < ggPeoples.length; j++){
                    selectCorrectNumberIndexByMod = i % ggPeoples[j].length;
                    if (ggPeoples[j][selectCorrectNumberIndexByMod] == answers[i]){
                        correctCount[j]++;
                    }
                }
            }

            //System.out.println("first : " + correctCount[0] + ", second : " + correctCount[1] + ", third : " + correctCount[2]);
            answer = getTopCorrectCountPeoplesArray(correctCount);
            
            return answer;
        }

        public int getMaxValueOfArrays(int[] arr){
            Arrays.sort(arr);
            return arr[arr.length - 1];
        }

        public int[] getTopCorrectCountPeoplesArray(int[] correctCount){
            int max = getMaxValueOfArrays(correctCount.clone());

            boolean[] rank = new boolean[correctCount.length];
            int rankCount = 0;
            for(int i=0; i<correctCount.length; i++){
                if (correctCount[i] == max){
                    rank[i] = true;
                    rankCount++;
                }
            }

            int[] ret = new int[rankCount];
            int retIndex = 0;
            for(int i=0; i<rank.length; i++){
                if (rank[i]){
                    ret[retIndex] = i + 1;
                    retIndex++;
                }
            }

            return ret;
        }
    }
}
