class P70129 {
    class Solution {
        fun solution(s: String): IntArray {
            val answer = IntArray(2)
            var convCount = 0
            var removeZeroCount = 0
            var str = s

            while (str != "1") {
                removeZeroCount += str.count { it == '0' }
                str = str.filter { it == '1' }
                convCount++

                val convInt = str.length
                str = Integer.toBinaryString(convInt)
            }

            answer[0] = convCount; answer[1] = removeZeroCount
            return answer
        }
    }
}

fun main() {
    val sol = P70129.Solution()
    val s = "1111111"
    sol.solution(s).forEach {
        println(it)
    }
}