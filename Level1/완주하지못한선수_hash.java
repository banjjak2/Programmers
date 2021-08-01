import java.util.HashMap;
import java.util.Map;

public class 완주하지못한선수_hash {
    public static void main(String[] args){
        Solution sol = new Solution();

        String[] participant = {"mislav", "stanko", "mislav", "ana"};
        String[] completion = {"stanko", "ana", "mislav"};
        System.out.println(sol.solution(participant, completion));
    }

    public static class Solution{
        public String solution(String[] participant, String[] completion){
            String answer = "";
            HashMap<String, Integer> hm = new HashMap<String, Integer>();

            for (String string : participant) {
                
                if (hm.get(string) == null){
                    hm.put(string, 1);
                }
                else{
                    hm.put(string, hm.get(string) + 1);
                }
            }

            for (String string : completion) {
                hm.put(string, hm.get(string) - 1);
            }

            for (Map.Entry<String, Integer> entry : hm.entrySet()) {
                if (entry.getValue() != 0){
                    answer = entry.getKey();
                    break;
                }
            }

            return answer;
        }
    }
}
