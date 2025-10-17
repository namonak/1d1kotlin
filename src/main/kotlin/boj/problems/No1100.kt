package boj.problems

import java.io.BufferedReader

class No1100 {
    fun solve(input: BufferedReader): String {
        val chessBoard = Array(8) { input.readLine() }
        var count = 0

        for (i in 0 until 8) {
            for (j in 0 until 8) {
                if ((i + j) % 2 == 0 && chessBoard[i][j] == 'F') {
                    count++
                }
            }
        }

        return count.toString()
    }
}
