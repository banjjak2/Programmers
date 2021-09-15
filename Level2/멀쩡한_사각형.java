public class 멀쩡한_사각형 {
    public static void main(String[] args) {
        int w = 2;
        int h = 4;

        멀쩡한_사각형 sol = new 멀쩡한_사각형();
        System.out.println(sol.solution(w, h));
    }

    public long solution(int w, int h) {
        long answer = 0;
        long totalCount = (long)w * h;
        // 패턴 총 개수
        int patternCount = gcd(w, h);

        // 1패턴당 가로 개수
        long widthPerPattern = w / patternCount;
        // 1패턴당 세로 개수
        long heightPerPattern = h / patternCount;
        // 1패턴당 못쓰는 개수
        long unusedCountPerPattern = widthPerPattern + heightPerPattern - 1;
        
        // 총개수 - (1패턴당 못쓰는 개수 * 패턴 총 개수);
        answer = totalCount - (unusedCountPerPattern * patternCount);
        return answer;
    }

    public int gcd(int n, int m){
        // 나머지가 0이면
        if (m == 0){
            // 나눈값 반환
            return n;
        }

        // 나눈 수, 나머지 값
        return gcd(m, n % m);
    }
}
