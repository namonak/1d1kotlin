package boj.problems

import java.io.BufferedReader

fun main() {
    val input = System.`in`.bufferedReader()
    val output = System.out.bufferedWriter()

    output.write(No16212.solve(input))

    input.close()
    output.flush()
    output.close()
}

object No16212 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        val arr = input.readLine().split(" ").map { it.toInt() }.toIntArray()

        arr.sort()

        return arr.joinToString(" ")
    }
}
