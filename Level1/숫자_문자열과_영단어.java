import java.util.HashMap;

public class 숫자_문자열과_영단어 {
    public static void main(String[] args){
        Solution sol = new Solution();
        String str = "23four5six7";

        System.out.println(sol.solution(str));
    }

    public static class Solution{
        public static int solution(String s){
            int answer = 0;
            HashMap<Integer, String> hm = makeWordSet();
            
            for(int i=0; i<hm.size(); i++){
                s = s.replace(hm.get(i), String.valueOf(i));
            }

            answer = Integer.parseInt(s);
            return answer;
        }

        private static HashMap<Integer, String> makeWordSet(){
            HashMap<Integer, String> hm = new HashMap<Integer, String>();

            hm.put(0, "zero");
            hm.put(1, "one");
            hm.put(2, "two");
            hm.put(3, "three");
            hm.put(4, "four");
            hm.put(5, "five");
            hm.put(6, "six");
            hm.put(7, "seven");
            hm.put(8, "eight");
            hm.put(9, "nine");

            return hm;
        }
    }
}

