public class 나라124 {
    public static void main(String[] args) {
        int n = 5;
        나라124 sol = new 나라124();

        for(int i=1; i<=100; i++){
            System.out.println(i + " :=> " + sol.solution(i));
        }

        // System.out.println(sol.solution(n));
    }

    public String solution(int n) {
        StringBuilder sb = new StringBuilder();
        int rest = 0;

        while(n > 0){
            rest = n % 3;
            n /= 3;
            if (rest == 0){
                n -= 1;
                rest = 4;
            }

            sb.insert(0, rest);
        }

        return sb.toString();
    }
}