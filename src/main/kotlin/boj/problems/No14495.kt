package boj.problems

import java.io.BufferedReader

class No14495 {
    private val memo = Array(MAX_INPUT + 1) { -1L }

    fun solve(input: BufferedReader): String {
        memo[1] = 1
        memo[2] = 1
        memo[3] = 1

        return fibonacci(input.readLine().toInt()).toString()
    }

    private fun fibonacci(n: Int): Long {
        if (memo[n] != -1L) {
            return memo[n]
        }

        memo[n] = fibonacci(n - 1) + fibonacci(n - 3)

        return memo[n]
    }

    private companion object {
        private const val MAX_INPUT = 116
    }
}
