package boj.problems

import java.io.BufferedReader

fun main() {
    val input = System.`in`.bufferedReader()
    val output = System.out.bufferedWriter()

    output.write(No11399.solve(input).toString())

    input.close()
    output.flush()
    output.close()
}

object No11399 {
    fun solve(input: BufferedReader): Int {
        val n = input.readLine().toInt()
        val numbers = input.readLine().split(" ").map { it.toInt() }.sorted()

        var prev = 0
        var sum = 0

        for (i in 0 until n) {
            sum += prev + numbers[i]
            prev += numbers[i]
        }

        return sum
    }
}
