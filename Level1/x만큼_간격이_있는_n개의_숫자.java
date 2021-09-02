public class x만큼_간격이_있는_n개의_숫자 {
    public static void main(String[] args) {
        int x = 0;
        int n = 5;
        long[] answer = solution(x, n);

        for (long l : answer) {
            System.out.println(l);
        }
    }

    public static long[] solution(long x, int n){
        long[] answer = new long[n];

        if (x == 0){
            return new long[n];
        }

        for(int i=0; i<n; i++){
            answer[i] = (i + 1) * x;
        }

        return answer;
    }
}
