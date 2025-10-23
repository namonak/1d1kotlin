package boj.problems

import java.io.BufferedReader

class No5789 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        val result = StringBuilder()
        repeat(n) {
            val s = input.readLine()
            val mid = s.length / 2
            result.append(
                if (s[mid - 1] == s[mid]) "Do-it" else "Do-it-Not"
            ).append("\n")
        }
        return result.toString().trimEnd()
    }
}
