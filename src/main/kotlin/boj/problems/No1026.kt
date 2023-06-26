package boj.problems

import java.io.BufferedReader

fun main() {
    val input = System.`in`.bufferedReader()
    val output = System.out.bufferedWriter()

    output.write(No1026.solve(input).toString())

    input.close()
    output.flush()
    output.close()
}

object No1026 {
    fun solve(input: BufferedReader): Int {
        val n = input.readLine().toInt()
        val a = input.readLine().split(" ").map { it.toInt() }.sorted()
        val b = input.readLine().split(" ").map { it.toInt() }.sortedDescending()

        var sum = 0
        for (i in 0 until n) {
            sum += a[i] * b[i]
        }

        return sum
    }
}
