import java.util.*;

public class 튜플 {
    public static void main(String[] args) {
        // String s = "{{2},{2,1},{2,1,3},{2,1,3,4}}";
        // String s = "{{1,2,3},{2,1},{1,2,4,3},{2}}";
        // String s = "{{20,111},{111}}";
        // String s = "{{123}}";
        String s = "{{4,2,3},{3},{2,3,4,1},{2,3}}";
        튜플 sol = new 튜플();

        int[] answer = sol.solution(s);

        for (int i : answer) {
            System.out.println(i);
        }
    }

    public int[] solution(String s) {
        int[] answer = {};
        HashMap<Integer, List<Integer>> hm = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        List<Integer> list = new ArrayList<Integer>();
        int count = 0;
        
        for(int i=0; i<s.length() - 1; i++){
            // {, } 인 경우 다음 인덱스로
            if (s.charAt(i) == '{' || s.charAt(i) == '}'){
                continue;
            }

            // 숫자인 경우 StringBuilder에 추가
            if (s.charAt(i) != ','){
                sb.append(s.charAt(i));
            }
            
            // 다음 인덱스가 숫자가 아니면 list에 추가
            // 숫자인 경우 10의 자리 이상이 될 수 있으므로
            if (!isNumber(s.charAt(i + 1))){
                count++;
                list.add(Integer.valueOf(sb.toString()));
                sb.delete(0, sb.length());
            }

            // } 이면 하나의 튜플이 끝났기 때문에 hashMap에 list 추가
            // i += 2는 } 문자 다음에 ,와 { 가 있으므로
            if (s.charAt(i + 1) == '}'){
                hm.put(count, list);
                sb.delete(0, sb.length());
                count = 0;
                i += 2;

                list = new ArrayList<Integer>();
            }
        }

        int listCount = 0;
        List<Integer> result = new ArrayList<Integer>();
        for(int i=0; i<hm.size(); i++){
            listCount = hm.get(i + 1).size();

            for(int j=0; j<listCount; j++){
                if (result.indexOf(hm.get(i + 1).get(j)) < 0)
                {
                    result.add(hm.get(i + 1).get(j));
                }
            }
        }

        answer = new int[result.size()];
        for(int i=0; i<result.size(); i++){
            answer[i] = result.get(i);
        }

        return answer;
    }

    public boolean isNumber(char c){
        if ('0' <= c && c <= '9'){
            return true;
        }

        return false;
    }
}
