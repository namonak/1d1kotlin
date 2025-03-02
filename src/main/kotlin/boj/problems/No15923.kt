package boj.problems

import java.io.BufferedReader
import kotlin.math.abs

class No15923 {
    data class Point(val x: Int, val y: Int)

    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        val points = List(n) {
            val (x, y) = input.readLine().split(" ").map { it.toInt() }
            Point(x, y)
        }

        return perimeter(points).toString()
    }

    private fun distance(p1: Point, p2: Point): Double {
        return if (p1.x == p2.x) {
            abs(p1.y - p2.y).toDouble()
        } else {
            abs(p1.x - p2.x).toDouble()
        }
    }

    private fun perimeter(vertices: List<Point>): Int {
        var perim = 0.0
        for (i in vertices.indices) {
            perim += distance(vertices[i], vertices[(i + 1) % vertices.size])
        }
        return perim.toInt()
    }
}
