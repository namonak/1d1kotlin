package boj.problems

import java.io.BufferedReader

fun main() {
    val input = System.`in`.bufferedReader()
    val output = System.out.bufferedWriter()

    output.write(No2845.solve(input))

    input.close()
    output.flush()
    output.close()
}

object No2845 {
    fun solve(input: BufferedReader): String {
        val (l, p) = input.readLine().split(" ").map { it.toInt() }
        val news = input.readLine().split(" ").map { it.toInt() }

        return news.map { it - l * p }.joinToString(" ")
    }
}
