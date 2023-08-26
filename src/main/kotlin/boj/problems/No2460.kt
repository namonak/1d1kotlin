package boj.problems

import java.io.BufferedReader

fun main() {
    val input = System.`in`.bufferedReader()
    val output = System.out.bufferedWriter()

    output.write(No2460.solve(input).toString())

    input.close()
    output.flush()
    output.close()
}

object No2460 {
    fun solve(input: BufferedReader): Int {
        var max = 0
        var current = 0

        repeat(10) {
            val (off, on) = input.readLine().split(" ").map { it.toInt() }
            current += on - off
            if (current > max) max = current
        }

        return max
    }
}
