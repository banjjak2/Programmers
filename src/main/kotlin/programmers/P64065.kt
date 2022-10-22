package programmers

class P64065 {
    class Solution {
        fun solution(s: String): IntArray {
            val answer = mutableListOf<Int>()
            val map = mutableMapOf<Int, Int>()
            s.replace('{', ' ')
                .replace('}', ' ')
                .replace(',', ' ')
                .trim()
                .replace("  ", "")
                .split(' ')
                .forEach { str ->
                    if (str.isNotBlank()) {
                        map[str.toInt()] = map.getOrDefault(str.toInt(), 0) + 1
                    }
                }.let {
                    map.toList()
                        .sortedByDescending { it.second }
                        .forEach {
                            answer.add(it.first)
                        }
                }
            return answer.toIntArray()
        }
    }
}

fun main() {
    val sol = P64065.Solution()
    val s = "{{2},{2,1},{2,1,3},{2,1,3,4}}"

    sol.solution(s).forEach {
        println(it)
    }
}
