package boj.problems.step10

import java.io.BufferedReader

fun main() {
    val input = System.`in`.bufferedReader()
    val output = System.out.bufferedWriter()

    output.write(No27323.solve(input).toString())

    input.close()
    output.flush()
    output.close()
}

object No27323 {
    fun solve(input: BufferedReader): Int {
        val a = input.readLine().toInt()
        val b = input.readLine().toInt()

        return a * b
    }
}
