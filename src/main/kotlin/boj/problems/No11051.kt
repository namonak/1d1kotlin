package boj.problems

import java.io.BufferedReader

class No11051 {
    fun solve(input: BufferedReader): String {
        val (n, k) = input.readLine().split(" ").map { it.toInt() }
        return "${combination(n, k)}"
    }

    private fun combination(n: Int, k: Int): Int {
        val dp = Array(n + 1) { IntArray(k + 1) }
        for (i in 0..n) {
            for (j in 0..minOf(i, k)) {
                if (j == 0 || j == i) {
                    dp[i][j] = 1
                } else {
                    dp[i][j] = (dp[i - 1][j - 1] + dp[i - 1][j]) % 10007
                }
            }
        }
        return dp[n][k]
    }
}
