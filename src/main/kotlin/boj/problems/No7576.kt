package boj.problems

import java.io.BufferedReader

class No7576 {
    fun solve(input: BufferedReader): String {
        val (m, n) = input.readLine().split(" ").map { it.toInt() }
        val directions = arrayOf(-1 to 0, 1 to 0, 0 to -1, 0 to 1)
        val tomatoes = Array(n) { input.readLine().split(" ").map { it.toInt() }.toIntArray() }
        val queue = ArrayDeque<Pair<Int, Int>>()

        for (i in 0 until n) {
            for (j in 0 until m) {
                if (tomatoes[i][j] == 1) {
                    queue.add(i to j)
                }
            }
        }

        while (queue.isNotEmpty()) {
            val (x, y) = queue.removeFirst()

            for ((dx, dy) in directions) {
                val nx = x + dx
                val ny = y + dy

                if (nx in 0 until n && ny in 0 until m && tomatoes[nx][ny] == 0) {
                    tomatoes[nx][ny] = tomatoes[x][y] + 1
                    queue.add(nx to ny)
                }
            }
        }

        val maxDay = tomatoes.flatMap { it.asList() }.maxOrNull() ?: 0

        return if (tomatoes.any { it.contains(0) }) "-1" else "${maxDay - 1}"
    }
}
