public class 핸드폰_번호_가리기 {
    public static void main(String[] args) {
        String phone_number = "027778888";

        System.out.println(solution(phone_number));
    }

    public static String solution(String phone_number){
        StringBuilder answer = new StringBuilder(phone_number);

        for(int i=0; i<answer.length(); i++){
            if (i == answer.length() - 4){
                break;
            }

            answer.setCharAt(i, '*');
        }

        return answer.toString();
    }
}
