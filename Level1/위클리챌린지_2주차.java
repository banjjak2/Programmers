public class 위클리챌린지_2주차 {
    public static void main(String[] args){
        Solution sol = new Solution();
        int[][] scores;
        /*
        scores = new int[][] {
          {100, 90, 98, 88, 65},
          {50, 45, 99, 85, 77},
          {47, 88, 95, 80, 67},
          {61, 57, 100, 80, 65},
          {24, 90, 94, 75, 65}  
        };
        */
        
        /*
        scores = new int[][] {
            {50, 90},
            {50, 87}
        };
        */

        scores = new int[][] {
            {70, 49, 90},
            {68, 50, 38},
            {73, 31, 100}
        };

        System.out.println(sol.solution(scores));
    }

    public static class Solution{
        public String solution(int[][] scores){
            StringBuilder answer = new StringBuilder();
            int[] scorePerStudent = new int[scores.length];
            for(int i=0; i<scores[0].length; i++){
                for(int j=0; j<scores.length; j++){
                    scorePerStudent[j] = scores[j][i];
                }

                answer.append(printHakjum(scorePerStudent, i));
            }

            return answer.toString();
        }

        public char printHakjum(int[] scores, int index){
            double average = 0;
            boolean checkOnlyOne = false;

            checkOnlyOne = onlyOneScore(scores, index);
            average = averageCalculate(scores, checkOnlyOne, index);

            return scoreRange(average);
        }

        private char scoreRange(double average){
            if (average >= 90)
                return 'A';
            else if (average >= 80 && average < 90)
                return 'B';
            else if (average >= 70 && average < 80)
                return 'C';
            else if (average >= 50 && average < 70)
                return 'D';
            else
                return 'F';
        }

        private double averageCalculate(int[] scores, boolean onlyOne, int index){
            int totalScore = 0;

            for (int i : scores) {
                if (onlyOne){
                    if (scores[index] == i)
                        continue;
                }

                totalScore += i;
            }

            return onlyOne? (totalScore / (scores.length - 1)) : (totalScore / scores.length);
        }

        private boolean onlyOneScore(int[] scores, int index){
            int onlyOne = scores[index];
            int duplicateCount = 0;
            int max = scores[0];
            int min = scores[0];
            for (int i : scores) {
                max = (max < i)? i : max;
                min = (min > i)? i : min;

                if (onlyOne == i){
                    duplicateCount++;

                    if (duplicateCount > 1)
                        return false;
                }
            }
            
            return (onlyOne == max || onlyOne == min)? true : false;
        }
    }
}
