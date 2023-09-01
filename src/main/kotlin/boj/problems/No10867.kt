package boj.problems

import java.io.BufferedReader

fun main() {
    val input = System.`in`.bufferedReader()
    val output = System.out.bufferedWriter()

    output.write(No10867.solve(input))

    input.close()
    output.flush()
    output.close()
}

object No10867 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        val numbers = input.readLine().split(" ").map { it.toInt() }.sorted().distinct()

        return numbers.joinToString(" ")
    }
}
