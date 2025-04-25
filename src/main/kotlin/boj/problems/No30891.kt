package boj.problems

import java.io.BufferedReader

class No30891 {
    data class Point(val x: Int, val y: Int)
    data class SearchRange(val minX: Int, val maxX: Int, val minY: Int, val maxY: Int)

    fun solve(input: BufferedReader): String {
        val (n, r) = input.readLine().split(" ").map { it.toInt() }
        val points = List(n) {
            val (x, y) = input.readLine().split(" ").map { it.toInt() }
            Point(x, y)
        }
        val rSquared = r * r
        val range = computeSearchRange(points, r)

        val (bestX, bestY) = findBestCenter(points, rSquared, range)
        return "$bestX $bestY"
    }

    private fun computeSearchRange(points: List<Point>, r: Int): SearchRange {
        val xs = points.map { it.x }
        val ys = points.map { it.y }
        val minX = (xs.minOrNull() ?: 0) - r
        val maxX = (xs.maxOrNull() ?: 0) + r
        val minY = (ys.minOrNull() ?: 0) - r
        val maxY = (ys.maxOrNull() ?: 0) + r
        return SearchRange(minX, maxX, minY, maxY)
    }

    private fun findBestCenter(
        points: List<Point>,
        rSquared: Int,
        range: SearchRange
    ): Pair<Int, Int> {
        var bestCount = 0
        var bestX = range.minX
        var bestY = range.minY

        for (x in range.minX..range.maxX) {
            for (y in range.minY..range.maxY) {
                val count = countInside(points, x, y, rSquared)
                if (count > bestCount) {
                    bestCount = count
                    bestX = x
                    bestY = y
                }
            }
        }

        return bestX to bestY
    }

    private fun countInside(
        points: List<Point>,
        centerX: Int,
        centerY: Int,
        rSquared: Int
    ): Int = points.count { (x, y) ->
        val dx = centerX - x
        val dy = centerY - y
        dx * dx + dy * dy <= rSquared
    }
}
