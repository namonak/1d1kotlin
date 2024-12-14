package boj.problems

import java.io.BufferedReader

class No25600 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        var maxScore = 0

        repeat(n) {
            val (a, d, g) = input.readLine().split(" ").map { it.toInt() }
            val baseScore = a * (d + g)
            val finalScore = if (a == (d + g)) baseScore * 2 else baseScore
            maxScore = maxOf(maxScore, finalScore)
        }

        return maxScore.toString()
    }
}
