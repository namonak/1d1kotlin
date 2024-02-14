package boj.problems

import java.io.BufferedReader
import java.math.BigInteger

object No10826 {
    private const val MAX_INPUT = 10000
    private val memo = Array(MAX_INPUT + 1) { BigInteger("-1") }

    fun solve(input: BufferedReader): String {
        memo[0] = BigInteger.ZERO
        memo[1] = BigInteger.ONE

        return fibonacci(input.readLine().toInt()).toString()
    }

    private fun fibonacci(n: Int): BigInteger {
        if (memo[n] != BigInteger("-1")) {
            return memo[n]
        }

        memo[n] = fibonacci(n - 1) + fibonacci(n - 2)

        return memo[n]
    }
}
