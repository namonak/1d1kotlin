package boj.problems

import java.io.BufferedReader

class No14500 {
    fun solve(input: BufferedReader): String {
        val (n, m) = input.readLine().split(" ").map { it.toInt() }
        val board = Array(n) { input.readLine().split(" ").map { it.toInt() }.toIntArray() }

        return getMaxTetrominoSum(board, n, m).toString()
    }

    private fun getMaxTetrominoSum(
        board: Array<IntArray>,
        n: Int,
        m: Int
    ): Int {
        var maxSum = 0

        for (i in 0 until n) {
            for (j in 0 until m) {
                for (tetromino in tetrominoes) {
                    var sum = 0
                    var valid = true
                    for ((dx, dy) in tetromino) {
                        val x = i + dx
                        val y = j + dy
                        if (x in 0 until n && y in 0 until m) {
                            sum += board[x][y]
                        } else {
                            valid = false
                            break
                        }
                    }
                    if (valid) maxSum = maxOf(maxSum, sum)
                }
            }
        }

        return maxSum
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
