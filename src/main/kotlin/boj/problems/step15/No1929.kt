package boj.problems.step15

import java.io.BufferedReader

class No1929 {
    fun solve(input: BufferedReader): String {
        val (m, n) = input.readLine().split(" ").map { it.toInt() }
        val primeNumbers = BooleanArray(n + 1) { false }

        primeNumbers[0] = true
        primeNumbers[1] = true

        for (i in 2..n) {
            if (primeNumbers[i]) {
                continue
            }

            for (j in i * 2..n step i) {
                primeNumbers[j] = true
            }
        }

        return primeNumbers.mapIndexed { index, isPrimeNumber ->
            if (index >= m && !isPrimeNumber) {
                index
            } else {
                null
            }
        }.filterNotNull().joinToString("\n")
    }
}
