import java.util.*

class 신규_아이디_추천 {
    class Solution {
        fun solution(new_id: String): String {
            val answer = new_id.lowercase(Locale.getDefault())
                .filter { it.isLetterOrDigit() || it == '-' || it == '_' || it == '.' }
                .replace("[.]+".toRegex(), ".")
                .removeSuffix(".")
                .removePrefix(".")
                .let { it.ifEmpty { "a" } }
                .let {
                    if (it.length >= 16) {
                        it.substring(0, 15)
                    } else {
                        it
                    }.toString()
                }.removeSuffix(".")
                .let {
                    if (it.length <= 2) {
                        buildString {
                            append(it)
                            while (length < 3) append(it.last())
                        }
                    } else it
                }

            return answer
        }
    }
}
