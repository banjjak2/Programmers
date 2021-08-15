import java.util.Arrays;

public class 로또의_최고_순위와_최저_순위 {
    public static void main(String[] args){
        Solution sol = new Solution();
        int[] lottos;
        int[] win_nums;

        lottos = new int[] {44, 1, 0, 0, 31, 25};
        win_nums = new int[] {31, 10, 45, 1, 6, 19};

        int[] answer = sol.solution(lottos, win_nums);
        System.out.println(answer[0] + ", " + answer[1]);
    }

    public static class Solution{
        public int[] solution(int[] lottos, int[] win_nums){
            int[] answer = new int[2];
            int correctCount = 0;
            int zeroCount = 0;


            for(int i=0; i<lottos.length; i++){
                if (lottos[i] == 0)
                    zeroCount++;
            }

            for(int i=0; i<win_nums.length; i++){
                for(int j=0; j<lottos.length; j++){
                    if (win_nums[i] == lottos[j]){
                        correctCount++;
                        break;
                    }
                }
            }

            answer[0] = getRank(correctCount + zeroCount);
            answer[1] = getRank(correctCount);
            return answer;
        }

        private int getRank(int correctCount){
            switch (correctCount) {
                case 6:
                    return 1;
            
                case 5:
                    return 2;

                case 4:
                    return 3;

                case 3:
                    return 4;

                case 2:
                    return 5;

                default:
                    return 6;
            }
        }
    }
}
