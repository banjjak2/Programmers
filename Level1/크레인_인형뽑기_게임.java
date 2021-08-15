import java.util.Stack;

public class 크레인_인형뽑기_게임 {
    public static void main(String[] args){
        Solution sol = new Solution();
        int[][] board = new int[][] {
            {0,0,0,0,0},
            {0,0,1,0,3},
            {0,2,5,0,1},
            {4,2,4,4,2},
            {3,5,1,3,1}
        };

        int[] moves = new int[] {1, 5, 3, 5, 1, 2, 1, 4};

        System.out.println(sol.solution(board, moves));
    }

    public static class Solution{
        Stack<Integer> pushedCharacter = new Stack<Integer>();
        int removeCount = 0;

        public int solution(int[][] board, int[] moves){
            int answer = 0;
            int curCharacter = 0;
            pushedCharacter.clear();
            removeCount = 0;

            for (int i : moves) {
                for(int j=0; j<board.length; j++){
                    curCharacter = board[j][i - 1];
                    if (curCharacter != 0){
                        if (checkContinuousCharacters(curCharacter)){
                            removeTopCharacter();
                        }else{
                            pushedCharacter.push(curCharacter);
                        }
                        
                        board[j][i - 1] = 0;
                        break;
                    }
                }
            }

            answer = removeCount;
            return answer;
        }

        private void removeTopCharacter(){
            pushedCharacter.pop();
            removeCount += 2;
        }

        private boolean checkContinuousCharacters(int character){
            int topCharacter = 0;

            if (pushedCharacter.isEmpty() || 
            pushedCharacter.size() < 1){
                return false;
            }

            topCharacter = pushedCharacter.peek();
            if (topCharacter == character){
                return true;
            }

            return false;
        }
    }
}
