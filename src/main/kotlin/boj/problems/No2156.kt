package boj.problems

import java.io.BufferedReader

object No2156 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        val wines = IntArray(n + 1)
        val dp = IntArray(n + 1)

        for (i in 1..n) {
            wines[i] = input.readLine().toInt()
        }

        dp[1] = wines[1]
        if (n > 1) {
            dp[2] = wines[1] + wines[2]
        }

        for (i in 3..n) {
            dp[i] = dp[i - 1]
            dp[i] = maxOf(dp[i], dp[i - 2] + wines[i])
            dp[i] = maxOf(dp[i], dp[i - 3] + wines[i - 1] + wines[i])
        }

        return dp[n].toString()
    }
}
