package boj.problems

import java.io.BufferedReader
import kotlin.math.sqrt

class No4948 {
    fun solve(input: BufferedReader): String {
        val isPrime = buildPrimeSieve()
        val primeCounts = buildPrimeCounts(isPrime)

        val result = StringBuilder()

        while (true) {
            val line = input.readLine() ?: break
            val n = line.toInt()

            if (n == 0) {
                break
            }

            val primeCountInRange = countPrimesBetween(n, primeCounts)
            result.appendLine(primeCountInRange)
        }

        return result.toString().trimEnd()
    }

    private fun buildPrimeSieve(): BooleanArray {
        val isPrime = BooleanArray(MAX_N + 1) { true }
        isPrime[0] = false
        isPrime[1] = false

        val maxCandidate = sqrt(MAX_N.toDouble()).toInt()
        for (candidate in MIN_PRIME..maxCandidate) {
            if (!isPrime[candidate]) continue

            var multiple = candidate * candidate
            while (multiple <= MAX_N) {
                isPrime[multiple] = false
                multiple += candidate
            }
        }

        return isPrime
    }

    private fun buildPrimeCounts(isPrime: BooleanArray): IntArray {
        val primeCounts = IntArray(isPrime.size)

        for (number in isPrime.indices) {
            val previousCount = if (number == 0) 0 else primeCounts[number - 1]
            primeCounts[number] = previousCount + if (isPrime[number]) 1 else 0
        }

        return primeCounts
    }

    private fun countPrimesBetween(
        n: Int,
        primeCounts: IntArray
    ): Int {
        val upper = 2 * n
        return primeCounts[upper] - primeCounts[n]
    }

    companion object {
        private const val MAX_N = 246_912 // 문제에서 주어지는 최대 2n
        private const val MIN_PRIME = 2
    }
}
