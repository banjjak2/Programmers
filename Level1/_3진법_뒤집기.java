public class _3진법_뒤집기 {
    public static void main(String[] args){
        Solution sol = new Solution();
        
        System.out.println(sol.solution(45));
    }

    public static class Solution{
        public int solution(int n){
            int answer = 0;
            char charValue = 0;
            String thirdString = convDecToThirdString(n);

            for(int i=0; i<thirdString.length(); i++){
                charValue = thirdString.charAt(thirdString.length() - 1 - i);
                answer += (Character.getNumericValue(charValue) * Math.pow(3, i));
            }

            return answer;
        }

        public String convDecToThirdString(int n){
            StringBuilder sb = new StringBuilder();
            while(n > 0){
                sb.append(n % 3);
                n /= 3;
            }

            return sb.toString();
        }
    }
}
