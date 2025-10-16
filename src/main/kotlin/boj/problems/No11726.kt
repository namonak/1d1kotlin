package boj.problems

import java.io.BufferedReader

class No11726 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        val dp = IntArray(n + 1)
        dp[0] = 1
        dp[1] = 1
        for (i in 2..n) {
            dp[i] = (dp[i - 1] + dp[i - 2]) % 10007
        }
        return dp[n].toString()
    }
}
