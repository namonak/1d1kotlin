package boj.problems

import java.io.BufferedReader
import kotlin.math.sqrt

class No24039 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        val primes = generatePrimes()
        val specialNumbers = generateSpecialNumbers(primes)
        val result = specialNumbers.first { it > n }

        return result.toString()
    }

    private fun generatePrimes(): List<Int> {
        val isPrime = BooleanArray(MAX_PRIME_LIMIT + 1) { true }.apply {
            if (isNotEmpty()) this[0] = false
            if (size > 1) this[1] = false
        }

        val sqrtLimit = sqrt(MAX_PRIME_LIMIT.toDouble()).toInt()
        for (i in 2..sqrtLimit) {
            if (isPrime[i]) {
                for (j in i * i..MAX_PRIME_LIMIT step i) {
                    isPrime[j] = false
                }
            }
        }

        return isPrime.indices.filter { isPrime[it] }
    }

    private fun generateSpecialNumbers(primes: List<Int>): List<Int> {
        return primes.zipWithNext { a, b -> a * b }
    }

    private companion object {
        // N이 10,000일 때, 연속된 소수 101 * 103 = 10,403이 답이 되므로 110이면 충분합니다.
        const val MAX_PRIME_LIMIT = 110
    }
}
