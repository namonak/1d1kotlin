package boj.problems

import java.io.BufferedReader
import kotlin.math.sqrt

class No4349 {
    fun solve(input: BufferedReader): String {
        val testCases = input.readLine().toInt()
        val results = mutableListOf<Int>()

        repeat(testCases) {
            val n = input.readLine().toInt()
            results += minimalWrappingPaper(n)
        }

        return results.joinToString("\n")
    }

    private fun minimalWrappingPaper(n: Int): Int {
        var minSurface = Int.MAX_VALUE

        for (x in 1..sqrt(n.toDouble()).toInt()) {
            if (n % x != 0) continue
            val nDivX = n / x

            for (y in x..sqrt(nDivX.toDouble()).toInt()) {
                if (nDivX % y != 0) continue
                val z = nDivX / y

                val surfaceArea = 2 * (x * y + y * z + z * x)
                minSurface = minOf(minSurface, surfaceArea)
            }
        }

        return minSurface
    }
}
