package boj.problems

import java.io.BufferedReader
import kotlin.math.sqrt

class No2097 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toLong()

        if (n <= 3) {
            return "4"
        }

        val sqrtN = sqrt(n.toDouble()).toLong()
        var minSum = Long.MAX_VALUE

        for (a in 2..sqrtN) {
            val b = (n + a - 1) / a
            if (a * b >= n) {
                val sum = a + b
                if (sum < minSum) {
                    minSum = sum
                }
            }
        }

        return (2 * (minSum - 2)).toString()
    }
}
