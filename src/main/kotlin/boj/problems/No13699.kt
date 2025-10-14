package boj.problems

import java.io.BufferedReader

class No13699 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        val dp = LongArray(n + 1) { 0 }

        return memoization(n, dp).toString()
    }

    private fun memoization(
        n: Int,
        dp: LongArray
    ): Long {
        if (n == 0) return 1
        if (dp[n] != 0L) return dp[n]
        for (i in 0 until n) {
            dp[n] += memoization(i, dp) * memoization(n - i - 1, dp)
        }
        return dp[n]
    }
}
