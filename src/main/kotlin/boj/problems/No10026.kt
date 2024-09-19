package boj.problems

import java.io.BufferedReader
import java.util.LinkedList
import java.util.Queue

class No10026 {
    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        val grid = Array(n) { input.readLine().toCharArray() }
        val visitedNormal = Array(n) { BooleanArray(n) }
        val visitedColorBlind = Array(n) { BooleanArray(n) }
        val direction = arrayOf(-1 to 0, 1 to 0, 0 to -1, 0 to 1)

        fun bfs(x: Int, y: Int, visited: Array<BooleanArray>, isColorBlind: Boolean) {
            val queue: Queue<Pair<Int, Int>> = LinkedList()
            queue.add(Pair(x, y))
            visited[x][y] = true
            val currentColor = grid[x][y]

            while (queue.isNotEmpty()) {
                val (curX, curY) = queue.poll()

                for ((dx, dy) in direction) {
                    val nX = curX + dx
                    val nY = curY + dy

                    if (nX in 0 until n && nY in 0 until n && !visited[nX][nY]) {
                        if (isColorBlind) {
                            if ((currentColor == 'R' || currentColor == 'G') && (grid[nX][nY] == 'R' || grid[nX][nY] == 'G')) {
                                visited[nX][nY] = true
                                queue.add(Pair(nX, nY))
                            } else if (currentColor == 'B' && grid[nX][nY] == 'B') {
                                visited[nX][nY] = true
                                queue.add(Pair(nX, nY))
                            }
                        } else {
                            if (grid[nX][nY] == currentColor) {
                                visited[nX][nY] = true
                                queue.add(Pair(nX, nY))
                            }
                        }
                    }
                }
            }
        }
        var normalCount = 0
        var colorBlindCount = 0

        for (i in 0 until n) {
            for (j in 0 until n) {
                if (!visitedNormal[i][j]) {
                    bfs(i, j, visitedNormal, isColorBlind = false)
                    normalCount++
                }
            }
        }

        for (i in 0 until n) {
            for (j in 0 until n) {
                if (!visitedColorBlind[i][j]) {
                    bfs(i, j, visitedColorBlind, isColorBlind = true)
                    colorBlindCount++
                }
            }
        }

        return "$normalCount $colorBlindCount"
    }
}
