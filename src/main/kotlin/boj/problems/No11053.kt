package boj.problems

import java.io.BufferedReader

class No11053 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        val a = input.readLine().split(" ").map { it.toInt() }
        val dp = IntArray(n) { 1 }

        for (i in 1 until n) {
            for (j in 0 until i) {
                if (a[j] < a[i]) {
                    dp[i] = maxOf(dp[i], dp[j] + 1)
                }
            }
        }

        return dp.maxOrNull().toString()
    }
}
