public class 자릿수_더하기 {
    public static void main(String[] args) {
        int n = 123;
        System.out.println(solution(n));
    }

    public static int solution(int n){
        int answer = 0;
        String[] s = String.valueOf(n).split("");

        for (String data : s) {
            answer += Integer.parseInt(data);
        }

        return answer;
    }
}
