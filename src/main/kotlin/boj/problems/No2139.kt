package boj.problems

import java.io.BufferedReader

class No2139 {
    fun solve(input: BufferedReader): String {
        val result = StringBuilder()
        while (true) {
            val line = input.readLine()
            if (line == "0 0 0") {
                break
            }
            result.append(calculateDays(line)).append("\n")
        }
        return result.toString().trimEnd()
    }

    private fun calculateDays(input: String): Int {
        val (d, m, y) = input.split(" ").map { it.toInt() }
        val days = intArrayOf(0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31)
        var result = d
        for (i in 1 until m) {
            result += days[i]
        }
        if (m > 2 && isLeapYear(y)) {
            result++
        }
        return result
    }

    private fun isLeapYear(year: Int): Boolean {
        return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)
    }
}
