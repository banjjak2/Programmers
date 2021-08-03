public class 위클리챌린지_1주차 {
    public static void main(String[] args){
        Solution sol = new Solution();
        System.out.println(sol.solution(3, 20, 4));
    }

    public static class Solution{
        public long solution(int price, int money, int count){
            long answer = 0;

            for(int i=0; i<count; i++){
                answer += (price * (i + 1));
            }

            return (money - answer) > 0? 0 : (money - answer) * -1;
        }
    }
}
