package boj.problems

import java.io.BufferedReader

private const val MAX_N = 46

class No2747 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        val dp = IntArray(MAX_N)

        dp[1] = 1
        for (i in 2..n) {
            dp[i] = dp[i - 1] + dp[i - 2]
        }

        return dp[n].toString()
    }
}
