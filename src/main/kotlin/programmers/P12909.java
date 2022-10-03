package programmers;

public class P12909 {
    static class Solution {
        boolean solution(String s) {
            int open = 0;
            for (int i=0; i<s.length(); i++) {
                char chr = s.charAt(i);
                if (chr == '(') {
                    open++;
                } else {
                    if (i == 0 || open <= 0) return false;
                    open--;
                }
            }

            if (open != 0) return false;
            else return true;
        }
    }

    public static void main(String[] args) {
        Solution sol = new P12909.Solution();
        String s = "(()))(";
        System.out.println(sol.solution(s));
    }
}
