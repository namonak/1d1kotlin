package boj.problems

import java.io.BufferedReader
import java.math.BigInteger

class No27434 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()

        return if (n <= 1) {
            BigInteger.ONE.toString()
        } else {
            factorial(2, n).toString()
        }
    }

    private fun factorial(
        l: Int,
        r: Int
    ): BigInteger =
        when {
            l > r -> BigInteger.ONE
            l == r -> BigInteger.valueOf(l.toLong())
            r - l == 1 -> BigInteger.valueOf(l.toLong()).multiply(BigInteger.valueOf(r.toLong()))
            else -> {
                val m = (l + r) ushr 1
                factorial(l, m).multiply(factorial(m + 1, r))
            }
        }
}
