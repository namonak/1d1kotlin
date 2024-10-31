package boj.problems

import java.io.BufferedReader
import kotlin.math.abs

class No17247 {
    data class Position(val x: Int, val y: Int)

    companion object {
        const val NUMBER_OF_ONE = 2
    }

    fun solve(input: BufferedReader): String {
        val (n, _) = input.readLine().split(" ").map { it.toInt() }
        val map = Array(n) { input.readLine().split(" ").map { it.toInt() }.toIntArray() }

        return calculateDistance(map.findOnePosition()).toString()
    }

    private fun calculateDistance(positions: List<Position>): Int {
        val (pos1, pos2) = positions

        return abs(pos1.x - pos2.x) + abs(pos1.y - pos2.y)
    }

    private fun Array<IntArray>.findOnePosition(): List<Position> {
        val positions = mutableListOf<Position>()
        for (i in indices) {
            for (j in this[i].indices) {
                if (this[i][j] == 1) positions.add(Position(i, j))
                if (positions.size == NUMBER_OF_ONE) return positions
            }
        }
        return positions
    }
}
