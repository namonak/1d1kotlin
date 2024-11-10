package boj.problems

import java.io.BufferedReader

class No6321 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        val sb = StringBuilder()
        repeat(n) {
            val s = input.readLine()
            sb.append("String #${it + 1}\n")
            sb.append(
                s.map { c ->
                    if (c == 'Z') 'A' else c + 1
                }.joinToString("")
            )
            sb.append("\n\n")
        }
        return sb.toString().trim()
    }
}
