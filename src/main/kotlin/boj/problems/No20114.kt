package boj.problems

import java.io.BufferedReader

class No20114 {
    fun solve(input: BufferedReader): String {
        val (N, H, W) = input.readLine().split(" ").map { it.toInt() }
        val grid = Array(H) { input.readLine() }

        val result = CharArray(N) { '?' }

        for (i in 0 until N) {
            val charSet = mutableSetOf<Char>()

            for (h in 0 until H) {
                for (w in 0 until W) {
                    val ch = grid[h][i * W + w]
                    if (ch != '?') {
                        charSet.add(ch)
                    }
                }
            }

            result[i] = if (charSet.size == 1) charSet.first() else '?'
        }

        return String(result)
    }
}
