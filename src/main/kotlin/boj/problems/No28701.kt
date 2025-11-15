package boj.problems

import java.io.BufferedReader

class No28701 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().trim().toLong()

        val sum = n * (n + 1) / 2
        val squaredSum = sum * sum

        return buildString {
            appendLine(sum)
            appendLine(squaredSum)
            append(squaredSum)
        }
    }
}
