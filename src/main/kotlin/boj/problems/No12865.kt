package boj.problems

import java.io.BufferedReader

class No12865 {
    fun solve(input: BufferedReader): String {
        val (n, k) = input.readLine().split(" ").map { it.toInt() }
        val dp = IntArray(k + 1)

        repeat(n) {
            val (weight, value) = input.readLine().split(" ").map { it.toInt() }

            for (j in k downTo weight) {
                dp[j] = maxOf(dp[j], dp[j - weight] + value)
            }
        }

        return dp.maxOrNull().toString()
    }
}
