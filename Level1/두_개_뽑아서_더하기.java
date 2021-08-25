import java.util.*;

public class 두_개_뽑아서_더하기 {
    public static void main(String[] args){
        Solution sol = new Solution();
        int[] numbers = {2, 1, 3, 4, 1};

        for (int i : sol.solution(numbers)) {
            System.out.println(i);
        }
    }

    public static class Solution{
        //List<Integer> list = new ArrayList<Integer>();
        Set<Integer> list = new TreeSet<Integer>();
        public int[] solution(int[] numbers){
            int n = numbers.length;
            int[] selectNumbers = new int[2];
            list.clear();

            combination(numbers, selectNumbers, n, 2, 0, 0);

            return intListToArray();
        }

        public int[] intListToArray(){
            int[] arr = new int[list.size()];
            int index = 0;

            for (int i : list) {
                arr[index] = i;
                index++;
            }

            return arr;
        }

        public void combination(int[] numbers, int[] selectNumbers, int n, int r, int index, int selectIndex){
            if (r == 0){
                if (!list.contains(selectNumbers[0] + selectNumbers[1])){
                    list.add(selectNumbers[0] + selectNumbers[1]);
                }

                return;
            }

            if (n == 0){
                return;
            }

            selectNumbers[selectIndex] = numbers[index];
            combination(numbers, selectNumbers, n - 1, r - 1, index + 1, selectIndex + 1);
            combination(numbers, selectNumbers, n - 1, r, index + 1, selectIndex);
        }
    }
}
