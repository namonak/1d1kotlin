package boj.problems

import java.io.BufferedReader

class No15351 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        val sb = StringBuilder()
        repeat(n) {
            val name = input.readLine()
            var sum = 0
            for (c in name) {
                if (c.isLetter()) {
                    sum += c - 'A' + 1
                }
            }
            sb.append(
                when (sum) {
                    100 -> "PERFECT LIFE"
                    else -> sum
                }
            ).append('\n')
        }
        return sb.toString().trim()
    }
}
