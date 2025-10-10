package boj.problems

import java.io.BufferedReader

class No1711 {
    data class Point(val x: Long, val y: Long)

    fun solve(input: BufferedReader): String {
        val n = input.readLine().toInt()
        val points = List(n) {
            val (x, y) = input.readLine().split(" ").map(String::toLong)
            Point(x, y)
        }
        var count = 0

        for (i in 0 until n) {
            for (j in i + 1 until n) {
                for (k in j + 1 until n) {
                    if (isRightTriangle(points[i], points[j], points[k])) {
                        count++
                    }
                }
            }
        }

        return count.toString()
    }

    private fun isRightTriangle(
        p1: Point,
        p2: Point,
        p3: Point
    ): Boolean {
        val d1 = distanceSquared(p1, p2)
        val d2 = distanceSquared(p2, p3)
        val d3 = distanceSquared(p3, p1)

        return d1 + d2 == d3 || d1 + d3 == d2 || d2 + d3 == d1
    }

    private fun distanceSquared(
        p1: Point,
        p2: Point
    ): Long {
        return (p1.x - p2.x) * (p1.x - p2.x) + (p1.y - p2.y) * (p1.y - p2.y)
    }
}
