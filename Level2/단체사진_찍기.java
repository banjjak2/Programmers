import java.util.*;

public class 단체사진_찍기 {
    public static void main(String[] args) {
        int n = 0;
        String[] data = {
            "N~F=0", 
            "R~T>2"
        };

        // String[] data = {
        //     "M~C<2", 
        //     "C~M>1"
        // };

        System.out.println(solution(n, data));
    }

    
    static char[] friendsAlphabet = new char[] { 'A', 'C', 'F', 'J', 'M', 'N', 'R', 'T' };
    public static int solution(int n, String[] data){
        int answer = 0;

        long start = System.currentTimeMillis();
        createAllFriendsRow(0, data);
        answer = correctCount;
        long end = System.currentTimeMillis();

        System.out.println("Time : " + (end - start));

        return answer;
    }

    static boolean[] visited = new boolean[8];
    static char[] createFriendsRowArray = new char[8];
    static int correctCount = 0;
    public static void createAllFriendsRow(int index, String[] data){
        if (index == visited.length){
            if (checkCondition(String.valueOf(createFriendsRowArray), data)){
                correctCount++;
            }
        }
        else{
            for(int i=0; i<visited.length; i++){
                if (!visited[i]){
                    visited[i] = true;
                    createFriendsRowArray[index] = friendsAlphabet[i];
                    createAllFriendsRow(index + 1, data);
                    visited[i] = false;
                }
            }
        }
    }

    public static boolean checkCondition(String friendsArray, String[] data){
        char startFriend, endFriend;
        char condition;
        int conditionCount = 0;
        int gap;
        int indexGap = 0;
        int endIndex, startIndex;

        for (String c : data) {
            startFriend = c.charAt(0);
            endFriend = c.charAt(2);
            condition = c.charAt(3);
            gap = c.charAt(4) - '0';

            startIndex = friendsArray.indexOf(startFriend);
            endIndex = friendsArray.indexOf(endFriend);
            indexGap = Math.abs(endIndex - startIndex) - 1;

            switch (condition) {
                case '=':
                    if (indexGap != gap){
                        return false;
                    }
                    conditionCount++;
                    break;
                
                case '>':
                    if (indexGap <= gap){
                        return false;
                    }
                    conditionCount++;
                    break;

                case '<':
                    if (indexGap >= gap){
                        return false;
                    }
                    conditionCount++;
                    break;
            }
        }

        if (conditionCount == data.length){
            return true;
        }
        else{
            return false;
        }
    }
}
