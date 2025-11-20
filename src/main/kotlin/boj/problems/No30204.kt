package boj.problems

import java.io.BufferedReader

class No30204 {
    fun solve(input: BufferedReader): String {
        val (_, divisor) = input.readLine()
            .trim()
            .split(" ")
            .map { it.toInt() }

        val totalSoldiers = input.readLine()
            .trim()
            .split(" ")
            .sumOf { it.toInt() }

        return if (totalSoldiers % divisor == 0) {
            POSSIBLE
        } else {
            IMPOSSIBLE
        }
    }

    companion object {
        private const val POSSIBLE = "1"
        private const val IMPOSSIBLE = "0"
    }
}
