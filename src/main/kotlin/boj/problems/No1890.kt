package boj.problems

import java.io.BufferedReader
import java.util.StringTokenizer

class No1890 {
    fun solve(input: BufferedReader): String {
        val board = readBoard(input)
        return countPaths(board).toString()
    }

    private fun readBoard(input: BufferedReader): Array<IntArray> {
        val size = input.readLine().toInt()
        return Array(size) {
            val tokenizer = StringTokenizer(input.readLine())
            IntArray(size) { tokenizer.nextToken().toInt() }
        }
    }

    private fun countPaths(board: Array<IntArray>): Long {
        val size = board.size
        val dp = Array(size) { LongArray(size) }
        dp[0][0] = 1L

        for (row in board.indices) {
            for (col in board.indices) {
                if (dp[row][col] > 0L && (row != board.lastIndex || col != board.lastIndex)) {
                    propagatePaths(board, dp, row, col)
                }
            }
        }

        return dp.last().last()
    }

    private fun propagatePaths(
        board: Array<IntArray>,
        dp: Array<LongArray>,
        row: Int,
        col: Int
    ) {
        val jumpDistance = board[row][col]
        val nextRow = row + jumpDistance
        val nextCol = col + jumpDistance

        if (nextRow in board.indices) {
            dp[nextRow][col] += dp[row][col]
        }
        if (nextCol in board.indices) {
            dp[row][nextCol] += dp[row][col]
        }
    }
}
