import java.util.*;

public class 정수_내림차순으로_배치하기 {
    public static void main(String[] args) {
        long n = 8000000000l;
        long answer = 0;

        long start = System.currentTimeMillis();

        answer = solution(n);

        long end = System.currentTimeMillis();
        System.out.println(answer);
        System.out.println("실행시간 : " + (end - start));
    }

    public static long solution(long n){
        long answer = 0;

        // split 후 정렬, parseInt 사용
        String[] nArr = String.valueOf(n).split("");
        Arrays.sort(nArr, Collections.reverseOrder());
        for(int i=0; i<nArr.length; i++){
            answer += (Integer.parseInt(nArr[i]) * Math.pow(10, nArr.length - i - 1));
        }

        return answer;
    }
}
