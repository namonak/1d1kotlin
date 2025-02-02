package boj.problems

import java.io.BufferedReader

class No15726 {
    fun solve(input: BufferedReader): String {
        val (a, b, c) = input.readLine().split(" ").map { it.toDouble() }

        val result1 = (a * b) / c
        val result2 = (a / b) * c

        return maxOf(result1, result2).toInt().toString()
    }
}
