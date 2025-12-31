package boj.problems

import java.io.BufferedReader
import java.util.StringTokenizer

class No12595 {
    fun solve(input: BufferedReader): String {
        val testCaseCount = input.readLine().trim().toInt()
        val result = StringBuilder()

        repeat(testCaseCount) { index ->
            val guestCount = input.readLine().trim().toInt()
            val tokens = StringTokenizer(input.readLine())

            var oddManOut = 0
            repeat(guestCount) {
                oddManOut = oddManOut xor tokens.nextToken().toInt()
            }

            result.appendLine("Case #${index + 1}: $oddManOut")
        }

        return result.toString().trimEnd()
    }
}
