package boj.problems

import java.io.BufferedReader

class No30889 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        val rows = 10
        val cols = 20
        val seats = Array(rows) { CharArray(cols) { '.' } }

        repeat(n) {
            val seatInfo = input.readLine().trim()
            val rowChar = seatInfo[0]
            val rowIndex = rowChar - 'A'
            val colIndex = seatInfo.substring(1).toInt() - 1

            seats[rowIndex][colIndex] = 'o'
        }

        val sb = StringBuilder()
        for (r in 0 until rows) {
            for (c in 0 until cols) {
                sb.append(seats[r][c])
            }
            if (r != rows - 1) sb.append("\n")
        }
        return sb.toString()
    }
}
