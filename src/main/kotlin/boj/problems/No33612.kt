package boj.problems

import java.io.BufferedReader

class No33612 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()

        val startYear = 2024
        val startMonth = 8
        val monthsToAdd = (n - 1) * 7

        val totalMonths = startMonth + monthsToAdd
        val year = startYear + (totalMonths - 1) / 12
        val month = (totalMonths - 1) % 12 + 1

        return "$year $month"
    }
}
