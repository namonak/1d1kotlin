package boj.problems

import java.io.BufferedReader

private const val MOD = 1_000_000_007

class No15624 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        val dp = LongArray(n + 1) { -1L }
        dp[0] = 0
        if (n > 0) {
            dp[1] = 1
        }

        return fibDynamic(n, dp).toString()
    }

    private fun fibDynamic(
        n: Int,
        dp: LongArray
    ): Long {
        if (dp[n] != -1L) {
            return dp[n]
        }
        dp[n] = (fibDynamic(n - 1, dp) + fibDynamic(n - 2, dp)) % MOD
        return dp[n]
    }
}
