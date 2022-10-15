package programmers;

/*
 *
 * J = jump
 * T = teleport
 * -------------
 *                      2진수
 * n = 1, J             (1)
 * n = 2, J T           (10)
 * n = 3, J T J         (011)
 * n = 4, J T T         (100)
 * n = 5, J T T J       (101)
 * n = 6, J T J T       (110)
 * n = 7, J T J T J     (111)
 * n = 8, J T T T       (1000)
 * n = 9, J T T T J     (1001)
 * n = 10, J T T J T    (1010)
 * ...
 *
 * 결국 J의 개수와 2진수 1의 개수가 같음
 *
 */

public class P12980 {
    static class Solution {
        public int solution(int n) {
            return Integer.bitCount(n);
        }
    }

    public static void main(String[] args) {
        Solution sol = new P12980.Solution();
        int n = 1;
        System.out.println(sol.solution(n));
    }
}
