import java.util.*;

public class 뉴스_클러스터링 {
    public static void main(String[] args) {
        뉴스_클러스터링 sol = new 뉴스_클러스터링();
        String str1 = "E=M*C^2";
        String str2 = "e=m*c^2";

        System.out.println(sol.solution(str1, str2));
    }

    public int solution(String str1, String str2) {
        int answer = 1;
        int intersectionCount = 0;
        int unionCount = 0;

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        List<String> str1List = splitData(str1);
        List<String> str2List = splitData(str2);

        intersectionCount = str1List.size() + str2List.size();
        unionCount = getUnionCount(str1List, str2List);
        intersectionCount -= unionCount;

        if (intersectionCount == 0 && unionCount == 0){
            intersectionCount = 1;
            unionCount = 1;
        }

        answer = (int)Math.floor((double)intersectionCount / unionCount * 65536);

        return answer;
    }

    public List<String> splitData(String str){
        List<String> splits = new ArrayList<String>();
        char[] tmp = new char[2];

        for(int i=0; i<str.length() - 1; i++){
            tmp[0] = str.charAt(i);
            tmp[1] = str.charAt(i + 1);

            if (isAlphabet(tmp[0]) && isAlphabet(tmp[1])){
                splits.add(String.valueOf(tmp));
            }
        }

        return splits;
    }

    public int getUnionCount(List<String> str1, List<String> str2){
        List<String> maxList = str1;
        List<String> minList = str2;
        if (str1.size() < str2.size()){
            maxList = str2;
            minList = str1;
        }

        int count = maxList.size() + minList.size();
        int intersectionCount = 0;

        for(int i=0; i<maxList.size(); i++){
            if (minList.contains(maxList.get(i))){
                minList.remove(maxList.get(i));
                intersectionCount++;
            }
        }

        return count - intersectionCount;
    }

    public boolean isAlphabet(char c){
        if (c >= 'a' && c <= 'z'){
            return true;
        }
        else {
            return false;
        }
    }
}