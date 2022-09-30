import java.util.ArrayList;

public class P12945 {
    static class Solution {
        public int solution(int n) {
            ArrayList<Integer> array = new ArrayList();
            array.add(0); array.add(1);

            for (int i=2; i<=n; i++) {
                array.add((array.get(i - 1) + array.get(i - 2)) % 1234567);
            }

            return array.get(n) % 1234567;
        }
    }

    public static void main(String[] args) {
        Solution sol = new P12945.Solution();
        int n = 5;
        System.out.println(sol.solution(n));
    }
}
