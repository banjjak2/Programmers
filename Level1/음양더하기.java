
public class 음양더하기 {
    public static void main(String[] args){
        Solution sol = new Solution();

        int[] absolutes = {4, 7, 12};
        boolean[] signs = {true, false, true};
        System.out.println(sol.solution(absolutes, signs));
    }

    public static class Solution{
        public int solution(int[] absolutes, boolean[] signs){
            int answer = 0;

            for(int i=0; i<absolutes.length; i++){
                if (!signs[i])
                    answer += (absolutes[i] * -1);
                else
                    answer += absolutes[i];
            }

            return answer;
        }
    }
}

