package boj.problems

import java.io.BufferedReader
import kotlin.math.hypot

class No33835 {
    private data class Point(val x: Long, val y: Long) {
        fun distanceTo(other: Point): Double =
            hypot((x - other.x).toDouble(), (y - other.y).toDouble())
    }

    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        val points = List(n) {
            val (x, y) = input.readLine().split(" ").map(String::toLong)
            Point(x, y)
        }

        val distance = points.first().distanceTo(points.last())
        return "%.10f".format(distance)
    }
}
