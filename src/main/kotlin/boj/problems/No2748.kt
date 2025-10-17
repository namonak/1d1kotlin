package boj.problems

import java.io.BufferedReader

class No2748 {
    companion object {
        private const val MAX = 90
    }

    private val memo = LongArray(MAX + 1) { -1 }

    fun solve(input: BufferedReader): String {
        memo[0] = 0
        memo[1] = 1

        return fibonacci(input.readLine().toInt()).toString()
    }

    private fun fibonacci(n: Int): Long {
        if (memo[n] != -1L) {
            return memo[n]
        }

        memo[n] = fibonacci(n - 1) + fibonacci(n - 2)

        return memo[n]
    }
}
