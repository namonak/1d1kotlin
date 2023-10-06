package boj.problems

import java.io.BufferedReader

fun main() {
    val input = System.`in`.bufferedReader()
    val output = System.out.bufferedWriter()

    output.write(No11050.solve(input).toString())

    input.close()
    output.close()
}

object No11050 {
    private const val MAX = 10
    private val memo = IntArray(MAX + 1) { -1 }

    fun solve(input: BufferedReader): Int {
        val (n, k) = input.readLine().split(" ").map { it.toInt() }

        return factorial(n) / (factorial(k) * factorial(n - k))
    }

    private fun factorial(number: Int): Int {
        if (number == 0) {
            return 1
        }

        if (memo[number] != -1) {
            return memo[number]
        }

        memo[number] = number * factorial(number - 1)
        return memo[number]
    }
}
