package boj.problems

import java.io.BufferedReader

object No10156 {
    fun solve(input: BufferedReader): String {
        val (k, n, m) = input.readLine().split(" ").map { it.toInt() }
        val result = if (k * n > m) k * n - m else 0
        return result.toString()
    }
}
