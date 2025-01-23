package boj.problems

import java.io.BufferedReader

class No26560 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        val output = StringBuilder()

        repeat(n) {
            val line = input.readLine().trimEnd()
            val processedLine = if (line.endsWith('.')) line else "$line."
            output.appendLine(processedLine)
        }

        return output.toString().trimEnd()
    }
}
