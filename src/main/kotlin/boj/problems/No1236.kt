package boj.problems

import java.io.BufferedReader

class No1236 {
    fun solve(input: BufferedReader): String {
        val (n, m) = input.readLine().split(" ").map { it.toInt() }
        val rows = List(n) { input.readLine() }

        val rowHasX = rows.map { row -> row.contains("X") }
        val colHasX = (0 until m).map { col -> rows.any { it[col] == 'X' } }

        val rowCnt = rowHasX.count { !it }
        val colCnt = colHasX.count { !it }

        return maxOf(rowCnt, colCnt).toString()
    }
}
