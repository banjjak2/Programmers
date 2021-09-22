public class 타겟_넘버 {
    public static void main(String[] args) {
        int[] numbers = {
            1, 1, 1, 1, 1
        };
        int target = 3;

        타겟_넘버 sol = new 타겟_넘버();
        System.out.println(sol.solution(numbers, target));
    }

    int answer = 0;
    public int solution(int[] numbers, int target) {
        
        search(numbers, 0, target, 0);
        return answer;
    }

    int sum = 0;
    // StringBuilder sb = new StringBuilder();
    public void search(int[] numbers, int index, int target, int sum){
        if (index == numbers.length){
            if (sum == target){
                answer++;
                // System.out.println(sb.toString());
            }

            return;
        }

        // sb.append('+');
        search(numbers, index + 1, target, sum + numbers[index]);
        // sb.delete(sb.length() - 1, sb.length());
        // sb.append('-');
        search(numbers, index + 1, target, sum - numbers[index]);
        // sb.delete(sb.length() - 1, sb.length());
    }
}