package boj.problems

import java.io.BufferedReader
import kotlin.math.sqrt

object No1977 {
    fun solve(input: BufferedReader): String {
        val m = input.readLine().toInt()
        val n = input.readLine().toInt()
        val perfectSquares = (m..n).filter { isPerfectSquare(it) }

        return if (perfectSquares.isEmpty()) {
            "-1"
        } else {
            "${perfectSquares.sum()}\n${perfectSquares.first()}"
        }
    }

    private fun isPerfectSquare(number: Int): Boolean {
        if (number < 0) return false

        val sqrt = sqrt(number.toDouble()).toInt()
        return sqrt * sqrt == number
    }
}
