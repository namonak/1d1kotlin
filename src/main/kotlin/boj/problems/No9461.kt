package boj.problems

import java.io.BufferedReader

object No9461 {
    fun solve(input: BufferedReader): String {
        val caseCount = input.readLine().toInt()
        val cases = (1..caseCount).map { input.readLine().toInt() }

        val answers = cases.map { case ->
            when (case) {
                1 -> 1
                2 -> 1
                3 -> 1
                4 -> 2
                5 -> 2
                else -> {
                    val dp = Array(case + 1) { 0L }
                    dp[1] = 1
                    dp[2] = 1
                    dp[3] = 1
                    dp[4] = 2
                    dp[5] = 2

                    (6..case).forEach { i ->
                        dp[i] = dp[i - 1] + dp[i - 5]
                    }

                    dp[case]
                }
            }
        }

        return answers.joinToString("\n")
    }
}
