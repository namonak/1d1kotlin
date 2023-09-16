package boj.problems

import java.io.BufferedReader

fun main() {
    val input = System.`in`.bufferedReader()
    val output = System.out.bufferedWriter()

    output.write(No15964.solve(input).toString())

    input.close()
    output.flush()
    output.close()
}

object No15964 {
    fun solve(input: BufferedReader): Long {
        val (a, b) = input.readLine().split(" ").map { it.toLong() }
        return (a + b) * (a - b)
    }
}
