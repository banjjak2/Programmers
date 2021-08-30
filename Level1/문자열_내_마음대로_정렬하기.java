import java.util.Arrays;
import java.util.Comparator;

public class 문자열_내_마음대로_정렬하기{
    public static void main(String[] args) {
        Solution sol = new Solution();
        String[] strings = {"abce", "abcd", "cdx"};
        int n = 2;

        String[] answer = sol.solution(strings, n);
        for (String string : answer) {
            System.out.println(string);
        }
    }

    public static class Solution{
        public String[] solution(String[] strings, int n){
            String[] answer = {};
            Arrays.sort(strings);

            Arrays.sort(strings, new Comparator<String>(){
                @Override
                public int compare(String o1, String o2){
                    return getSpecificCharOfString(o1, n).compareTo(getSpecificCharOfString(o2, n));
                }
            });

            answer = strings;
            return answer;
        }

        public String getSpecificCharOfString(String str, int n){
            return String.valueOf(str.charAt(n));
        }
    }
}