public class 콜라츠_추측 {
    public static void main(String[] args) {
        int num = 626331;

        System.out.println(solution(num));
    }

    public static int solution(long num){
        int answer = 0;
        int count = 0;

        while(num != 1){
            if (num % 2 == 0){
                num /= 2;
            }
            else{
                num *= 3;
                num += 1;
            }

            if (count == 500){
                count = -1;
                break;
            }
            
            count++;
        }

        answer = count;
        return answer;
    }
}
