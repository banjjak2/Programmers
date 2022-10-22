package programmers

import java.util.*

class P76502 {
    class Solution {
        fun solution(s: String): Int {
            var answer = 0
            val queue: LinkedList<Char> = LinkedList()
            s.forEach { queue.add(it) }
            for (i in s.indices) {
                if (verify(queue)) {
                    answer++
                }
                val data = queue.poll()
                queue.add(data)
            }

            return answer
        }

        private fun verify(verifyQueue: LinkedList<Char>): Boolean {
            val first = verifyQueue.peek()
            val last = verifyQueue.last()
            if (first == ']' || first == '}' || first == ')'
                || last == '(' || last == '[' || last == '{'
            ) {
                return false
            }

            val stack = mutableListOf<Char>()
            var index = 0
            while (index < verifyQueue.size) {
                val data = verifyQueue[index++]
                if (stack.isEmpty()) {
                    stack.add(data)
                    continue
                }

                val stackIndex = stack.size - 1
                val peek = stack[stackIndex]
                when (data) {
                    ']' -> {
                        if (peek == '[') {
                            stack.removeLast()
                        } else {
                            return false
                        }
                    }
                    '}' -> {
                        if (peek == '{') {
                            stack.removeLast()
                        } else {
                            return false
                        }
                    }
                    ')' -> {
                        if (peek == '(') {
                            stack.removeLast()
                        } else {
                            return false
                        }
                    }
                    else -> stack.add(data)
                }
            }

            return stack.isEmpty()
        }
    }
}

fun main() {
    val sol = P76502.Solution()
    val s = "}}}"

    println(sol.solution(s))
}
