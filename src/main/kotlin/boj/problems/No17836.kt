package boj.problems

import java.io.BufferedReader

class No17836 {
    data class Position(val x: Int, val y: Int, val time: Int, val hasGram: Boolean)

    private val directions = arrayOf(-1 to 0, 1 to 0, 0 to -1, 0 to 1)

    fun solve(input: BufferedReader): String {
        val (n, m, t) = input.readLine().split(" ").map { it.toInt() }
        val map = Array(n) { input.readLine().split(" ").map { it.toInt() }.toIntArray() }

        val time = findPrincess(map, n, m)
        return if (time == -1 || time > t) "Fail" else time.toString()
    }

    private fun findPrincess(map: Array<IntArray>, n: Int, m: Int): Int {
        val queue = ArrayDeque<Position>()
        val visited = Array(n) { BooleanArray(m) { false } }
        val visitedWithGram = Array(n) { BooleanArray(m) { false } }

        queue.add(Position(0, 0, 0, false))
        visited[0][0] = true

        while (queue.isNotEmpty()) {
            val (x, y, time, hasGram) = queue.removeFirst()

            for ((dx, dy) in directions) {
                val nx = x + dx
                val ny = y + dy

                if (nx == n - 1 && ny == m - 1) {
                    return time + 1
                }

                if (nx >= n || ny >= m || nx < 0 || ny < 0) continue

                if (hasGram) {
                    if (!visitedWithGram[nx][ny]) {
                        visitedWithGram[nx][ny] = true
                        queue.add(Position(nx, ny, time + 1, true))
                    }
                } else {
                    if (!visited[nx][ny] && map[nx][ny] != 1) {
                        var isSword = false
                        if (map[nx][ny] == 2) {
                            isSword = true
                        }
                        visited[nx][ny] = true
                        queue.add(Position(nx, ny, time + 1, isSword))
                    }
                }
            }
        }

        return -1
    }
}
