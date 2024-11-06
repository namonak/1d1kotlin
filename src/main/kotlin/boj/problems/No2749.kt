package boj.problems

import java.io.BufferedReader

class No2749 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toLong()
        val result = calculateFibonacciModulo(n)

        return result.toString()
    }

    private fun calculateFibonacciModulo(n: Long): Long {
        var prev = 0L
        var curr = 1L

        for (i in 2..(n % PISANO_PERIOD).toInt()) {
            val next = (prev + curr) % MODULO_VALUE
            prev = curr
            curr = next
        }

        return curr
    }

    companion object {
        const val MODULO_VALUE = 1_000_000
        const val PISANO_PERIOD = 1_500_000
    }
}
