import java.lang.Integer.max

class P43236 {
    fun solution(distance: Int, rocks: IntArray, n: Int): Int {
        var answer = 0
        rocks.sort()
        var left = 0
        var right = distance

        while (left <= right) {
            val mid = (left + right) / 2
            var removeRocksCount = 0
            var prev = 0

            rocks.forEach { rock ->
                if (rock - prev < mid) removeRocksCount++
                else prev = rock
            }
            if (distance - prev < mid) removeRocksCount++
            if (removeRocksCount <= n) {
                answer = max(answer, mid)
                left = mid + 1
            } else right = mid - 1
        }

        return answer
    }
}