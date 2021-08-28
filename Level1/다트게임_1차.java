import java.util.*;

public class 다트게임_1차{
    public static void main(String[] args) {
        Solution sol = new Solution();

        String dartResult = "10D#";
        System.out.println(sol.solution(dartResult));
    }

    public static class Solution{
        public int solution(String dartResult){
            int answer = 0;
            List<Integer> dataList = new ArrayList<Integer>();
            int index = 0;
            int curData = 0;
            int charCount = 0;

            for(int i=0; i<dartResult.length(); i++){
                if (Character.isDigit(dartResult.charAt(i))){
                    if (charCount == 1){
                        curData = 10;
                    }
                    else{
                        curData = Character.getNumericValue(dartResult.charAt(i));
                        charCount++;
                        continue;
                    }
                }

                charCount = 0;
                switch (dartResult.charAt(i)) {
                    case 'S':
                    {
                        dataList.add((int)Math.pow(curData, 1));
                        break;
                    }

                    case 'D':
                    {
                        dataList.add((int)Math.pow(curData, 2));
                        break;
                    }

                    case 'T':
                    {
                        dataList.add((int)Math.pow(curData, 3));
                        break;
                    }

                    case '*':
                    {
                        index = dataList.size();
                        curData = dataList.get(index - 1);
                        curData *= 2;
                        dataList.set(index - 1, curData);

                        if (dataList.size() != 1){
                            curData = dataList.get(index - 2);
                            curData *= 2;
                            dataList.set(index - 2, curData);
                        }
                        
                        break;
                    }

                    case '#':
                    {
                        index = dataList.size();
                        curData = dataList.get(index - 1);
                        curData *= -1;
                        dataList.set(index - 1, curData);

                        break;
                    }
                    
                    default:
                        break;
                }
            }

            for (Integer integer : dataList) {
                answer += integer;
            }

            return answer;
        }
    }
}