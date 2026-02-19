package boj.problems

import java.io.BufferedReader

class No9251 {
    fun solve(input: BufferedReader): String {
        val strA = input.readLine()
        val strB = input.readLine()

        return lcsLen(strA, strB).toString()
    }

    private fun lcsLen(
        strA: String,
        strB: String
    ): Int {
        val lenStrA = strA.length
        val lenStrB = strB.length

        val dp = Array(lenStrA + 1) { IntArray(lenStrB + 1) }

        for (i in 1..lenStrA) {
            for (j in 1..lenStrB) {
                if (strA[i - 1] == strB[j - 1]) {
                    dp[i][j] = dp[i - 1][j - 1] + 1
                } else {
                    dp[i][j] = maxOf(dp[i - 1][j], dp[i][j - 1])
                }
            }
        }

        return dp[lenStrA][lenStrB]
    }
}
