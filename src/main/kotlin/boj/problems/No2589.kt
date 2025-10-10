package boj.problems

import java.io.BufferedReader

class No2589 {
    private val directions = arrayOf(-1 to 0, 1 to 0, 0 to -1, 0 to 1)

    fun solve(input: BufferedReader): String {
        val (n, m) = input.readLine().split(" ").map { it.toInt() }
        val map = Array(n) { input.readLine().toCharArray() }
        var maxDistance = 0

        for (i in 0 until n) {
            for (j in 0 until m) {
                if (map[i][j] == 'L') {
                    val distance = bfs(map, i, j)
                    maxDistance = maxDistance.coerceAtLeast(distance)
                }
            }
        }

        return maxDistance.toString()
    }

    private fun bfs(
        map: Array<CharArray>,
        x: Int,
        y: Int
    ): Int {
        val visited = Array(map.size) { BooleanArray(map[0].size) }
        val queue = ArrayDeque<Pair<Int, Int>>()
        var distance = 0

        visited[x][y] = true
        queue.add(x to y)

        while (queue.isNotEmpty()) {
            repeat(queue.size) {
                val (curX, curY) = queue.removeFirst()

                for ((dx, dy) in directions) {
                    val nx = curX + dx
                    val ny = curY + dy

                    if (nx !in map.indices || ny !in map[0].indices) continue
                    if (map[nx][ny] == 'W' || visited[nx][ny]) continue

                    visited[nx][ny] = true
                    queue.add(nx to ny)
                }
            }
            if (queue.isNotEmpty()) distance++
        }

        return distance
    }
}
