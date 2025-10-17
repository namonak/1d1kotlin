package boj.problems

import java.io.BufferedReader

class No26546 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        val result = StringBuilder()

        repeat(n) {
            val line = input.readLine().split(" ")
            val s = line[0]
            val start = line[1].toInt()
            val end = line[2].toInt()

            result.appendLine(s.substring(0, start) + s.substring(end))
        }

        return result.toString().trimEnd()
    }
}
