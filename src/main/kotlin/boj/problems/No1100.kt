package boj.problems

import java.io.BufferedReader

fun main() {
    val input = System.`in`.bufferedReader()
    val output = System.out.bufferedWriter()

    output.write("${No1100.solve(input)}")

    input.close()
    output.flush()
    output.close()
}

object No1100 {
    fun solve(input: BufferedReader): Int {
        val chessBoard = Array(8) { input.readLine() }
        var count = 0

        for (i in 0 until 8) {
            for (j in 0 until 8) {
                if ((i + j) % 2 == 0 && chessBoard[i][j] == 'F') {
                    count++
                }
            }
        }

        return count
    }
}
