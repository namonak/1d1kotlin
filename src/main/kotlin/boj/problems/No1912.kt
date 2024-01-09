package boj.problems

import java.io.BufferedReader

object No1912 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        val numbers = input.readLine().split(" ").map { it.toInt() }
        val dp = IntArray(n) { 0 }
        dp[0] = numbers[0]

        for (i in 1 until n) {
            dp[i] = maxOf(dp[i - 1] + numbers[i], numbers[i])
        }

        return dp.maxOrNull().toString()
    }
}
