import java.util.Arrays;
import java.util.HashSet;

public class 폰켓몬 {
    public static void main(String[] args){
        Solution sol = new Solution();
        //int[] nums = new int[] {3, 1, 2, 3};
        //int[] nums = new int[] {3, 3, 3, 2, 2, 4};
        int[] nums = new int[] {3, 3, 3, 2, 2, 2};

        System.out.println(sol.solution(nums));
    }

    public static class Solution{
        public int solution(int[] nums){
            int answer = nums.length / 2;
            HashSet<Integer> hs = new HashSet<Integer>();

            for (int i : nums) {
                hs.add(i);
            }

            if (hs.size() < answer){
                answer = hs.size();
            }

            return answer;
        }
    }
}
