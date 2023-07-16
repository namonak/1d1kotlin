package boj.problems

import java.io.BufferedReader

fun main() {
    val input = System.`in`.bufferedReader()
    val output = System.out.bufferedWriter()

    output.write(No10039.solve(input).toString())

    input.close()
    output.flush()
    output.close()
}

object No10039 {
    fun solve(input: BufferedReader): Int {
        val scores = input.readLines().map { it.toInt() }
        return scores.map { if (it < 40) 40 else it }.sum() / scores.size
    }
}
