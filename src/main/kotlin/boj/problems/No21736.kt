package boj.problems

import java.io.BufferedReader

class No21736 {
    private val directions = arrayOf(-1 to 0, 1 to 0, 0 to -1, 0 to 1)

    fun solve(input: BufferedReader): String {
        val (n, _) = input.readLine().split(" ").map { it.toInt() }
        val campus = Array(n) { input.readLine().toCharArray() }
        val friendCount = countFriends(campus, findStart(campus))

        return if (friendCount == 0) "TT" else friendCount.toString()
    }

    private fun findStart(campus: Array<CharArray>): Pair<Int, Int> {
        for (x in campus.indices) {
            for (y in campus[x].indices) {
                if (campus[x][y] == 'I') return x to y
            }
        }

        error("Start position not found")
    }

    private fun countFriends(
        campus: Array<CharArray>,
        start: Pair<Int, Int>
    ): Int {
        val visited = Array(campus.size) { BooleanArray(campus[0].size) }
        val queue = ArrayDeque<Pair<Int, Int>>()
        var friendCount = 0

        queue.add(start)
        visited[start.first][start.second] = true

        while (queue.isNotEmpty()) {
            val (x, y) = queue.removeFirst()

            for ((dx, dy) in directions) {
                val nx = x + dx
                val ny = y + dy

                if (canVisit(campus, visited, nx, ny)) {
                    if (campus[nx][ny] == 'P') {
                        friendCount++
                    }
                    visited[nx][ny] = true
                    queue.add(Pair(nx, ny))
                }
            }
        }

        return friendCount
    }

    private fun canVisit(
        campus: Array<CharArray>,
        visited: Array<BooleanArray>,
        x: Int,
        y: Int
    ): Boolean {
        return x in campus.indices &&
            y in campus[x].indices &&
            campus[x][y] != 'X' &&
            !visited[x][y]
    }
}
