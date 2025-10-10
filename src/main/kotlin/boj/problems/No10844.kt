package boj.problems

import java.io.BufferedReader

private val MOD = 1_000_000_000

class No10844 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        val dp = Array(n + 1) { LongArray(10) { 0 } }

        for (i in 1..9) {
            dp[1][i] = 1
        }

        for (length in 2..n) {
            for (lastDigit in 0..9) {
                if (lastDigit > 0) {
                    dp[length][lastDigit] = (dp[length][lastDigit] + dp[length - 1][lastDigit - 1]) % MOD
                }
                if (lastDigit < 9) {
                    dp[length][lastDigit] = (dp[length][lastDigit] + dp[length - 1][lastDigit + 1]) % MOD
                }
            }
        }

        return dp[n].sum().rem(MOD).toString()
    }
}
