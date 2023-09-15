package boj.problems

import java.io.BufferedReader
import kotlin.math.abs

fun main() {
    val input = System.`in`.bufferedReader()
    val output = System.out.bufferedWriter()

    output.write(No2420.solve(input).toString())

    input.close()
    output.flush()
    output.close()
}

object No2420 {
    fun solve(input: BufferedReader): Long {
        val (n, m) = input.readLine().split(" ").map { it.toLong() }

        return abs(n - m)
    }
}
