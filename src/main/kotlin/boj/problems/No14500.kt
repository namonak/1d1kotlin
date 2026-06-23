package boj.problems

import java.io.BufferedReader

class No14500 {
    fun solve(input: BufferedReader): String {
        val (n, _) = input.readLine().split(" ").map { it.toInt() }
        val board = Array(n) { input.readLine().split(" ").map { it.toInt() }.toIntArray() }

        return getMaxTetrominoSum(board).toString()
    }

    private fun getMaxTetrominoSum(board: Array<IntArray>): Int {
        var maxSum = 0

        for (row in board.indices) {
            for (col in board[0].indices) {
                for (tetromino in tetrominoes) {
                    val sum = calculateSum(board, row, col, tetromino) ?: 0
                    maxSum = maxOf(maxSum, sum)
                }
            }
        }

        return maxSum
    }

    private fun calculateSum(
        board: Array<IntArray>,
        row: Int,
        col: Int,
        tetromino: List<Pair<Int, Int>>
    ): Int? {
        var sum = 0
        for ((rowOffset, colOffset) in tetromino) {
            val nextRow = row + rowOffset
            val nextCol = col + colOffset
            if (nextRow !in board.indices || nextCol !in board[0].indices) return null
            sum += board[nextRow][nextCol]
        }
        return sum
    }

    companion object {
        // 모든 테트로미노의 19가지 모양을 좌표로 정의
        val tetrominoes = listOf(
            listOf(Pair(0, 0), Pair(0, 1), Pair(0, 2), Pair(0, 3)),
            listOf(Pair(0, 0), Pair(1, 0), Pair(2, 0), Pair(3, 0)),
            listOf(Pair(0, 0), Pair(0, 1), Pair(1, 0), Pair(1, 1)),
            listOf(Pair(0, 0), Pair(1, 0), Pair(2, 0), Pair(2, 1)),
            listOf(Pair(2, 0), Pair(0, 1), Pair(1, 1), Pair(2, 1)),
            listOf(Pair(0, 0), Pair(1, 0), Pair(2, 0), Pair(0, 1)),
            listOf(Pair(0, 0), Pair(0, 1), Pair(1, 1), Pair(2, 1)),
            listOf(Pair(0, 0), Pair(1, 0), Pair(0, 1), Pair(0, 2)),
            listOf(Pair(0, 0), Pair(1, 0), Pair(1, 1), Pair(1, 2)),
            listOf(Pair(1, 0), Pair(1, 1), Pair(1, 2), Pair(0, 2)),
            listOf(Pair(0, 0), Pair(0, 1), Pair(0, 2), Pair(1, 2)),
            listOf(Pair(0, 0), Pair(1, 0), Pair(1, 1), Pair(2, 1)),
            listOf(Pair(0, 1), Pair(1, 0), Pair(1, 1), Pair(2, 0)),
            listOf(Pair(1, 0), Pair(0, 1), Pair(1, 1), Pair(0, 2)),
            listOf(Pair(0, 0), Pair(0, 1), Pair(1, 1), Pair(1, 2)),
            listOf(Pair(0, 1), Pair(1, 0), Pair(1, 1), Pair(1, 2)),
            listOf(Pair(0, 0), Pair(0, 1), Pair(0, 2), Pair(1, 1)),
            listOf(Pair(0, 0), Pair(1, 0), Pair(2, 0), Pair(1, 1)),
            listOf(Pair(0, 1), Pair(1, 0), Pair(1, 1), Pair(2, 1))
        )
    }
}
