public class 평균_구하기 {
    public static void main(String[] args) {
        int[] arr = {5, 5};

        System.out.println(solution(arr));
    }

    public static double solution(int[] arr){
        double answer = 0;

        for (int i : arr) {
            answer += i;
        }

        answer /= arr.length;
        return answer;
    }
}
