package boj.problems

import java.io.BufferedReader

fun main() {
    val input = System.`in`.bufferedReader()
    val output = System.out.bufferedWriter()

    output.write("${No1018.solve(input)}")

    input.close()
    output.flush()
    output.close()
}

object No1018 {
    fun solve(input: BufferedReader): Int {
        val (n, m) = input.readLine().split(" ").map { it.toInt() }
        val board = Array(n) { input.readLine() }
        val result = mutableListOf<Int>()

        for (i in 0 until n - 7) {
            for (j in 0 until m - 7) {
                result.add(getPaintingCount(board, i, j))
            }
        }

        return result.min()
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
