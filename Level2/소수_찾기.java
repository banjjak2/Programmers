import java.util.HashSet;

public class 소수_찾기 {
    public static void main(String[] args) {
        소수_찾기 sol = new 소수_찾기();
        String numbers = "17";

        System.out.println(sol.solution(numbers));
    }

    public int solution(String numbers) {
        int answer = 0;
        String[] splits = numbers.split("");
        String[] result = null;
        boolean[] visited = new boolean[splits.length];
        HashSet<Integer> hs = new HashSet<>();

        for(int i=1; i<=numbers.length(); i++){
            result = new String[i];
            permutation(splits, visited, result, hs, 0, i);
        }

        for (Integer integer : hs) {
            if (isPrime(integer)){
                // System.out.println(integer);
                answer++;
            }
        }

        return answer;
    }

    public boolean isPrime(int number){
        if (number == 1 || number == 0){
            return false;
        }

        int count = 0;
        for(int i=1; i<=Math.sqrt(number) + 1; i++){
            if (count >= 2){
                return false;
            }

            if (number % i == 0){
                count++;
            }
        }

        return true;
    }

    public void permutation(String[] numbers, boolean[] visited, String[] result, HashSet<Integer> hs, int countIndex, int r){
        if (countIndex == r){
            String str = "";
            for(int i=0; i<result.length; i++){
                str += result[i];
            }
            hs.add(Integer.valueOf(str));
            // System.out.println(str);
        }
        else {
            for(int i=0; i<visited.length; i++){
                if (!visited[i]){
                    visited[i] = true;
                    result[countIndex] = numbers[i];
                    permutation(numbers, visited, result, hs, countIndex + 1, r);
                    permutation(numbers, visited, result, hs, countIndex, r);
                    visited[i] = false;
                }
            }
        }
    }
}
