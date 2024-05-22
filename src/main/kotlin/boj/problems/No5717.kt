package boj.problems

import java.io.BufferedReader

class No5717 {
    fun solve(input: BufferedReader): String {
        val sb = StringBuilder()
        while (true) {
            val (m, f) = input.readLine().split(" ").map { it.toInt() }
            if (m == 0 && f == 0) break
            sb.append("${m + f}\n")
        }
        return sb.toString().trimEnd()
    }
}
