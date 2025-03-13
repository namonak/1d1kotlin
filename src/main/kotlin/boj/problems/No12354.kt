package boj.problems

import java.io.BufferedReader

class No12354 {
    fun solve(input: BufferedReader): String {
        val t = input.readLine().toInt()
        val result = StringBuilder()

        repeat(t) { caseNum ->
            val n = input.readLine().toInt()
            val heights = input.readLine().split(" ").map { it.toInt() }

            val lisLength = getLongestIncreasingSubsequenceLength(heights)
            val destroyCount = n - lisLength

            result.append("Case #${caseNum + 1}: $destroyCount\n")
        }

        return result.toString().trim()
    }

    private fun getLongestIncreasingSubsequenceLength(heights: List<Int>): Int {
        val n = heights.size
        val dp = MutableList(n) { 1 }

        for (i in 1 until n) {
            for (j in 0 until i) {
                if (heights[i] > heights[j]) {
                    dp[i] = maxOf(dp[i], dp[j] + 1)
                }
            }
        }

        return dp.maxOrNull() ?: 1
    }
}
