package programmers

class P12951 {
    class Solution {
        fun solution(s: String): String {
            val sb = StringBuilder()
            for (i in s.indices) {
                val chr = s[i]
                if (chr == ' ') sb.append(' ')
                else if (chr in 'A'..'Z') {
                    if (i > 0 && s[i-1] != ' ') sb.append(chr + 0x20)
                    else sb.append(chr)
                } else if (chr in 'a' .. 'z') {
                    if (i == 0 || s[i-1] == ' ') sb.append(chr - 0x20)
                    else sb.append(chr)
                } else if (chr in '0' .. '9') sb.append(chr)
            }

            return sb.toString()
        }
    }
}

fun main() {
    val sol = P12951.Solution()
    val s = "3people unFollowed me"
    println(sol.solution(s))
}