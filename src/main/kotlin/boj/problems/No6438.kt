package boj.problems

import java.io.BufferedReader

class No6438 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        val result = StringBuilder()
        repeat(n) {
            val line = input.readLine()
            result.append(line.reversed()).append("\n")
        }
        return result.toString().trim()
    }
}
