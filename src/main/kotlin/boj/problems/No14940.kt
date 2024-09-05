package boj.problems

import java.io.BufferedReader

class No14940 {
    fun solve(input: BufferedReader): String {
        val (n, m) = input.readLine().split(" ").map { it.toInt() }
        val map = Array(n) { input.readLine().split(" ").map { it.toInt() }.toIntArray() }
        val direction = arrayOf(-1 to 0, 1 to 0, 0 to -1, 0 to 1)
        val visited = Array(n) { IntArray(m) { -1 } }
        val queue = ArrayDeque<Pair<Int, Int>>()

        loop@for (i in 0 until n) {
            for (j in 0 until m) {
                if (map[i][j] == 2) {
                    queue.add(i to j)
                    visited[i][j] = 0
                    break@loop
                }
            }
        }

        while (queue.isNotEmpty()) {
            val (x, y) = queue.removeFirst()

            for ((dx, dy) in direction) {
                val nx = x + dx
                val ny = y + dy

                if (nx in 0 until n && ny in 0 until m && map[nx][ny] == 1 && visited[nx][ny] == -1) {
                    visited[nx][ny] = visited[x][y] + 1
                    queue.add(nx to ny)
                }
            }
        }

        for (i in 0 until n) {
            for (j in 0 until m) {
                if (map[i][j] == 0 && visited[i][j] == -1) {
                    visited[i][j] = 0
                }
            }
        }

        return visited.joinToString("\n") { it.joinToString(" ") }
    }
}
