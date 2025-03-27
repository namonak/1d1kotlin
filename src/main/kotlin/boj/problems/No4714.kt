package boj.problems

import java.io.BufferedReader

class No4714 {
    fun solve(input: BufferedReader): String {
        val result = StringBuilder()
        while (true) {
            val line = input.readLine() ?: break
            val weight = line.toDouble()
            if (weight < 0) break

            val moonWeight = weight * 0.167
            result.appendLine(
                "Objects weighing %.2f on Earth will weigh %.2f on the moon."
                    .format(weight, moonWeight)
            )
        }
        return result.toString().trim()
    }
}
