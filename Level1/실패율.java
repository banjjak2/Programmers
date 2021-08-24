import java.util.*;

public class 실패율 {
    public static void main(String[] args){
        Solution sol = new Solution();
        int N = 500;
        int[] stages = new int[] {
            2, 1, 2, 4, 2, 4, 3, 3, 3, 2, 1, 1, 1, 2, 3, 6, 6, 6, 5, 5, 4, 3, 2, 6, 2, 1, 3, 3, 3, 2, 2, 2, 6, 6, 6, 6, 6, 6, 5, 5, 5, 4, 3, 3
        };

        long startTime = System.currentTimeMillis();

        for (int i : sol.solution(N, stages)) {
            System.out.println(i);
        }

        long endTime = System.currentTimeMillis();
        System.out.println("ms : " + (endTime - startTime));
    }

    public static class Solution{
        public int[] solution(int N, int[] stages){
            int[] answer = {};
            int totalPeopleCount = stages.length;

            HashMap<Integer, Integer> hmPeopleCount = new HashMap<Integer, Integer>();
            HashMap<Integer, Double> hmFailRate = new HashMap<Integer, Double>();
            for (int i : stages) {
                hmPeopleCount.put(i, hmPeopleCount.getOrDefault(i, 0) + 1);
            }

            int peopleCountPerLevel = 0;
            for(int i = 0; i < N; i++){
                if (totalPeopleCount == 0){
                    hmFailRate.put(i + 1, 0.0);
                }
                else{
                    peopleCountPerLevel = hmPeopleCount.getOrDefault(i + 1, 0);
                    hmFailRate.put(i + 1, peopleCountPerLevel / (double)totalPeopleCount);
                    totalPeopleCount -= peopleCountPerLevel;
                }
            }

            List<Integer> list = new ArrayList<>(hmFailRate.keySet());
            Collections.sort(list, new Comparator<Integer>(){
                @Override
                public int compare(Integer o1, Integer o2) {
                    return hmFailRate.get(o2).compareTo(hmFailRate.get(o1));
                }
            });

            // for (Integer integer : list) {
            //     System.out.println(String.format("key : %d, value : %f", integer, hmFailRate.get(integer)));
            // }

            answer = convIntegerListToIntArray(list);

            return answer;
        }


        public int[] convIntegerListToIntArray(List<Integer> list){
            int[] arr = new int[list.size()];

            for(int i=0; i<arr.length; i++){
                arr[i] = list.get(i);
            }

            return arr;
        }
    }
}
