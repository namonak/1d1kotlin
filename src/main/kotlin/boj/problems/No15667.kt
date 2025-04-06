package boj.problems

import java.io.BufferedReader
import java.math.BigInteger

class No15667 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().trim().toBigInteger()

        var k = BigInteger.ONE
        while (true) {
            val total = BigInteger.ONE + k + k * k
            if (total == n) return "$k"
            if (total > n) break
            k += BigInteger.ONE
        }

        return "-1"
    }
}
