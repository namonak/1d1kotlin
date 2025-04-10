package boj.problems

import java.io.BufferedReader

class No33572 {
    fun solve(input: BufferedReader): String {
        val (n, m) = input.readLine().split(" ").map { it.toLong() }
        val a = input.readLine().split(" ").map { it.toLong() }

        val totalMaxTime = a.sum() - n
        return if (totalMaxTime >= m) "DIMI" else "OUT"
    }
}
