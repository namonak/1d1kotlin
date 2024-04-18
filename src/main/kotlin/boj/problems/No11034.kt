package boj.problems

import java.io.BufferedReader

class No11034 {
    fun solve(input: BufferedReader): String {
        val result = StringBuilder()
        while (true) {
            val line = input.readLine() ?: break
            val (a, b, c) = line.split(" ").map { it.toInt() }
            val diff1 = b - a
            val diff2 = c - b
            result.appendLine(maxOf(diff1, diff2) - 1)
        }

        return result.toString().trimEnd()
    }
}
