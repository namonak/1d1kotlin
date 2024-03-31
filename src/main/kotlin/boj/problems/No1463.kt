package boj.problems

import java.io.BufferedReader

class No1463 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        val dp = IntArray(n + 1) { 0 }

        for (i in 2..n) {
            dp[i] = dp[i - 1] + 1
            if (i % 2 == 0) dp[i] = minOf(dp[i], dp[i / 2] + 1)
            if (i % 3 == 0) dp[i] = minOf(dp[i], dp[i / 3] + 1)
        }

        return dp[n].toString()
    }
}
