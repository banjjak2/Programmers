import java.util.*;

public class 행렬_테두리_회전하기 {
    public static void main(String[] args) {
        행렬_테두리_회전하기 sol = new 행렬_테두리_회전하기();

        int rows = 100;
        int columns = 97;
        // int[][] queries = {
        //     {2,2,5,4},
        //     {3,3,6,6},
        //     {5,1,6,3}
        // };
        // int[][] queries = {
        //     {1,1,2,2},
        //     {1,2,2,3},
        //     {2,1,3,2},
        //     {2,2,3,3}
        // };
        int[][] queries = {
            {1, 1, 100, 97}
        };

        int[] answer = sol.solution(rows, columns, queries);
        for (int i : answer) {
            System.out.println(i);
        }
    }

    public int[] solution(int rows, int columns, int[][] queries) {
        int[] answer = new int[queries.length];
        int[][] matrix = new int[rows][columns];

        int count = 1;
        for(int i=0; i<rows; i++){
            for(int j=0; j<columns; j++){
                matrix[i][j] = count++;
            }
        }

        LinkedList<Pos> selectedPos = new LinkedList<Pos>();
        LinkedList<Pos> rotateSelectedPos = new LinkedList<Pos>();
        int min = 0;
        for(int i=0; i<queries.length; i++){
            selectedPos = getSelectedPos(queries[i], matrix);
            rotateSelectedPos = (LinkedList)selectedPos.clone();
            rotateSelectedPos.addFirst(rotateSelectedPos.getLast());
            rotateSelectedPos.removeLast();
    
            min = rotateSelectedPos.get(0).data;
            for(int j=0; j<rotateSelectedPos.size(); j++){
                matrix[selectedPos.get(j).row - 1][selectedPos.get(j).column - 1] = rotateSelectedPos.get(j).data;
                if (min > rotateSelectedPos.get(j).data){
                    min = rotateSelectedPos.get(j).data;
                }
            }
    
            answer[i] = min;
            min = 0;

            // System.out.println();
            // for(int j=0; j<matrix.length; j++){
            //     for(int k=0; k<matrix[0].length; k++){
            //         System.out.print(matrix[j][k] + "\t");
            //     }
            //     System.out.println();
            // }
        }
        
        return answer;
    }

    public LinkedList<Pos> getSelectedPos(int[] queries, int[][] matrix){
        int x1 = queries[1];
        int y1 = queries[0];
        int x2 = queries[3];
        int y2 = queries[2];

        LinkedList<Pos> result = new LinkedList<Pos>();
        Pos pos = new Pos();
        
        // ->
        for(int i=0; i<x2 - x1 + 1; i++){
            pos = new Pos();
            pos.column = x1 + i;
            pos.row = y1;
            pos.data = matrix[pos.row - 1][pos.column - 1];
            result.add(pos);
        }

        // 아래
        for(int i=0; i<y2 - y1; i++){
            pos = new Pos();
            pos.row = y1 + i + 1;
            pos.column = x2;
            pos.data = matrix[pos.row - 1][pos.column - 1];
            result.add(pos);
        }

        // <-
        for(int i=x2; i>x1; i--){
            pos = new Pos();
            pos.column = i - 1;
            pos.row = y2;
            pos.data = matrix[pos.row - 1][pos.column - 1];
            result.add(pos);
        }

        // 위
        for(int i=y2; i>y1; i--){
            pos = new Pos();
            pos.row = i - 1;
            pos.column = x1;
            pos.data = matrix[pos.row - 1][pos.column - 1];
            result.add(pos);
        }

        return result;
    }

    public class Pos {
        int row;
        int column;
        int data;
    }
}
