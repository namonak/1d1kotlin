package boj.problems

import java.io.BufferedReader

fun main() {
    val input = System.`in`.bufferedReader()
    val output = System.out.bufferedWriter()

    output.write(No1312.solve(input).toString())

    input.close()
    output.flush()
    output.close()
}

object No1312 {
    fun solve(input: BufferedReader): Int {
        val (a, b, n) = input.readLine().split(" ").map { it.toInt() }
        var result = a % b

        for (i in 0 until n - 1) {
            result *= 10
            result %= b
        }

        return result * 10 / b
    }
}
