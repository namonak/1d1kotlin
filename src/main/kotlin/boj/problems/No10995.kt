package boj.problems

import java.io.BufferedReader

class No10995 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        val sb = StringBuilder()
        for (i in 1..n) {
            if (i % 2 == 0) {
                sb.append(" ")
            }
            for (j in 1..n) {
                sb.append("* ")
            }
            sb.append("\n")
        }
        return sb.toString().trimEnd()
    }
}
