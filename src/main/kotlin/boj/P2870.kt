package boj

import java.io.BufferedReader
import java.io.InputStreamReader
import java.math.BigInteger

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val count = br.readLine().toLong()
    val list = mutableListOf<BigInteger>()

    for (i in 0 until count) {
        val str = br.readLine()
        val sb = StringBuilder()

        for (char in str) {
            if (char in '0'..'9') {
                sb.append(char)
            } else if (char == '0') {
                continue
            } else if (sb.isNotBlank()) {
                println("sb1 : $sb")
                list.add(sb.toString().toBigInteger())
                sb.clear()
            }
        }

        if (sb.isNotBlank()) {
            println("sb2 : $sb")
            list.add(sb.toString().toBigInteger())
        }
    }

    val result = list.sorted()
    result.forEach {
        println(it)
    }
}