public class 두_정수_사이의_합 {
    public static void main(String[] args) {
        Solution sol = new Solution();

        System.out.println(sol.solution(5, 3));
    }

    public static class Solution{
        public long solution(int a, int b){
            long answer = 0;
            int tmp = 0;

            if (a > b){
                tmp = a;
                a = b;
                b = tmp;
            }

            for(int i=a; i<=b; i++){
                answer += i;
            }
            
            return answer;
        }
    }
}
