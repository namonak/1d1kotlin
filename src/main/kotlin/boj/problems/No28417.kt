package boj.problems

import java.io.BufferedReader

class No28417 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        var winnerScore = 0

        repeat(n) {
            val scores = input.readLine().split(" ").map { it.toInt() }
            val score = (scores.take(2).maxOrNull() ?: 0) + scores.drop(2).sortedDescending().take(2).sum()

            if (score > winnerScore) {
                winnerScore = score
            }
        }

        return winnerScore.toString()
    }
}
