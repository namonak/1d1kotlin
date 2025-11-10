package boj.problems

import java.io.BufferedReader

class No1245 {
    fun solve(input: BufferedReader): String {
        val (rowCount, colCount) = input.readLine().trim().split(" ").map { it.toInt() }
        val field = Array(rowCount) {
            input.readLine().trim().split(" ").map { it.toInt() }.toIntArray()
        }
        val visited = Array(rowCount) { BooleanArray(colCount) }
        var peakCount = 0

        for (x in 0 until rowCount) {
            for (y in 0 until colCount) {
                if (visited[x][y]) continue
                if (field[x][y] == 0) {
                    visited[x][y] = true
                    continue
                }

                if (isPeak(field, visited, x, y)) {
                    peakCount++
                }
            }
        }

        return peakCount.toString()
    }

    private fun isPeak(
        field: Array<IntArray>,
        visited: Array<BooleanArray>,
        startX: Int,
        startY: Int
    ): Boolean {
        val rowCount = field.size
        val colCount = field[0].size
        val height = field[startX][startY]

        val queue = ArrayDeque<Cell>()
        queue.add(Cell(startX, startY))
        visited[startX][startY] = true

        var isPeak = true

        while (queue.isNotEmpty()) {
            val (x, y) = queue.removeFirst()

            for ((dx, dy) in DIRECTIONS) {
                val nx = x + dx
                val ny = y + dy

                if (nx !in 0 until rowCount || ny !in 0 until colCount) continue

                val nextHeight = field[nx][ny]

                if (nextHeight > height) {
                    isPeak = false
                }

                if (!visited[nx][ny] && nextHeight == height) {
                    visited[nx][ny] = true
                    queue.add(Cell(nx, ny))
                }
            }
        }

        return isPeak
    }

    private data class Cell(val x: Int, val y: Int)

    companion object {
        private val DIRECTIONS = arrayOf(
            intArrayOf(-1, -1),
            intArrayOf(-1, 0),
            intArrayOf(-1, 1),
            intArrayOf(0, -1),
            intArrayOf(0, 1),
            intArrayOf(1, -1),
            intArrayOf(1, 0),
            intArrayOf(1, 1)
        )
    }
}
