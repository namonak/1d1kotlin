package boj.problems

import java.io.BufferedReader

fun main() {
    val input = System.`in`.bufferedReader()
    val output = System.out.bufferedWriter()

    output.write(No2669.solve(input).toString())

    input.close()
    output.flush()
    output.close()
}

object No2669 {
    fun solve(input: BufferedReader): Int {
        val board = Array(100) { BooleanArray(100) { false } }
        var answer = 0

        repeat(4) {
            val (x1, y1, x2, y2) = input.readLine().split(" ").map { it.toInt() }

            for (i in x1 until x2) {
                for (j in y1 until y2) {
                    if (!board[i][j]) {
                        board[i][j] = true
                        answer++
                    }
                }
            }
        }

        return answer
    }
}
