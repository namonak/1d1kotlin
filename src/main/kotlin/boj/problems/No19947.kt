package boj.problems

import java.io.BufferedReader

class No19947 {
    fun solve(input: BufferedReader): String {
        val (h, y) = input.readLine().split(" ").map { it.toInt() }
        val dp = IntArray(y + 1) { 0 }
        dp[0] = h

        for (i in 1..y) {
            dp[i] = (dp[i - 1] * 1.05).toInt()
            if (i >= 3) dp[i] = maxOf(dp[i], (dp[i - 3] * 1.2).toInt())
            if (i >= 5) dp[i] = maxOf(dp[i], (dp[i - 5] * 1.35).toInt())
        }

        return dp[y].toString()
    }
}
