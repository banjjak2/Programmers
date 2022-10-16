package programmers;

import java.util.LinkedList;

public class P17680 {
    static class Solution {
        public int solution(int cacheSize, String[] cities) {
            int answer = 0;

            if (cacheSize == 0) return cities.length * 5;
            LinkedList<String> list = new LinkedList<>();
            for (String city: cities) {
                if (!list.contains(city.toLowerCase())) {
                    if (list.size() == cacheSize) {
                        list.poll();
                    }
                    list.add(city.toLowerCase());
                    answer += 5;
                } else {
                    int index = list.indexOf(city.toLowerCase());
                    String removeData = list.remove(index);
                    list.add(removeData);
                    answer += 1;
                }
            }

            return answer;
        }
    }

    public static void main(String[] args) {
        Solution sol = new P17680.Solution();
        int cacheSize = 2;
        String[] cities = {
                "Jeju", "Pangyo", "Seoul", "NewYork", "LA", "SanFrancisco", "Seoul", "Rome", "Paris", "Jeju", "NewYork", "Rome"
        };
        System.out.println(sol.solution(cacheSize, cities));
    }
}
