public class 시저_암호 {
    public static void main(String[] args) {
        String s = "abcdef";
        int n = 25;

        System.out.println(solution(s, n));
    }

    public static String solution(String s, int n){
        StringBuilder answer = new StringBuilder();
        int tmp;

        for(int i=0; i<s.length(); i++){
            tmp = s.charAt(i);

            if (tmp >= 'a' && tmp <= 'z'){
                if ((tmp+=n) > 'z'){
                    tmp = tmp - 'z' + 'a' - 1;
                }
            }
            else if (tmp >= 'A' && tmp <= 'Z'){
                if ((tmp+=n) > 'Z'){
                    tmp = tmp - 'Z' + 'A' - 1;
                }
            }

            answer.append(Character.toChars(tmp));
        }

        return answer.toString();
    }
}
