package boj.problems

import java.io.BufferedReader

class No17836 {
    private data class Position(val x: Int, val y: Int, val time: Int, val hasGram: Boolean)

    private val directions = arrayOf(-1 to 0, 1 to 0, 0 to -1, 0 to 1)

    fun solve(input: BufferedReader): String {
        val (n, _, timeLimit) = input.readLine().split(" ").map { it.toInt() }
        val castle = Array(n) { input.readLine().split(" ").map { it.toInt() }.toIntArray() }

        val time = findPrincess(castle)
        return if (time == -1 || time > timeLimit) "Fail" else time.toString()
    }

    private fun findPrincess(castle: Array<IntArray>): Int {
        val queue = ArrayDeque<Position>()
        val visited = Array(castle.size) { Array(castle[0].size) { BooleanArray(2) } }

        queue.add(Position(0, 0, 0, false))
        visited[0][0][WITHOUT_GRAM] = true

        while (queue.isNotEmpty()) {
            val current = queue.removeFirst()
            if (isPrincessPosition(castle, current.x, current.y)) return current.time

            for ((dx, dy) in directions) {
                val nextX = current.x + dx
                val nextY = current.y + dy

                if (!isInside(castle, nextX, nextY)) continue

                val hasGram = current.hasGram || castle[nextX][nextY] == GRAM
                if (!canVisit(castle, visited, nextX, nextY, hasGram)) continue

                visited[nextX][nextY][gramState(hasGram)] = true
                queue.add(Position(nextX, nextY, current.time + 1, hasGram))
            }
        }

        return -1
    }

    private fun canVisit(
        castle: Array<IntArray>,
        visited: Array<Array<BooleanArray>>,
        x: Int,
        y: Int,
        hasGram: Boolean
    ): Boolean {
        return (hasGram || castle[x][y] != WALL) &&
            !visited[x][y][gramState(hasGram)]
    }

    private fun isInside(
        castle: Array<IntArray>,
        x: Int,
        y: Int
    ): Boolean {
        return x in castle.indices && y in castle[x].indices
    }

    private fun isPrincessPosition(
        castle: Array<IntArray>,
        x: Int,
        y: Int
    ): Boolean {
        return x == castle.lastIndex && y == castle[x].lastIndex
    }

    private fun gramState(hasGram: Boolean): Int = if (hasGram) WITH_GRAM else WITHOUT_GRAM

    private companion object {
        const val WALL = 1
        const val GRAM = 2
        const val WITHOUT_GRAM = 0
        const val WITH_GRAM = 1
    }
}
