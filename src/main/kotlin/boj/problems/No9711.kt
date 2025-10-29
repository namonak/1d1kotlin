package boj.problems

import java.io.BufferedReader
import java.math.BigInteger

class No9711 {
    private val memo = Array(MAX_INPUT + 1) { BigInteger("-1") }

    fun solve(input: BufferedReader): String {
        val t = input.readLine().toInt()
        val sb = StringBuilder()

        memo[0] = BigInteger.ZERO
        memo[1] = BigInteger.ONE

        for (i in 1..t) {
            val (p, q) = input.readLine().split(" ").map { it.toInt() }
            sb.append("Case #$i: ${fibonacci(p).remainder(BigInteger(q.toString()))}\n")
        }

        return sb.toString().trim()
    }

    private fun fibonacci(a: Int): BigInteger {
        if (memo[a] != BigInteger("-1")) {
            return memo[a]
        }

        memo[a] = fibonacci(a - 1) + fibonacci(a - 2)

        return memo[a]
    }

    private companion object {
        private const val MAX_INPUT = 10000
    }
}
