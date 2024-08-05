package boj.problems

import java.io.BufferedReader

class No4447 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        val sb = StringBuilder()
        repeat(n) {
            val line = input.readLine()
            val good = line.count { it.lowercaseChar() == 'g' }
            val bad = line.count { it.lowercaseChar() == 'b' }
            sb.append(
                "$line is ${when {
                    good > bad -> "GOOD"
                    good < bad -> "A BADDY"
                    else -> "NEUTRAL"
                }}\n"
            )
        }
        return sb.toString().trim()
    }
}
