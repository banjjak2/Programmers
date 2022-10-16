package programmers

class P12949 {
    class Solution {
        fun solution(arr1: Array<IntArray>, arr2: Array<IntArray>): Array<IntArray> {
            val answer = Array(arr1.size) { IntArray(arr2[0].size) }
            for (i in arr1.indices) {
                for (j in arr2[0].indices) {
                    for (k in arr1[0].indices) {
                        answer[i][j] += arr1[i][k] * arr2[k][j]
                    }
                }
            }

            return answer
        }
    }
}

fun main() {
    val sol = P12949.Solution()
    val arr1 = arrayOf (
        intArrayOf(2, 3, 2),
        intArrayOf(4, 2, 4),
        intArrayOf(3, 1, 4)
    )
    val arr2 = arrayOf (
        intArrayOf(5, 4, 3),
        intArrayOf(2, 4, 1),
        intArrayOf(3, 1, 1)
    )

    println(sol.solution(arr1, arr2))
}
