package boj.problems

import java.io.BufferedReader

class No9205 {
    fun solve(input: BufferedReader): String {
        val t = input.readLine().toInt()
        val out = StringBuilder()

        repeat(t) {
            val n = input.readLine().toInt()
            val points = List(n + 2) {
                val (x, y) = input.readLine().split(" ").map { it.toInt() }
                Point(x, y)
            }

            out.appendLine(if (canReachFestival(points)) "happy" else "sad")
        }

        return out.toString().trimEnd()
    }

    private fun canReachFestival(points: List<Point>): Boolean {
        val goal = points.lastIndex
        val visited = BooleanArray(points.size)
        val queue = ArrayDeque<Int>()

        queue.add(START)
        visited[START] = true

        while (queue.isNotEmpty()) {
            val current = queue.removeFirst()
            if (current == goal) return true

            for (next in points.indices) {
                if (!visited[next] && withinDistance(points[current], points[next])) {
                    visited[next] = true
                    queue.add(next)
                }
            }
        }

        return false
    }

    private fun withinDistance(
        a: Point,
        b: Point
    ): Boolean {
        val distance = kotlin.math.abs(a.x - b.x) + kotlin.math.abs(a.y - b.y)
        return distance <= MAX_TRAVEL_DISTANCE
    }

    private data class Point(val x: Int, val y: Int)

    companion object {
        private const val MAX_TRAVEL_DISTANCE = 1000 // 20병 * 50m
        private const val START = 0
    }
}
