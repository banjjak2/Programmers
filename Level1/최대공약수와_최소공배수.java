import java.util.*;

public class 최대공약수와_최소공배수{
    public static void main(String[] args) {
        int n = 60;
        int m = 32;
        int[] answer = solution(n, m);

        for (int i : answer) {
            System.out.println(i);
        }
    }

    public static int[] solution(int n, int m){
        int[] answer = {};
        // int[] facts = factorization(n, m);

        // int greatestCommFact = 1; // 최대공약수
        // int leastCommMultiple = 1; // 최소공배수

        // for(int i=0; i<facts.length - 2; i++){
        //     greatestCommFact *= facts[i];
        //     leastCommMultiple *= facts[i];
        // }

        // leastCommMultiple *= facts[facts.length - 2];
        // leastCommMultiple *= facts[facts.length - 1];

        // answer = new int[] { greatestCommFact, leastCommMultiple };

        answer = gcdlcm(n, m);
        return answer;
    }

    // 소인수분해를 이용한 풀이
    // 결과값 = 공약수들 + 서로소들
    public static int[] factorization(int n, int m){
        int divisor = 2;
        List<Integer> facts = new ArrayList<Integer>();
        int[] retData;

        while(true){
            if ((n % divisor == 0) && (m % divisor == 0)){
                facts.add(divisor);
                n /= divisor;
                m /= divisor;
            }
            else{
                if (divisor > n || divisor > m){
                    facts.add(n);
                    facts.add(m);
                    break;
                }

                divisor++;
            }
        }

        retData = new int[facts.size()];
        for(int i=0; i<facts.size(); i++){
            retData[i] = facts.get(i);
        }

        return retData;
    }

    // 유클리드 호제법을 이용한 풀이
    // gcd : 최대공약수
    // lcm : 최소공배수
    public static int[] gcdlcm(int n, int m){
        int gcd;
        int lcm;

        gcd = gcd(n, m);
        lcm = (n * m) / gcd;

        return new int[] { gcd, lcm };
    }

    public static int gcd(int n, int m){
        // 나머지가 0이면
        if (m == 0){
            // 나눈값 반환
            return n;
        }

        // 나눈 수, 나머지 값
        return gcd(m, n % m);
    }
}