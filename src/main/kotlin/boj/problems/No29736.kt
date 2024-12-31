package boj.problems

import java.io.BufferedReader

class No29736 {
    fun solve(input: BufferedReader): String {
        val (A, B) = input.readLine().split(" ").map { it.toInt() }
        val (K, X) = input.readLine().split(" ").map { it.toInt() }

        val lower = K - X
        val upper = K + X

        val start = maxOf(A, lower)
        val end = minOf(B, upper)

        val count = if (start <= end) (end - start + 1) else 0

        return if (count == 0) "IMPOSSIBLE" else count.toString()
    }
}
