package boj.problems

import java.io.BufferedReader

class No17626 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        val dp = IntArray(n + 1) { Int.MAX_VALUE }

        dp[0] = 0
        dp[1] = 1

        for (i in 2..n) {
            for (j in 1..i) {
                val square = j * j
                if (square > i) break
                dp[i] = minOf(dp[i], dp[i - square] + 1)
            }
        }

        return dp[n].toString()
    }
}
