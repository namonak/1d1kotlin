package boj.problems

import java.io.BufferedReader

class No14729 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        val scores = DoubleArray(n) { input.readLine().toDouble() }
        scores.sort()
        return scores.take(7).joinToString("\n") { String.format("%.3f", it) }
    }
}
