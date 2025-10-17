package boj.problems

import java.io.BufferedReader

class No4101 {
    fun solve(input: BufferedReader): String {
        val sb = StringBuilder()
        while (true) {
            val (a, b) = input.readLine().split(" ").map { it.toInt() }
            if (a == 0 && b == 0) break
            sb.append(if (a > b) "Yes" else "No").append("\n")
        }
        return sb.toString().trimEnd()
    }
}
