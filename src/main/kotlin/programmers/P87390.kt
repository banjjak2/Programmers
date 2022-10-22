package programmers

import kotlin.math.max

class P87390 {
    class Solution {
        fun solution(n: Int, left: Long, right: Long): IntArray {
            val answer = mutableListOf<Int>()
            val size = (right - left).toInt()

            for (i in left .. right) {
                val row = (i / n).toInt()
                val col = (i % n).toInt()
                answer.add(max(row, col) + 1)
            }

            return answer.toIntArray()
        }
    }
}

fun main() {
    val sol = P87390.Solution()
    val n = 4
    val left = 7L
    val right = 14L

    sol.solution(n, left, right).forEach {
        println(it)
    }
}
