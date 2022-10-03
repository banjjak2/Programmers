package programmers;

public class P12911 {
    static class Solution {
        public int solution(int n) {
            int oneCount = Integer.bitCount(n);
            int i = n + 1;
            while (oneCount != Integer.bitCount(i)) {
                i++;
            }

            return i;
        }
    }

    public static void main(String[] args) {
        Solution sol = new P12911.Solution();
        int n = 15;
        System.out.println(sol.solution(n));
    }
}
