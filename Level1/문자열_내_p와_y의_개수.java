public class 문자열_내_p와_y의_개수 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String s = "Pyy";
        System.out.println(sol.solution(s));
    }

    public static class Solution{
        public boolean solution(String s){
            boolean answer = true;
            int pCount = 0;
            int yCount = 0;

            s = s.toLowerCase();
            for(int i=0; i<s.length(); i++){
                if (s.charAt(i) == 'p'){
                    pCount++;
                }
                else if (s.charAt(i) == 'y'){
                    yCount++;
                }
            }

            if (pCount == yCount){
                answer = true;
            }
            else{
                answer = false;
            }

            return answer;
        }
    }
}
