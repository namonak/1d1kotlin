package boj.problems

import java.io.BufferedReader

class No1932 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        val triangle = Array(n) { input.readLine().split(" ").map { it.toInt() }.toIntArray() }

        for (i in 0 until n) {
            for (j in 0..i) {
                val left = if (j > 0) triangle[i - 1][j - 1] else 0
                val right = if (j < i) triangle[i - 1][j] else 0
                triangle[i][j] += maxOf(left, right)
            }
        }

        return triangle[n - 1].maxOrNull().toString()
    }
}
