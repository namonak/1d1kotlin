package boj.problems

import java.io.BufferedReader

fun main() {
    val input = System.`in`.bufferedReader()
    val output = System.out.bufferedWriter()

    output.write(No11004.solve(input).toString())

    input.close()
    output.flush()
    output.close()
}

object No11004 {
    fun solve(input: BufferedReader): Int {
        val (_, k) = input.readLine().split(" ").map { it.toInt() }
        val numbers = input.readLine().split(" ").map { it.toInt() }.sorted()

        return numbers[k - 1]
    }
}
