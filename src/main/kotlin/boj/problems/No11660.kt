package boj.problems

import java.io.BufferedReader

class No11660 {
    fun solve(input: BufferedReader): String {
        val (n, m) = input.readLine().split(" ").map { it.toInt() }
        val matrix = Array(n + 1) { IntArray(n + 1) }
        for (i in 1..n) {
            val row = input.readLine().split(" ").map { it.toInt() }
            for (j in 1..n) {
                matrix[i][j] = row[j - 1] + matrix[i - 1][j] + matrix[i][j - 1] - matrix[i - 1][j - 1]
            }
        }

        val result = StringBuilder()
        repeat(m) {
            val (x1, y1, x2, y2) = input.readLine().split(" ").map { it.toInt() }
            result.append(matrix[x2][y2] - matrix[x2][y1 - 1] - matrix[x1 - 1][y2] + matrix[x1 - 1][y1 - 1]).append("\n")
        }

        return result.toString().trim()
    }
}
