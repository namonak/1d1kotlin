package boj.problems

import java.io.BufferedReader

class No1904 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        val dp = IntArray(n + 1)

        dp[1] = 1
        if (n > 1) dp[2] = 2

        for (i in 3..n) {
            dp[i] = (dp[i - 1] + dp[i - 2]) % 15746
        }

        return dp[n].toString()
    }
}
