package boj.problems

import java.io.BufferedReader

class No14494 {
    fun solve(input: BufferedReader): String {
        val (n, m) = input.readLine().split(" ").map { it.toInt() }
        val mod = 1_000_000_007
        val dp = Array(n + 1) { LongArray(m + 1) }

        dp[1][1] = 1L

        for (i in 1..n) {
            for (j in 1..m) {
                if (i == 1 && j == 1) continue
                val fromLeft = if (j > 1) dp[i][j - 1] else 0
                val fromTop = if (i > 1) dp[i - 1][j] else 0
                val fromDiagonal = if (i > 1 && j > 1) dp[i - 1][j - 1] else 0

                dp[i][j] = (fromLeft + fromTop + fromDiagonal) % mod
            }
        }

        return "${dp[n][m]}"
    }
}
