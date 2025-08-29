package boj.problems

import java.io.BufferedReader
import java.util.Locale
import kotlin.math.abs

class No2166 {
    private data class Point(val x: Long, val y: Long)

    fun solve(input: BufferedReader): String {
        val n = input.readLine().trim().toInt()
        val points = ArrayList<Point>(n)

        repeat(n) {
            val (x, y) = input.readLine().trim().split(" ").map { it.toLong() }
            points.add(Point(x, y))
        }

        val area = areaByShoelace(points)
        return String.format(Locale.US, "%.1f", area)
    }

    /** 신발끈 공식을 이용해 다각형의 면적을 계산합니다. */
    private fun areaByShoelace(points: List<Point>): Double {
        val n = points.size
        var sum = 0L
        for (i in 0 until n) {
            val a = points[i]
            val b = points[(i + 1) % n] // 마지막-첫 번째 연결
            sum += a.x * b.y - b.x * a.y
        }
        return abs(sum).toDouble() / 2.0
    }
}
