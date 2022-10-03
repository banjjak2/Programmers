package programmers;

import java.util.HashMap;
import java.util.Map;

public class P12981 {
    static class Solution {
        public int[] solution(int n, String[] words) {
            int[] answer = {0, 0};
            int index = 0;
            int count = 0;
            String prevStr = "";
            Map<String, Integer> map = new HashMap<>();
            for (String word : words) {
                if (index == 0) count++;
                if (map.containsKey(word)) {
                    answer[0] = index + 1;
                    answer[1] = count;
                    break;
                } else if (!prevStr.isEmpty()) {
                    if (prevStr.charAt(prevStr.length() - 1) != word.charAt(0)) {
                        answer[0] = index + 1;
                        answer[1] = count;
                        break;
                    }
                }
                map.put(word, 1);
                index = (index + 1) % n;
                prevStr = word;
            }

            return answer;
        }
    }

    public static void main(String[] args) {
        Solution sol = new P12981.Solution();
        int n = 5;
        String[] words = {
                "hello", "observe", "effect", "take", "either", "recognize", "encourage", "ensure", "establish", "hang", "gather", "refer", "reference", "estimate", "executive"
        };
        sol.solution(n, words);
    }
}
