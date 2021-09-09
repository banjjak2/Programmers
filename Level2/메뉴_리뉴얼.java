import java.util.*;

public class 메뉴_리뉴얼{
    public static void main(String[] args) {
        메뉴_리뉴얼 renewal = new 메뉴_리뉴얼();

        String[] orders = {
            "XYZ", 
            "XWY", 
            "WXA"
        };
        int[] course = {
            2, 3, 4
        };
        String[] answer = renewal.solution(orders, course);

        for (String string : answer) {
            System.out.println(string);
        }
    }

    HashMap<String, Integer> hm = new HashMap<String, Integer>();
    StringBuilder sb = new StringBuilder();
    char[] orgOrderCharArray; // 예제 3번처럼 XYZ가 아닌 YXZ와 같이 출력될 수 있으므로 원본 데이터를 저장해야 함.
    public String[] solution(String[] orders, int[] course){
        String[] answer = {};
        char[] orderCharArray;
        TreeSet<String> menuSets = new TreeSet<String>();
        
        for (int c : course) {
            orderCharArray = new char[c];
            orgOrderCharArray = new char[c];
            for (String order : orders) {
                if (order.length() < c){
                    continue;
                }

                combination(order, orderCharArray, order.length(), c, 0, 0);
            }

            for(Map.Entry<String, Integer> entry : hm.entrySet()){
                if (entry.getValue() == maxCount && entry.getValue() >= 2){
                    menuSets.add(entry.getKey());
                }
            }

            hm.clear();
            maxCount = 0;
        }

        answer = new String[menuSets.size()];
        int index = 0;
        for (String s : menuSets){
            answer[index++] = s;
        }

        return answer;
    }

    int maxCount = 0;
    public void combination(String order, char[] orderCharArray, int n, int r, int targetIndex, int combIndex){
        if (r == 0){
            int tmpNum = 0;
            for(int i=0; i<orderCharArray.length; i++){
                sb.append(orderCharArray[i]);
            }

            orgOrderCharArray = orderCharArray.clone();
            Arrays.sort(orderCharArray);
            tmpNum = hm.getOrDefault(String.valueOf(orderCharArray), 0) + 1;
            if (maxCount < tmpNum){
                maxCount = tmpNum;
            }

            hm.put(String.valueOf(orderCharArray), tmpNum);
            //System.out.println(sb.toString());
            sb.delete(0, sb.length());
        }
        else if (n < r){
            return;
        }
        else{
            orgOrderCharArray[combIndex] = order.charAt(targetIndex);
            combination(order, orgOrderCharArray, n - 1, r - 1, targetIndex + 1, combIndex + 1);
            combination(order, orgOrderCharArray, n - 1, r, targetIndex + 1, combIndex);
        }
    }
}