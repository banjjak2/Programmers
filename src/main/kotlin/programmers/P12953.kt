package programmers

private class Solution {

    fun gcd(a: Int, b: Int): Int {
        var r = 0
        var tmpA = a
        var tmpB = b
        while (tmpB != 0) {
            if (tmpB > tmpA) {
                val tmp = tmpB
                tmpB = tmpA
                tmpA = tmp
            }
            r = tmpA % tmpB
            tmpA = tmpB
            tmpB = r
        }

        return tmpA
    }

    fun lcm(a: Int, b: Int, gcm: Int) = (a * b) / gcm

    fun solution(arr: IntArray): Int {
        var answer = arr[0]
        for (i in 1 until arr.size) {
            val gcd = gcd(answer, arr[i])
            val lcm = lcm(answer, arr[i], gcd)
            answer = lcm
        }

        return answer
    }
}

fun main() {
    val sol = Solution()

    val arr = intArrayOf(
        2, 6, 8, 14
    )
    println(sol.solution(arr))
}