import java.util.*;

public class 소수_찾기 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int n = 100;
        System.out.println(sol.solution(n));
    }

    public static class Solution{
        public int solution(int n){
            int answer = 0;
            answer = eratosthenes(n);
            return answer;
        }
        
        public int eratosthenes(int n){
            int[] arr = new int[n - 1]; // 0, 1 제외하고 n은 포함되어야 하니까 -1
            int count = 0;

            for(int i=2; i<=n; i++){
                arr[i - 2] = i;
            }
            
            for(int i=2; i<=n; i++){
                if (arr[i - 2] == 0){
                    continue;
                }

                for(int j=i+i; j<=n; j+=i){ // 자기자신 제외 (i + i), 배수만큼 (j + i)
                    arr[j - 2] = 0;
                }
            }

            for (int i : arr) {
                if (i != 0){
                    count++;
                }
            }

            return count;
        }
    }
}
