public class 괄호_변환 {
    public static void main(String[] args) {
        괄호_변환 sol = new 괄호_변환();
        String p = "()))((()";

        System.out.println(sol.solution(p));
    }

    public String solution(String p) {
        StringBuilder answer = new StringBuilder();
        boolean complete = true;
        int openCount = 0;
        int closeCount = 0;
        String u = "";
        String v = "";

        for(int i=0; i<p.length(); i++){
            if (p.charAt(i) == '(') {
                openCount++;
            }
            else if (p.charAt(i) == ')') {
                closeCount++;
            }
            
            if (openCount < closeCount) {
                complete = false;
            }
            else if (openCount == closeCount){
                u = p.substring(0, openCount + closeCount);
                v = p.substring(openCount + closeCount, p.length());
                break;
            }
        }

        // u가 올바른 괄호 문자열이면
        if (complete){
            answer.append(u);
            if (v.length() != 0){
                answer.append(solution(v));
            }
        }
        else {
            answer.append('(');
            answer.append(solution(v));
            answer.append(')');
            u = u.substring(1, u.length() - 1);
            u = reverse(u);
            answer.append(u);
        }

        return answer.toString();
    }

    public String reverse(String s){
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<s.length(); i++){
            if (s.charAt(i) == '('){
                sb.append(')');
            }
            else {
                sb.append('(');
            }
        }

        return sb.toString();
    }
}