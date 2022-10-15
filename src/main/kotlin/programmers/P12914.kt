class P12914 {
    class Solution {
        fun solution(n: Int): Long {
            val dp = LongArray(2000 + 1)
            dp[0] = 0
            dp[1] = 1
            dp[2] = 2
            for (i in 3..n) {
                dp[i] = (dp[i-1] % 1234567 + dp[i-2] % 1234567) % 1234567
            }

            return dp[n]
        }
    }
}

fun main() {
    val sol = P12914.Solution()
    val n = 2000
    println(sol.solution(n))
}
