package programmers

import java.util.*
import kotlin.math.ceil

class P42586 {
    class Solution {
        fun solution(progresses: IntArray, speeds: IntArray): IntArray {
            val featureStack = Stack<Int>()
            var curMaxDay = 0
            var releaseDayPerFeature = 0
            for (i in progresses.indices) {
                releaseDayPerFeature = ceil((100.0 - progresses[i]) / speeds[i]).toInt()
                if (featureStack.isNotEmpty()) {
                    if (curMaxDay >= releaseDayPerFeature) {
                        featureStack.push(featureStack.pop() + 1)
                    } else {
                        featureStack.push(1)
                        curMaxDay = releaseDayPerFeature
                    }
                } else {
                    featureStack.push(1)
                    curMaxDay = releaseDayPerFeature
                }
            }

            val answer = IntArray(featureStack.size)
            for (i in answer.size - 1 downTo 0) {
                answer[i] = featureStack.pop()
            }
            return answer
        }
    }
}

fun main() {
    val sol = P42586.Solution()
    val progresses = intArrayOf(
        95, 94
    )
    val speeds = intArrayOf(
        3, 3
    )

    sol.solution(progresses, speeds).forEach {
        println(it)
    }
}
