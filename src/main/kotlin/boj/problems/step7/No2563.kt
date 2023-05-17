package boj.problems.step7

import java.io.BufferedReader

fun main() {
    val input = System.`in`.bufferedReader()
    val output = System.out.bufferedWriter()

    output.write(No2563.solve(input).toString())

    input.close()
    output.flush()
    output.close()
}

private const val WHITE_PAPER_SIZE = 100
private const val BLACK_PAPER_SIZE = 10

object No2563 {
    fun solve(input: BufferedReader): Int {
        val n = input.readLine().toInt()
        val arr = Array(WHITE_PAPER_SIZE) { BooleanArray(WHITE_PAPER_SIZE) { false } }
        var count = 0

        repeat(n) {
            val (x, y) = input.readLine().split(" ").map { it.toInt() }
            for (i in x until x + BLACK_PAPER_SIZE) {
                for (j in y until y + BLACK_PAPER_SIZE) {
                    if (!arr[i][j]) {
                        arr[i][j] = true
                        count++
                    }
                }
            }
        }

        return count
    }
}
