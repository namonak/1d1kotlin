package boj.problems

import java.io.BufferedReader

private const val MAX_INPUT_NUMBER = 68

fun main() {
    val input = System.`in`.bufferedReader()
    val output = System.out.bufferedWriter()

    output.write(No9507.solve(input))

    input.close()
    output.flush()
    output.close()
}

object No9507 {
    private val memo = LongArray(MAX_INPUT_NUMBER) { -1 }

    fun solve(input: BufferedReader): String {
        val count = input.readLine().toInt()
        val result = Array(count) { "" }

        for (i in 0 until count) {
            val number = input.readLine().toInt()
            result[i] = koong(number).toString()
        }

        return result.joinToString("\n")
    }

    private fun koong(number: Int): Long {
        if (number < 2) return 1
        if (number == 2) return 2
        if (number == 3) return 4
        if (memo[number] != -1L) return memo[number]
        memo[number] = koong(number - 1) + koong(number - 2) + koong(number - 3) + koong(number - 4)
        return memo[number]
    }
}
