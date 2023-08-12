package boj.problems

import java.io.BufferedReader

fun main() {
    val input = System.`in`.bufferedReader()
    val output = System.out.bufferedWriter()

    output.write(No18406.solve(input))

    input.close()
    output.flush()
    output.close()
}

object No18406 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine()
        val (a, b) = n.chunked(n.length / 2)

        return if (a.sumOf { it.toString().toInt() } == b.sumOf { it.toString().toInt() }) {
            "LUCKY"
        } else {
            "READY"
        }
    }
}
