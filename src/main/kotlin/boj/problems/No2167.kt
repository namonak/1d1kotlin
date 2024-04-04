package boj.problems

import java.io.BufferedReader

class No2167 {
    fun solve(input: BufferedReader): String {
        val (n, m) = input.readLine().split(" ").map { it.toInt() }
        val arr = Array(n) { input.readLine().split(" ").map { it.toInt() }.toIntArray() }
        val dp = Array(n + 1) { IntArray(m + 1) }

        for (i in 1..n) {
            for (j in 1..m) {
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1] - dp[i - 1][j - 1] + arr[i - 1][j - 1]
            }
        }

        val k = input.readLine().toInt()
        val result = StringBuilder()
        repeat(k) {
            val (i, j, x, y) = input.readLine().split(" ").map { it.toInt() }
            result.append(dp[x][y] - dp[i - 1][y] - dp[x][j - 1] + dp[i - 1][j - 1]).append("\n")
        }

        return result.toString().trimEnd()
    }
}
