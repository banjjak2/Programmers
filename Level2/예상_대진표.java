public class 예상_대진표 {
    public static void main(String[] args) {
        예상_대진표 sol = new 예상_대진표();

        System.out.println(sol.solution(8, 4, 7));
    }

    public int solution(int n, int a, int b)
    {
        int answer = 0;

        while(a != b){
            if (a % 2 == 1){
                a += 1;
            }
            if (b % 2 == 1){
                b += 1;
            }
            a/=2;
            b/=2;
            answer++;
        }

        return answer;
    }
}
