package boj.problems

import java.io.BufferedReader

fun main() {
    val input = System.`in`.bufferedReader()
    val output = System.out.bufferedWriter()

    output.write(No2163.solve(input).toString())

    input.close()
    output.flush()
    output.close()
}

object No2163 {
    fun solve(input: BufferedReader): Int {
        val (n, m) = input.readLine().split(" ").map { it.toInt() }

        return n * m - 1
    }
}
