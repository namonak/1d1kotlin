package boj.problems

import java.io.BufferedReader

class No2740 {
    fun solve(input: BufferedReader): String {
        val (n, m) = input.readLine().split(" ").map { it.toInt() }
        val a = Array(n) { input.readLine().split(" ").map { it.toInt() }.toIntArray() }
        val (m2, k) = input.readLine().split(" ").map { it.toInt() }
        val b = Array(m2) { input.readLine().split(" ").map { it.toInt() }.toIntArray() }
        val result = Array(n) { IntArray(k) }

        for (i in 0 until n) {
            for (j in 0 until k) {
                for (x in 0 until m) {
                    result[i][j] += a[i][x] * b[x][j]
                }
            }
        }

        return result.joinToString("\n") { it.joinToString(" ") }
    }
}
