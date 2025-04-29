package boj.problems

import java.io.BufferedReader

class No1309 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        if (n == 0) return "0"

        var prevNo = 1 // dp[i-1][0]
        var prevTop = 1 // dp[i-1][1]
        var prevBottom = 1 // dp[i-1][2]
        val MOD = 9901

        for (i in 2..n) {
            val currNo = ((prevNo + prevTop) % MOD + prevBottom) % MOD
            val currTop = (prevNo + prevBottom) % MOD
            val currBottom = (prevNo + prevTop) % MOD

            prevNo = currNo
            prevTop = currTop
            prevBottom = currBottom
        }

        val result = (prevNo + prevTop + prevBottom) % MOD
        return result.toString()
    }
}
