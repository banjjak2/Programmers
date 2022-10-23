package programmers

class P42578 {
    class Solution {
        fun solution(clothes: Array<Array<String>>): Int {
            var answer = 1
            val map = HashMap<String, Int>()
            clothes.forEach {
                map[it[1]] = map.getOrDefault(it[1], 0) + 1
            }
            map.forEach {
                answer *= (it.value + 1)
            }
            return answer - 1
        }
    }
}

fun main() {
    val sol = P42578.Solution()
    val clothes = arrayOf(
        arrayOf("yellow_hat", "headgear"),
        arrayOf("blue_sunglasses", "eyewear"),
        arrayOf("green_turban", "headgear")
    )

    println(sol.solution(clothes))
}
