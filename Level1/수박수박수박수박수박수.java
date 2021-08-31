public class 수박수박수박수박수박수{
    public static void main(String[] args) {
        Solution sol = new Solution();
        
        int n = 5;
        System.out.println(sol.solution(n));
    }

    public static class Solution{
        public String solution(int n){
            StringBuilder answer = new StringBuilder();

            for(int i=0; i<n; i++){
                if (i % 2 == 0){
                    answer.append("수");
                }
                else{
                    answer.append("박");
                }
            }

            return answer.toString();
        }
    }
}