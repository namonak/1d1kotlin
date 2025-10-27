package boj.problems

import java.io.BufferedReader

class No10798 {
    private companion object {
        const val ROWS = 5
    }

    fun solve(input: BufferedReader): String {
        val lines = MutableList(ROWS) { input.readLine() }
        val maxCols = lines.maxOf { it.length }
        val sb = StringBuilder(maxCols * ROWS)

        for (c in 0 until maxCols) {
            for (r in 0 until ROWS) {
                val row = lines[r]
                if (c < row.length) sb.append(row[c])
            }
        }
        return sb.toString()
    }
}
