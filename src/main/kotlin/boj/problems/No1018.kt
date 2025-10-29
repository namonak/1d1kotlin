package boj.problems

import java.io.BufferedReader

class No1018 {
    fun solve(input: BufferedReader): String {
        val (n, m) = input.readLine().split(" ").map { it.toInt() }
        val board = Array(n) { input.readLine() }
        val result = mutableListOf<Int>()

        for (i in 0 until n - 7) {
            for (j in 0 until m - 7) {
                result.add(getPaintingCount(board, i, j))
            }
        }

        return result.min().toString()
    }

    private fun getPaintingCount(
        board: Array<String>,
        i: Int,
        j: Int
    ): Int {
        var start = board[i][j]
        var count = 0

        for (x in i until i + 8) {
            for (y in j until j + 8) {
                if (start != board[x][y]) {
                    count++
                }
                start = if (start == 'W') 'B' else 'W'
            }
            start = if (start == 'W') 'B' else 'W'
        }

        return count.coerceAtMost(64 - count)
    }
}
