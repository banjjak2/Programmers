public class 자연수_뒤집어_배열로_만들기 {
    public static void main(String[] args) {
        long n = 10000000000l;
        int[] answer = solution(n);

        for (int i : answer) {
            System.out.println(i);
        }
    }

    public static int[] solution(long n){
        int[] answer = new int[String.valueOf(n).length()];
        int index = 0;
        while(n > 0){
            answer[index] = (int)(n % 10);
            n /= 10;
            index++;
        }

        return answer;
    }
}
