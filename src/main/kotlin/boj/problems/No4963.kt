package boj.problems

import java.io.BufferedReader

class No4963 {
    fun solve(input: BufferedReader): String {
        val result = StringBuilder()

        while (true) {
            val (w, h) = input.readLine().split(" ").map { it.toInt() }
            if (w == 0 && h == 0) break

            val map = Array(h) { input.readLine().split(" ").map { it.toInt() }.toIntArray() }
            val visited = Array(h) { BooleanArray(w) }

            var islandCount = 0
            for (i in 0 until h) {
                for (j in 0 until w) {
                    if (!visited[i][j] && map[i][j] == 1) {
                        dfsRecursive(i, j, map, visited)
                        islandCount++
                    }
                }
            }

            result.append("$islandCount\n")
        }

        return result.toString().trim()
    }

    private fun dfsRecursive(
        x: Int,
        y: Int,
        map: Array<IntArray>,
        visited: Array<BooleanArray>
    ) {
        if (x < 0 || y < 0 || x >= map.size || y >= map[0].size) {
            return
        }

        if (visited[x][y] || map[x][y] == 0) {
            return
        }

        visited[x][y] = true

        val direction = arrayOf(
            -1 to 0,
            1 to 0,
            0 to -1,
            0 to 1,
            -1 to -1,
            -1 to 1,
            1 to -1,
            1 to 1
        )

        for ((dx, dy) in direction) {
            dfsRecursive(x + dx, y + dy, map, visited)
        }
    }
}
