import java.util.HashMap;

public class 키패드누르기 {
    public static void main(String[] args){
        Solution sol = new Solution();

        int[] numbers = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
        String hand = "right";
        sol.solution(numbers, hand);

        numbers = new int[]{7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2};
        hand = "left";
        sol.solution(numbers, hand);

        numbers = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        hand = "right";
        sol.solution(numbers, hand);
    }

    public static class Solution{
        class KeyPadPos{
            KeyPadPos(int col, int row, char hand){
                this.col = col;
                this.row = row;
                this.hand = hand;
            }

            int col;
            int row;
            char hand;
        }

        public String solution(int[] numbers, String hand){
            String answer = "";

            HashMap<Integer, KeyPadPos> keypad = new HashMap<Integer, KeyPadPos>();
            keypad.put(1, new KeyPadPos(4, 1, 'L')); keypad.put(2, new KeyPadPos(4, 2, 'X')); keypad.put(3, new KeyPadPos(4, 1, 'R'));
            keypad.put(4, new KeyPadPos(3, 1, 'L')); keypad.put(5, new KeyPadPos(3, 2, 'X')); keypad.put(6, new KeyPadPos(3, 1, 'R'));
            keypad.put(7, new KeyPadPos(2, 1, 'L')); keypad.put(8, new KeyPadPos(2, 2, 'X')); keypad.put(9, new KeyPadPos(2, 1, 'R')); keypad.put(0, new KeyPadPos(1, 2, 'X'));

            KeyPadPos leftStart = new KeyPadPos(1, 1, 'L');
            KeyPadPos rightStart = new KeyPadPos(1, 1, 'R');

            char curHand;
            KeyPadPos curKeypadPos;
            int leftToMidDistance = 0;
            int rightToMidDistance = 0;
            int distanceResult = 0;
            for(int i=0; i<numbers.length; i++){
                curKeypadPos = keypad.get((int)numbers[i]);
                curHand = curKeypadPos.hand;

                switch (curHand){
                    case 'L':
                        answer += curHand;
                        leftStart = curKeypadPos;
                        break;

                    case 'R':
                        answer += curHand;
                        rightStart = curKeypadPos;
                        break;

                    case 'X':
                        leftToMidDistance = manhattanDistance(leftStart, curKeypadPos);
                        rightToMidDistance = manhattanDistance(rightStart, curKeypadPos);
                        
                        distanceResult = leftToMidDistance - rightToMidDistance;

                        if (distanceResult > 0){
                            rightStart = curKeypadPos;
                            answer += 'R';
                        }
                        else if (distanceResult < 0){
                            leftStart = curKeypadPos;
                            answer += 'L';
                        }
                        else{
                            if (hand.equals("right")){
                                rightStart = curKeypadPos;
                                answer += 'R';
                            }
                            else{
                                leftStart = curKeypadPos;
                                answer += 'L';
                            }                            
                        }

                        break;
                }
            }

            System.out.println("result : " + answer);

            return answer;
        }

        public int manhattanDistance(KeyPadPos p1, KeyPadPos p2){
            int distance = 0;

            distance = Math.abs(p1.row - p2.row) + Math.abs(p1.col - p2.col);
            return distance;
        }
    }
}
