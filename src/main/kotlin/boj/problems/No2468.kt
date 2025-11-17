package boj.problems

import java.io.BufferedReader
import java.util.ArrayDeque
import java.util.StringTokenizer

class No2468 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        val heightMap = Array(n) { IntArray(n) }

        var maxHeight = 0

        repeat(n) { row ->
            val st = StringTokenizer(input.readLine())
            for (col in 0 until n) {
                val height = st.nextToken().toInt()
                heightMap[row][col] = height
                if (height > maxHeight) {
                    maxHeight = height
                }
            }
        }

        var maxSafeAreaCount = 0

        // 비의 양을 0부터 최대 높이 - 1까지 변화시키며 안전 영역 개수 계산
        for (rainHeight in 0 until maxHeight) {
            val visited = Array(n) { BooleanArray(n) }
            var safeAreaCount = 0

            for (row in 0 until n) {
                for (col in 0 until n) {
                    if (isSafeAndNotVisited(row, col, rainHeight, heightMap, visited)) {
                        exploreSafeAreaBfs(
                            startRow = row,
                            startCol = col,
                            rainHeight = rainHeight,
                            heightMap = heightMap,
                            visited = visited
                        )
                        safeAreaCount++
                    }
                }
            }

            maxSafeAreaCount = maxOf(maxSafeAreaCount, safeAreaCount)
        }

        return maxSafeAreaCount.toString()
    }

    private fun isSafeAndNotVisited(
        row: Int,
        col: Int,
        rainHeight: Int,
        heightMap: Array<IntArray>,
        visited: Array<BooleanArray>
    ): Boolean {
        return !visited[row][col] && heightMap[row][col] > rainHeight
    }

    private fun exploreSafeAreaBfs(
        startRow: Int,
        startCol: Int,
        rainHeight: Int,
        heightMap: Array<IntArray>,
        visited: Array<BooleanArray>
    ) {
        val n = heightMap.size
        val queue = ArrayDeque<Position>()

        queue.add(Position(startRow, startCol))
        visited[startRow][startCol] = true

        while (queue.isNotEmpty()) {
            val (row, col) = queue.removeFirst()

            for ((dr, dc) in DIRECTIONS) {
                val nextRow = row + dr
                val nextCol = col + dc

                if (isInRange(nextRow, nextCol, n) &&
                    isSafeAndNotVisited(nextRow, nextCol, rainHeight, heightMap, visited)
                ) {
                    visited[nextRow][nextCol] = true
                    queue.add(Position(nextRow, nextCol))
                }
            }
        }
    }

    private fun isInRange(
        row: Int,
        col: Int,
        n: Int
    ): Boolean {
        return row in 0 until n && col in 0 until n
    }

    private data class Position(
        val row: Int,
        val col: Int
    )

    private companion object {
        // 상, 하, 좌, 우
        private val DIRECTIONS = arrayOf(
            -1 to 0,
            1 to 0,
            0 to -1,
            0 to 1
        )
    }
}
