package programmers;

import java.util.Arrays;

public class P12941 {
    static class Solution
    {
        public int solution(int []A, int []B)
        {
            Arrays.sort(A);
            Arrays.sort(B);
            int answer = 0;
            for (int i=0; i<A.length; i++) {
                answer += (A[i] * B[A.length - i - 1]);
            }

            return answer;
        }
    }

    public static void main(String[] args) {
        Solution solution = new P12941.Solution();
        int[] A = {1, 4, 2};
        int[] B = {5, 4, 4};
        solution.solution(A, B);
    }
}