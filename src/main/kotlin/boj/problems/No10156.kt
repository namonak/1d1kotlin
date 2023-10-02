package boj.problems

import java.io.BufferedReader

fun main() {
    val input = System.`in`.bufferedReader()
    val output = System.out.bufferedWriter()

    output.write(No10156.solve(input).toString())

    input.close()
    output.close()
}

object No10156 {
    fun solve(input: BufferedReader): Int {
        val (k, n, m) = input.readLine().split(" ").map { it.toInt() }
        return if (k * n > m) k * n - m else 0
    }
}
