public class 약수의_개수와_덧셈 {
    public static void main(String[] args){
        Solution sol = new Solution();
        
        System.out.println(sol.solution(24, 27));
    }

    public static class Solution{
        enum TYPE{
            ODD,
            EVEN
        }

        public int solution(int left, int right){
            int answer = 0;

            for(int i=left; i<=right; i++){
                if (getOddOrEvenOfDivisor(i) == TYPE.EVEN){
                    answer += i;
                }
                else{
                    answer -= i;
                }
            }

            return answer;
        }

        private int getDivisorCount(int target){
            int divisorCount = 0;

            for(int i=1; i<=target; i++){
                if (target % i == 0){
                    divisorCount++;
                }
            }

            return divisorCount;
        }

        private TYPE getOddOrEvenOfDivisor(int target){
            int divisorCount = getDivisorCount(target);

            if (divisorCount % 2 == 0){
                return TYPE.EVEN;
            }
            else{
                return TYPE.ODD;
            }
        }
    }
}
