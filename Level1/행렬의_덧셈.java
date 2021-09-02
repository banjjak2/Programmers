public class 행렬의_덧셈 {
    public static void main(String[] args) {
        int[][] arr1 = {
            {1},
            {2}
        };
        int[][] arr2 = {
            {3},
            {4}
        };
        int[][] answer = solution(arr1, arr2);

        for (int[] is : answer) {
            for (int is2 : is) {
                System.out.println(is2);
            }

            System.out.println();
        }
    }

    public static int[][] solution(int[][] arr1, int[][] arr2){
        int[][] answer = new int[arr1.length][arr1[0].length];

        for(int i=0; i<arr1.length; i++){
            for(int j=0; j<arr1[0].length; j++){
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        
        return answer;
    }
}
