package boj.problems

import java.io.BufferedReader

class No2178 {
    fun solve(input: BufferedReader): String {
        val (n, m) = input.readLine().split(" ").map { it.toInt() }
        val maze = Array(n) { input.readLine().toCharArray() }
        val directions = arrayOf(-1 to 0, 1 to 0, 0 to -1, 0 to 1)
        val visited = Array(n) { IntArray(m) { 0 } }
        val queue = ArrayDeque<Pair<Int, Int>>()

        queue.add(0 to 0)
        visited[0][0] = 1

        while (queue.isNotEmpty()) {
            val (x, y) = queue.removeFirst()

            if (x == n - 1 && y == m - 1) {
                return visited[x][y].toString()
            }

            for ((dx, dy) in directions) {
                val nx = x + dx
                val ny = y + dy

                if (nx in 0 until n && ny in 0 until m && maze[nx][ny] == '1' && visited[nx][ny] == 0) {
                    visited[nx][ny] = visited[x][y] + 1
                    queue.add(Pair(nx, ny))
                }
            }
        }

        return ""
    }
}
