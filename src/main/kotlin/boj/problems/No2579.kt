package boj.problems

import java.io.BufferedReader

class No2579 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        val stairs = IntArray(n + 1) { 0 }
        val dp = IntArray(n + 1) { 0 }

        for (i in 1..n) {
            stairs[i] = input.readLine().toInt()
        }

        dp[1] = stairs[1]
        if (n >= 2) {
            dp[2] = stairs[1] + stairs[2]
        }

        for (i in 3..n) {
            dp[i] = maxOf(dp[i - 3] + stairs[i - 1] + stairs[i], dp[i - 2] + stairs[i])
        }

        return dp[n].toString()
    }
}
