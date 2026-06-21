package boj.problems

import java.io.BufferedReader

class No10026 {
    private val directions = arrayOf(-1 to 0, 1 to 0, 0 to -1, 0 to 1)

    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        val grid = Array(n) { input.readLine().toCharArray() }

        val normalCount = countAreas(grid, isColorBlind = false)
        val colorBlindCount = countAreas(grid, isColorBlind = true)
        return "$normalCount $colorBlindCount"
    }

    private fun countAreas(
        grid: Array<CharArray>,
        isColorBlind: Boolean
    ): Int {
        val visited = Array(grid.size) { BooleanArray(grid.size) }
        var areaCount = 0

        for (x in grid.indices) {
            for (y in grid[x].indices) {
                if (!visited[x][y]) {
                    visitArea(grid, visited, x, y, isColorBlind)
                    areaCount++
                }
            }
        }

        return areaCount
    }

    private fun visitArea(
        grid: Array<CharArray>,
        visited: Array<BooleanArray>,
        startX: Int,
        startY: Int,
        isColorBlind: Boolean
    ) {
        val queue = ArrayDeque<Pair<Int, Int>>()
        val areaColor = grid[startX][startY]

        queue.add(startX to startY)
        visited[startX][startY] = true

        while (queue.isNotEmpty()) {
            val (x, y) = queue.removeFirst()

            for ((dx, dy) in directions) {
                val nextX = x + dx
                val nextY = y + dy

                if (canVisit(grid, visited, nextX, nextY, areaColor, isColorBlind)) {
                    visited[nextX][nextY] = true
                    queue.add(nextX to nextY)
                }
            }
        }
    }

    private fun canVisit(
        grid: Array<CharArray>,
        visited: Array<BooleanArray>,
        x: Int,
        y: Int,
        areaColor: Char,
        isColorBlind: Boolean
    ): Boolean {
        return x in grid.indices &&
            y in grid[x].indices &&
            !visited[x][y] &&
            isSameAreaColor(areaColor, grid[x][y], isColorBlind)
    }

    private fun isSameAreaColor(
        currentColor: Char,
        nextColor: Char,
        isColorBlind: Boolean
    ): Boolean {
        return currentColor == nextColor ||
            isColorBlind && currentColor in "RG" && nextColor in "RG"
    }
}
