package boj.problems

import java.io.BufferedReader

object No11008 {
    fun solve(input: BufferedReader): String {
        val testCaseCount = input.readLine().toInt()
        val results = StringBuilder()

        repeat(testCaseCount) {
            val (source, pattern) = input.readLine().split(" ")
            var currentIndex = 0
            var patternMatchCount = 0

            while (currentIndex <= source.length - pattern.length) {
                if (source.startsWith(pattern, currentIndex)) {
                    patternMatchCount++
                    currentIndex += pattern.length
                } else {
                    currentIndex++
                }
            }

            val totalTime = source.length - patternMatchCount * (pattern.length - 1)
            results.appendLine(totalTime)
        }

        return results.toString().trimEnd()
    }
}
