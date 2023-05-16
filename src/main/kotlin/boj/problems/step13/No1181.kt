package boj.problems.step13

import java.io.BufferedReader

fun main() {
    val input = System.`in`.bufferedReader()
    val output = System.out.bufferedWriter()

    output.write(No1181.solve(input))

    input.close()
    output.flush()
    output.close()
}

object No1181 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        val arr = Array(n) { input.readLine() }
        val result = arr.distinct().sortedWith(compareBy({ it.length }, { it }))

        return result.joinToString("\n")
    }
}
