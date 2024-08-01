package boj.problems

import java.io.BufferedReader

class No2355 {
    fun solve(input: BufferedReader): String {
        val (a, b) = input.readLine().split(" ").map { it.toLong() }
        return sumBetween(a, b).toString()
    }

    private fun sumBetween(a: Long, b: Long): Long {
        val (start, end) = if (a > b) b to a else a to b
        val n = end - start + 1
        return n * (start + end) / 2
    }
}
