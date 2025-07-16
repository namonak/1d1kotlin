package boj.problems

import java.io.BufferedReader

class No27110 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        val (a, b, c) = input.readLine().split(" ").map { it.toInt() }

        return (minOf(n, a) + minOf(n, b) + minOf(n, c)).toString()
    }
}
