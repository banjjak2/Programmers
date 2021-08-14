import java.util.Arrays;

public class K번째수_sort메소드이용 {
    public static void main(String[] args){
        Solution sol = new Solution();
        int[] array = new int[] {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = new int[][] {
            {2, 5, 3},
            {4, 4, 1},
            {1, 7, 3}
        };

        for (int i : sol.solution(array, commands)) {
            System.out.println(i);
        }
    }

    public static class Solution{
        public int[] solution(int[] array, int[][] commands){
            int[] answer = new int[commands.length];
            int[] tmpArray;
            int startIndex = 0;
            int endIndex = 0;
            int tmpIndex = 0;
            for(int i=0; i<commands.length; i++){
                // 시작점과 끝점의 개수를 구해 배열로 생성
                startIndex = commands[i][0];
                endIndex = commands[i][1];
                tmpArray = new int[endIndex - startIndex + 1];

                // commands에 전달되는 i, j는 1부터 시작
                tmpArray = Arrays.copyOfRange(array, startIndex - 1, endIndex);
                Arrays.sort(tmpArray);
                answer[tmpIndex] = tmpArray[commands[i][2] - 1];
                tmpIndex++;
            }

            return answer;
        }
    }
}
