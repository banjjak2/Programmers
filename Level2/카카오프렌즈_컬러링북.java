import java.util.*;

public class 카카오프렌즈_컬러링북{
    public static void main(String[] args) {
        int m = 13;
        int n = 16;
        int[][] picture = {
            {0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0},
            {0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0},
            {0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0},
            {0, 1, 1, 1, 1, 3, 1, 1, 1, 1, 3, 1, 1, 1, 1, 0},
            {0, 1, 1, 1, 3, 1, 3, 1, 1, 3, 1, 3, 1, 1, 1, 0},
            {0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0},
            {0, 1, 2, 2, 2, 1, 1, 1, 1, 1, 1, 2, 2, 2, 1, 0},
            {0, 1, 1, 1, 1, 1, 3, 1, 1, 3, 1, 1, 1, 1, 1, 0},
            {0, 0, 1, 1, 1, 1, 1, 3, 3, 1, 1, 1, 1, 1, 0, 0},
            {0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0},
            {0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0},
        };

        // int m = 3;
        // int n = 3;
        // int[][] picture = {
        //     {1, 0, 1},
        //     {0, 1, 0},
        //     {1, 0, 1}
        // };

        int[] answer = solution(m, n, picture);

        for (int i : answer) {
            System.out.println(i);
        }
    }

    public static int[] solution(int m, int n, int[][] picture){
        int maxSizeOfOneArea = 0;
        int numberOfArea = 0;
        visitedList = new boolean[m][n];

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if (
                    !visitedList[i][j] // 방문을 안했고
                    && picture[i][j] != 0 // 0이 아니면
                )
                {
                    // 새로운 영역으로 판단
                    numberOfArea++;
                }

                if (maxSizeOfOneArea < visitedCount){
                    maxSizeOfOneArea = visitedCount;
                }

                visitedCount = 0;
                
                // 상, 하, 좌, 우 반복해서 데이터 확인하여 search 한 번에 연결된 영역의 개수를 알아냄
                search(i, j, picture[i][j], picture);
            }
        }

        int[] answer = new int[2];
        answer[0] = numberOfArea;
        answer[1] = maxSizeOfOneArea;

        return answer;
    }

    static boolean[][] visitedList;
    static int visitedCount = 0;
    public static void search(int m1, int n1, int target, int[][] picture){
        if (
            target == 0 
            || m1 < 0 
            || n1 < 0 
            || m1 >= picture.length 
            || n1 >= picture[0].length 
            || visitedList[m1][n1]
        )
        {
            return;
        }

        if (picture[m1][n1] == target){
            visitedList[m1][n1] = true;
            visitedCount++;
        }
        else{
            return;
        }
        
        //상
        search(m1, n1 - 1, target, picture);
        //하
        search(m1, n1 + 1, target, picture);
        //좌
        search(m1 - 1, n1, target, picture);
        //우
        search(m1 + 1, n1, target, picture);
    }
}