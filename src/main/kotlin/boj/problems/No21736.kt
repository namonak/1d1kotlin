package boj.problems

import java.io.BufferedReader

class No21736 {
    private val directions = arrayOf(-1 to 0, 1 to 0, 0 to -1, 0 to 1)

    fun solve(input: BufferedReader): String {
        val (n, m) = input.readLine().split(" ").map { it.toInt() }
        val campus = Array(n) { input.readLine().toCharArray() }
        val visited = Array(n) { BooleanArray(m) { false } }
        val queue = ArrayDeque<Pair<Int, Int>>()
        var friendCount = 0

        loop@ for (i in 0 until n) {
            for (j in 0 until m) {
                if (campus[i][j] == 'I') {
                    queue.add(i to j)
                    visited[i][j] = true
                    break@loop
                }
            }
        }

        while (queue.isNotEmpty()) {
            val (x, y) = queue.removeFirst()

            for ((dx, dy) in directions) {
                val nx = x + dx
                val ny = y + dy

                if (nx in 0 until n && ny in 0 until m && campus[nx][ny] != 'X' && !visited[nx][ny]) {
                    if (campus[nx][ny] == 'P') {
                        friendCount++
                    }
                    visited[nx][ny] = true
                    queue.add(Pair(nx, ny))
                }
            }
        }

        return if (friendCount == 0) "TT" else friendCount.toString()
    }
}
