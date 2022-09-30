public class P12924 {
    static class Solution {
        public int solution(int n) {
            int answer = 0;
            for (int i=1; i<=n; i++) {
                int sum = 0;
                for (int j=i; j<=n; j++) {
                    sum += j;

                    if (sum == n) {
                        answer++;
                        break;
                    } else if (sum > n) {
                        break;
                    }
                }
            }

            return answer;
        }
    }

    public static void main(String[] args) {
        Solution sol = new P12924.Solution();
        int n = 15;
        System.out.println(sol.solution(n));
    }
}
