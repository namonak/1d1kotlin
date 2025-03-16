package boj.problems

import java.io.BufferedReader

class No9657 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()

        val dp = BooleanArray(n + 1)

        if (n >= 1) dp[1] = true
        if (n >= 2) dp[2] = false
        if (n >= 3) dp[3] = true
        if (n >= 4) dp[4] = true

        for (i in 5..n) {
            dp[i] = !dp[i - 1] || !dp[i - 3] || !dp[i - 4]
        }

        return if (dp[n]) "SK" else "CY"
    }
}
