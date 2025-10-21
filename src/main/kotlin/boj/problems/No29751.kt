package boj.problems

import java.io.BufferedReader

class No29751 {
    fun solve(input: BufferedReader): String {
        val (a, b) = input.readLine().split(" ").map { it.toInt() }
        val result = (a * b / 2.0)
        return String.format("%.1f", result)
    }
}
