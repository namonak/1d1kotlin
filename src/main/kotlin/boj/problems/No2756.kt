package boj.problems

import java.io.BufferedReader
import kotlin.math.pow
import kotlin.math.sqrt

class No2756 {
    companion object {
        const val DARTS_PER_PLAYER = 6
    }

    data class Score(val player1: Int, val player2: Int)

    fun solve(input: BufferedReader): String {
        val t = input.readLine().toInt()
        val result = StringBuilder()

        repeat(t) {
            val player = input.readLine().split(" ").map { it.toDouble() }
            val gameScore = calculateScore(player)
            result.append(generateResult(gameScore)).append("\n")
        }

        return result.toString().trimEnd()
    }

    private fun calculateScore(player: List<Double>): Score {
        var player1 = 0
        var player2 = 0

        for (i in player.indices step 2) {
            val x = player[i]
            val y = player[i + 1]
            val score = DartScore.calculate(x, y)

            if (i < DARTS_PER_PLAYER) {
                player1 += score
            } else {
                player2 += score
            }
        }
        return Score(player1, player2)
    }

    private fun generateResult(score: Score): String {
        return when {
            score.player1 == score.player2 -> "SCORE: ${score.player1} to ${score.player2}, TIE."
            score.player1 > score.player2 -> "SCORE: ${score.player1} to ${score.player2}, PLAYER 1 WINS."
            else -> "SCORE: ${score.player1} to ${score.player2}, PLAYER 2 WINS."
        }
    }
}

class DartScore {
    companion object {
        fun calculate(
            x: Double,
            y: Double
        ): Int {
            val dist = distance(x, y)
            return when {
                dist <= 3 -> 100
                dist <= 6 -> 80
                dist <= 9 -> 60
                dist <= 12 -> 40
                dist <= 15 -> 20
                else -> 0
            }
        }

        private fun distance(
            x: Double,
            y: Double
        ): Double {
            return sqrt(x.pow(2.0) + y.pow(2.0))
        }
    }
}
