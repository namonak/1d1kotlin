package boj.problems

import java.io.BufferedReader
import kotlin.math.abs

class No30314 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        val from = input.readLine()
        val to = input.readLine()

        var totalMoves = 0
        for (i in 0 until n) {
            val diff = abs(from[i] - to[i])
            val move = minOf(diff, 26 - diff)
            totalMoves += move
        }

        return totalMoves.toString()
    }
}
