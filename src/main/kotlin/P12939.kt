class P12939 {
    class Solution {
        fun solution(s: String): String {
            val nums = s.split(' ')
                .map { it.toInt() }
                .sorted()
            return "${nums[0]} ${nums[nums.size - 1]}"
        }
    }
}

fun main() {
    val sol = P12939.Solution()
    val s = "1 2 3 4"
    println(sol.solution(s))
}