package boj.problems

import java.io.BufferedReader

class No1924 {
    fun solve(input: BufferedReader): String {
        val (x, y) = input.readLine().split(" ").map { it.toInt() }

        val days = listOf("SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT")
        val monthDays = listOf(31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31)

        return days[(monthDays.take(x - 1).sum() + y) % 7]
    }
}
