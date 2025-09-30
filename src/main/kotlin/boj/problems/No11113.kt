package boj.problems

import java.io.BufferedReader
import java.util.StringTokenizer
import kotlin.math.hypot
import kotlin.math.roundToLong

class No11113 {
    private data class Point(val x: Double, val y: Double)

    fun solve(input: BufferedReader): String {
        val scanner = FastScanner(input)
        val pointCount = scanner.nextInt()
        val points = Array(pointCount) {
            Point(scanner.nextDouble(), scanner.nextDouble())
        }
        val routeCount = scanner.nextInt()
        val out = StringBuilder(routeCount * 4)

        repeat(routeCount) {
            val hopCount = scanner.nextInt()
            val indices = IntArray(hopCount) { scanner.nextInt() }
            val length = totalRouteLength(points, indices)
            out.append(length.roundToLong()).append('\n')
        }

        return out.toString().trimEnd()
    }

    /** 루트에 주어진 인덱스 순서대로 두 점 사이의 유클리드 거리를 합산 */
    private fun totalRouteLength(points: Array<Point>, route: IntArray): Double {
        var sum = 0.0
        for (i in 0 until route.lastIndex) {
            val a = points[route[i]]
            val b = points[route[i + 1]]
            sum += straightDistance(a, b)
        }
        return sum
    }

    // 두 점 사이 직선 거리
    private fun straightDistance(a: Point, b: Point): Double =
        hypot(b.x - a.x, b.y - a.y)

    private class FastScanner(private val br: BufferedReader) {
        private var st: StringTokenizer? = null

        fun next(): String {
            while (st == null || !st!!.hasMoreTokens()) {
                st = StringTokenizer(br.readLine())
            }
            return st!!.nextToken()
        }

        fun nextInt(): Int = next().toInt()
        fun nextDouble(): Double = next().toDouble()
    }
}
