package boj.problems

import java.io.BufferedReader
import kotlin.math.sqrt

class No30315 {
    data class Point(val x: Int, val y: Int)

    fun solve(input: BufferedReader): String {
        val k = input.readLine().toInt()
        val keeps = List(k) {
            val (x, y) = input.readLine().split(" ").map { it.toInt() }
            Point(x, y)
        }

        var minAverage = Double.MAX_VALUE
        for (keep in keeps) {
            val avg = computeAverageDistance(keep, keeps)
            if (avg < minAverage) {
                minAverage = avg
            }
        }

        return String.format("%.10f", minAverage)
    }

    private fun computeAverageDistance(center: Point, keeps: List<Point>): Double {
        var total = 0.0
        for (keep in keeps) {
            if (keep != center) {
                val dx = (keep.x - center.x).toDouble()
                val dy = (keep.y - center.y).toDouble()
                total += sqrt(dx * dx + dy * dy)
            }
        }
        return total / (keeps.size - 1)
    }
}
