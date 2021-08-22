public class 소수_만들기{
    public static void main(String[] args){
        Solution sol = new Solution();
        int[] nums = new int[] {1, 2, 7, 6, 4};

        System.out.println(sol.solution(nums));
    }

    public static class Solution{
        public int solution(int[] nums){
            int answer = 0;

            combination(nums, nums.length + 1, 3, 0, 0);
            answer = primeCount;
            return answer;
        }

        int[] arrComb = new int[3];
        int primeCount = 0;
        int totalSum = 0;
        private void combination(int[] nums, int n, int r, int targetIndex, int combIndex){
            if (r == 0){
                for (int j : arrComb) {
                   System.out.print(j + " "); 
                   totalSum += j;
                }
                System.out.println();
                if(isPrime(totalSum)){
                    primeCount++;
                }
                totalSum = 0;
            }
            else if (n == r){
                return;
            }
            else{
                //System.out.print(nums[index]);
                arrComb[combIndex] = nums[targetIndex];
                combination(nums, n - 1, r - 1, targetIndex + 1, combIndex + 1);
                //System.out.println();
                //i = 0;
                combination(nums, n - 1, r, targetIndex + 1, combIndex);
            }

            return;
        }

        private boolean isPrime(int num){
            int divideCount = 0;
            for(int i=1; i<=num; i++){             
                if (num % i == 0){
                    divideCount++;
                }

                if (divideCount > 2){
                    return false;
                }
            }

            return true;
        }
    }
}