package boj.problems

import java.io.BufferedReader

class No31628 {
    fun solve(input: BufferedReader): String {
        val grid = Array(10) { input.readLine().split(" ") }

        for (row in grid) {
            if (row.distinct().size == 1) {
                return "1"
            }
        }

        for (col in 0 until 10) {
            val column = mutableSetOf<String>()
            for (row in 0 until 10) {
                column.add(grid[row][col])
            }
            if (column.size == 1) {
                return "1"
            }
        }

        return "0"
    }
}
