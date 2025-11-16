package boj.problems

import java.io.BufferedReader

class No31090 {
    fun solve(input: BufferedReader): String {
        val t = input.readLine().trim().toInt()
        val result = StringBuilder()

        repeat(t) {
            val year = input.readLine().trim().toLong()
            val lastTwoDigits = (year % 100).toInt()

            val answer = if (lastTwoDigits != 0 && (year + 1) % lastTwoDigits == 0L) {
                "Good"
            } else {
                "Bye"
            }

            result.appendLine(answer)
        }

        return result.toString().trimEnd()
    }
}
