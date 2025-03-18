package boj.problems

import java.io.BufferedReader

class No9465 {
    fun solve(input: BufferedReader): String {
        val t = input.readLine().toInt()
        val result = StringBuilder()

        repeat(t) {
            val n = input.readLine().toInt()
            val stickers = Array(2) { IntArray(n) }

            stickers[0] = input.readLine().split(" ").map { it.toInt() }.toIntArray()
            stickers[1] = input.readLine().split(" ").map { it.toInt() }.toIntArray()

            val dp = Array(2) { IntArray(n) }

            dp[0][0] = stickers[0][0]
            dp[1][0] = stickers[1][0]

            if (n > 1) {
                dp[0][1] = dp[1][0] + stickers[0][1]
                dp[1][1] = dp[0][0] + stickers[1][1]
            }

            for (i in 2 until n) {
                dp[0][i] = maxOf(dp[1][i - 1], dp[1][i - 2]) + stickers[0][i]
                dp[1][i] = maxOf(dp[0][i - 1], dp[0][i - 2]) + stickers[1][i]
            }

            val maxScore = maxOf(dp[0][n - 1], dp[1][n - 1])
            result.appendLine(maxScore)
        }

        return result.toString().trim()
    }
}
