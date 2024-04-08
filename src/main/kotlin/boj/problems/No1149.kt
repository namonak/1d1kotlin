package boj.problems

import java.io.BufferedReader

class No1149 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        val dp = Array(n) { IntArray(3) }
        val cost = Array(n) { IntArray(3) }

        for (i in 0 until n) {
            cost[i] = input.readLine().split(" ").map { it.toInt() }.toIntArray()
        }

        dp[0] = cost[0]

        for (i in 1 until n) {
            dp[i][0] = minOf(dp[i - 1][1], dp[i - 1][2]) + cost[i][0]
            dp[i][1] = minOf(dp[i - 1][0], dp[i - 1][2]) + cost[i][1]
            dp[i][2] = minOf(dp[i - 1][0], dp[i - 1][1]) + cost[i][2]
        }

        return dp[n - 1].minOrNull().toString()
    }
}
