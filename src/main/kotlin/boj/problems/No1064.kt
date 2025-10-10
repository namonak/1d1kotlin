package boj.problems

import java.io.BufferedReader
import kotlin.math.sqrt

class No1064 {
    data class Point(val x: Int, val y: Int) {
        operator fun plus(other: Point) = Point(x + other.x, y + other.y)

        operator fun minus(other: Point) = Point(x - other.x, y - other.y)
    }

    fun solve(input: BufferedReader): String {
        val tokens = input.readLine().split(" ").map { it.toInt() }

        val a = Point(tokens[0], tokens[1])
        val b = Point(tokens[2], tokens[3])
        val c = Point(tokens[4], tokens[5])

        // 세 점이 일직선에 있으면 평행사변형을 만들 수 없습니다.
        if (isCollinear(a, b, c)) return "-1.0"

        // 각 경우에 따른 D의 좌표 계산
        val ds = computeDs(a, b, c)

        // 평행사변형의 꼭짓점 순서는 다음과 같이 정합니다.
        // Case 1 (기준 A): parallelogram vertices = [a, b, D1, c]
        // Case 2 (기준 B): parallelogram vertices = [b, a, D2, c]
        // Case 3 (기준 C): parallelogram vertices = [c, a, D3, b]
        val perim1 = perimeter(listOf(a, b, ds[0], c))
        val perim2 = perimeter(listOf(b, a, ds[1], c))
        val perim3 = perimeter(listOf(c, a, ds[2], b))

        val perimeters = listOf(perim1, perim2, perim3)
        val maxPerim = perimeters.maxOrNull()!!
        val minPerim = perimeters.minOrNull()!!
        val result = maxPerim - minPerim

        return result.toString()
    }

    private fun computeDs(
        a: Point,
        b: Point,
        c: Point
    ): List<Point> {
        // 각 경우에 대한 D의 좌표:
        // D1 = B + C - A
        // D2 = A + C - B
        // D3 = A + B - C
        val d1 = b + c - a
        val d2 = a + c - b
        val d3 = a + b - c
        return listOf(d1, d2, d3)
    }

    private fun isCollinear(
        a: Point,
        b: Point,
        c: Point
    ): Boolean {
        // 세 점의 외적이 0이면 일직선상에 있다고 판단할 수 있습니다.
        val cross = (b.x - a.x) * (c.y - a.y) - (b.y - a.y) * (c.x - a.x)
        return cross == 0
    }

    private fun distance(
        p1: Point,
        p2: Point
    ): Double {
        val dx = (p1.x - p2.x).toDouble()
        val dy = (p1.y - p2.y).toDouble()
        return sqrt(dx * dx + dy * dy)
    }

    private fun perimeter(vertices: List<Point>): Double {
        var perim = 0.0
        for (i in vertices.indices) {
            perim += distance(vertices[i], vertices[(i + 1) % vertices.size])
        }
        return perim
    }
}
