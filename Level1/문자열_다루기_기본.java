public class 문자열_다루기_기본 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String s = "-1";
        System.out.println(sol.solution(s));
    }

    public static class Solution{
        public boolean solution(String s){      
            if (s.length() == 4 || s.length() == 6){
                if (s.matches("[+-]?\\d*(\\.\\d+)?")){
                    return true;
                }
                else{
                    return false;
                }
            }
            else{
                return false;
            }
        }
    }
}
