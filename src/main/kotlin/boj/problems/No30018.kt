package boj.problems

import java.io.BufferedReader

class No30018 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        val a = input.readLine().split(" ").map { it.toInt() }
        val b = input.readLine().split(" ").map { it.toInt() }

        val excess = mutableListOf<Int>()
        val deficit = mutableListOf<Int>()

        for (i in 0 until n) {
            val diff = b[i] - a[i]
            if (diff > 0) {
                excess.add(diff)
            } else if (diff < 0) {
                deficit.add(-diff)
            }
        }

        var moves = 0
        var excessIndex = 0
        var deficitIndex = 0

        while (excessIndex < excess.size && deficitIndex < deficit.size) {
            val move = minOf(excess[excessIndex], deficit[deficitIndex])
            excess[excessIndex] -= move
            deficit[deficitIndex] -= move
            moves += move

            if (excess[excessIndex] == 0) {
                excessIndex++
            }
            if (deficit[deficitIndex] == 0) {
                deficitIndex++
            }
        }

        return moves.toString()
    }
}
