package boj.problems

import java.io.BufferedReader

class No11659 {
    fun solve(input: BufferedReader): String {
        val (n, m) = input.readLine().split(" ").map { it.toInt() }
        val numbers = input.readLine().split(" ").map { it.toInt() }
        val dp = IntArray(n + 1) { 0 }
        val sb = StringBuilder()

        for (i in 1..n) {
            dp[i] = dp[i - 1] + numbers[i - 1]
        }

        repeat(m) {
            val (i, j) = input.readLine().split(" ").map { it.toInt() }
            sb.append("${dp[j] - dp[i - 1]}\n")
        }

        return sb.toString().trimEnd()
    }
}
