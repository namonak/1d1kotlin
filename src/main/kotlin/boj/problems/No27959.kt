package boj.problems

import java.io.BufferedReader

class No27959 {
    fun solve(input: BufferedReader): String {
        val (n, m) = input.readLine().split(" ").map { it.toInt() }
        return if (n * 100 >= m) "Yes" else "No"
    }
}
