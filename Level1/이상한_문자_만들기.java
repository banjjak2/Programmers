public class 이상한_문자_만들기 {
    public static void main(String[] args) {
        String s = "Try hello WoRld";
        System.out.println(solution(s));
    }

    public static String solution(String s){
        StringBuilder answer = new StringBuilder();
        int index = 0;
        char chr;

        for(int i=0; i<s.length(); i++){
            chr = s.charAt(i);

            if (chr == ' '){
                index = 0;
                answer.append(' ');
                continue;
            }
            else if (index % 2 == 0){
                if (chr >= 'a' && chr <= 'z'){
                    answer.append(Character.toChars(chr - 32)); // 아스키코드표 참고 (a -> A)
                    index++;
                    continue;
                }
            }
            else{
                if (chr >= 'A' && chr <= 'Z'){
                    answer.append(Character.toChars(chr + 32)); // 아스키코드표 참고 (A -> a)
                    index++;
                    continue;
                }                    
            }

            answer.append(Character.toChars(chr));
            index++;
        }

        return answer.toString();
    }
}
