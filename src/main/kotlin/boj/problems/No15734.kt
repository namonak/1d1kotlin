package boj.problems

import java.io.BufferedReader

class No15734 {
    fun solve(input: BufferedReader): String {
        val (l, r, a) = input.readLine().trim().split(" ").map { it.toInt() }
        val diff = kotlin.math.abs(l - r)
        val teamSize: Int

        if (a >= diff) {
            val maxLR = maxOf(l, r)
            val aRemaining = a - diff
            val additionalPairs = aRemaining / 2
            teamSize = 2 * (maxLR + additionalPairs)
        } else {
            if (l < r) {
                val newL = l + a
                teamSize = 2 * minOf(newL, r)
            } else {
                val newR = r + a
                teamSize = 2 * minOf(l, newR)
            }
        }

        return teamSize.toString()
    }
}
