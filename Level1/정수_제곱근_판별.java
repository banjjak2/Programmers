public class 정수_제곱근_판별 {
    public static void main(String[] args) {
        long n = 3;

        System.out.println(solution(n));
    }

    public static long solution(long n){
        if ((Math.sqrt(n) % 1) > 0){
            return -1;
        }else{
            return (long)Math.pow(Math.sqrt(n) + 1, 2);
        }
    }
}
