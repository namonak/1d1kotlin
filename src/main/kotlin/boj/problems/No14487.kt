package boj.problems

import java.io.BufferedReader

fun main() {
    val input = System.`in`.bufferedReader()
    val output = System.out.bufferedWriter()

    output.write(No14487.solve(input).toString())

    input.close()
    output.flush()
    output.close()
}

object No14487 {
    fun solve(input: BufferedReader): Int {
        val n = input.readLine().toInt()
        val costs = input.readLine().split(" ").map { it.toInt() }.sorted().dropLast(1)

        return costs.sum()
    }
}
