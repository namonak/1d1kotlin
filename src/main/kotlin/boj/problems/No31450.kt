package boj.problems

import java.io.BufferedReader

class No31450 {
    fun solve(input: BufferedReader): String {
        val (m, k) = input.readLine().split(" ").map { it.toLong() }
        return if (m % k == 0L) "Yes" else "No"
    }
}
