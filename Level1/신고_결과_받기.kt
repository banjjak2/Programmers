class Solution {
    fun solution(id_list: Array<String>, report: Array<String>, k: Int): IntArray {
        val answer = LinkedHashMap<String, Int>()

        // id가 신고한 사람 리스트
        // 신고당한 횟수
        val usersReport = LinkedHashMap<String, MutableSet<String>>()
        val reportedList = LinkedHashMap<String, Int>()
        id_list.forEach { id ->
            usersReport[id] = mutableSetOf()
            answer[id] = 0
            reportedList[id] = 0
        }
        report.forEach { reportString ->
            val split = reportString.split(" ")
            val id = split[0]
            val target = split[1]
            usersReport[id]?.add(target)
        }
        usersReport.forEach { entry ->
            val values = entry.value
            values.forEach { target ->
                reportedList[target] = reportedList[target]!! + 1
            }
        }

        // id에 신고당한 횟수가 2이상인 사람이 있을 경우 해당 id에 +1
        reportedList.forEach { entry ->
            val reportCount = entry.value
            val id = entry.key
            if (reportCount >= k) {
                usersReport.forEach {
                    if (it.value.contains(id)) answer[it.key] = answer[it.key]!! + 1
                }
            }
        }

        return answer.map { it.value }.toIntArray()
    }
}
