public class 하샤드_수 {
    public static void main(String[] args) {
        int x = 12;
        
        System.out.println(solution(x));
    }

    public static boolean solution(int x){
        boolean answer = true;
        int sum = 0;
        int div = x;
        int index = 1;

        while(div != 0){
            sum += (int)(div % Math.pow(10, index));
            div /= 10;
        }

        if (x % sum == 0){
            answer = true;
        }
        else{
            answer = false;
        }

        return answer;
    }
}
