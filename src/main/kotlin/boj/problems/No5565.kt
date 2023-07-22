package boj.problems

import java.io.BufferedReader

fun main() {
    val input = System.`in`.bufferedReader()
    val output = System.out.bufferedWriter()

    output.write(No5565.solve(input).toString())

    input.close()
    output.flush()
    output.close()
}

object No5565 {
    fun solve(input: BufferedReader): Int {
        val total = input.readLine().toInt()
        return (1..9).sumOf { input.readLine().toInt() }.let { total - it }
    }
}
