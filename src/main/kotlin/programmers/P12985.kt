package programmers

class P12985 {
    class Solution {
        fun solution(n: Int, a: Int, b: Int): Int {
            var a = a
            var b = b
            var answer = 0
            while (a != b) {
                if (a % 2 == 1) {
                    a += 1
                }
                if (b % 2 == 1) {
                    b += 1
                }
                a /= 2
                b /= 2
                answer++
            }
            return answer
        }
    }
}

fun main() {
    val sol = P12985.Solution()
    println(sol.solution(8, 4, 7))
}