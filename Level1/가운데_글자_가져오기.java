public class 가운데_글자_가져오기 {
    public static void main(String[] args) {
        Solution sol = new Solution();

        String s = "q";
        System.out.println(sol.solution(s));
    }

    public static class Solution{
        public String solution(String s){
            StringBuilder answer = new StringBuilder(s);
            int mid = s.length() / 2 - 1; // -1 => 배열은 0부터 시작

            if (s.length() % 2 == 0){
                return answer.substring(mid, mid + 2);
            }

            return answer.substring(mid + 1, mid + 2);
        }
    }
}
