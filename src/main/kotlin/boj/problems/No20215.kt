package boj.problems

import java.io.BufferedReader
import kotlin.math.sqrt

class No20215 {
    fun solve(input: BufferedReader): String {
        val (w, h) = input.readLine().split(" ").map { it.toDouble() }

        val rectangleCutLength = w + h
        val diagonalCutLength = sqrt(w * w + h * h)
        val difference = rectangleCutLength - diagonalCutLength

        return "%.9f".format(difference)
    }
}
