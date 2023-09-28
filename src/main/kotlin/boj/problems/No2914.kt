package boj.problems

import java.io.BufferedReader

fun main() {
    val input = System.`in`.bufferedReader()
    val output = System.out.bufferedWriter()

    output.write(No2914.solve(input).toString())

    input.close()
    output.close()
}

object No2914 {
    fun solve(input: BufferedReader): Int {
        val (a, i) = input.readLine().split(" ").map { it.toInt() }
        return a * (i - 1) + 1
    }
}
