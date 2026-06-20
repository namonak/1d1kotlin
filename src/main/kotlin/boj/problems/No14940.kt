package boj.problems

import java.io.BufferedReader

class No14940 {
    private val directions = arrayOf(-1 to 0, 1 to 0, 0 to -1, 0 to 1)

    fun solve(input: BufferedReader): String {
        val (n, _) = input.readLine().split(" ").map { it.toInt() }
        val map = Array(n) { input.readLine().split(" ").map { it.toInt() }.toIntArray() }
        val distances = calculateDistances(map, findStart(map))

        markGroundAsZero(map, distances)

        return distances.joinToString("\n") { it.joinToString(" ") }
    }

    private fun findStart(map: Array<IntArray>): Pair<Int, Int> {
        for (x in map.indices) {
            for (y in map[x].indices) {
                if (map[x][y] == 2) return x to y
            }
        }

        error("Start position not found")
    }

    private fun calculateDistances(
        map: Array<IntArray>,
        start: Pair<Int, Int>
    ): Array<IntArray> {
        val distances = Array(map.size) { IntArray(map[0].size) { -1 } }
        val queue = ArrayDeque<Pair<Int, Int>>()

        queue.add(start)
        distances[start.first][start.second] = 0

        while (queue.isNotEmpty()) {
            val (x, y) = queue.removeFirst()

            for ((dx, dy) in directions) {
                val nx = x + dx
                val ny = y + dy

                if (canVisit(map, distances, nx, ny)) {
                    distances[nx][ny] = distances[x][y] + 1
                    queue.add(nx to ny)
                }
            }
        }

        return distances
    }

    private fun canVisit(
        map: Array<IntArray>,
        distances: Array<IntArray>,
        x: Int,
        y: Int
    ): Boolean {
        return x in map.indices &&
            y in map[x].indices &&
            map[x][y] == 1 &&
            distances[x][y] == -1
    }

    private fun markGroundAsZero(
        map: Array<IntArray>,
        distances: Array<IntArray>
    ) {
        for (x in map.indices) {
            for (y in map[x].indices) {
                if (map[x][y] == 0 && distances[x][y] == -1) {
                    distances[x][y] = 0
                }
            }
        }
    }
}
