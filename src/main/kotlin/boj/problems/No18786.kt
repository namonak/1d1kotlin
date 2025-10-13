package boj.problems

import java.io.BufferedReader
import kotlin.math.abs
import kotlin.math.max
import kotlin.math.min

class No18786 {
    data class Point(val x: Int, val y: Int)

    private data class Span(var min: Int = Int.MAX_VALUE, var max: Int = Int.MIN_VALUE) {
        fun update(v: Int) {
            min = min(min, v)
            max = max(max, v)
        }
    }

    fun solve(input: BufferedReader): String {
        val n = input.readLine().trim().toInt()
        val points = Array(n) {
            val (x, y) = input.readLine().trim().split(" ").map { it.toInt() }
            Point(x, y)
        }

        // 전처리: 같은 y를 공유하는 점들의 x-범위, 같은 x를 공유하는 점들의 y-범위를 기록
        val xSpanByY = HashMap<Int, Span>() // y -> (minX, maxX)
        val ySpanByX = HashMap<Int, Span>() // x -> (minY, maxY)

        for ((x, y) in points) {
            xSpanByY.getOrPut(y) { Span() }.update(x)
            ySpanByX.getOrPut(x) { Span() }.update(y)
        }

        var bestDoubleArea = 0

        for ((x, y) in points) {
            val xSpan = xSpanByY[y]
            val ySpan = ySpanByX[x]

            // 같은 y에 있는 점들과의 최대 가로 거리(밑변), 같은 x에 있는 점들과의 최대 세로 거리(높이)
            val height = if (ySpan != null) abs(ySpan.max - ySpan.min) else 0
            val width = if (xSpan != null) abs(xSpan.max - xSpan.min) else 0

            // 유효 삼각형은 width>0 && height>0일 때만 의미가 있지만,
            // 곱이 0이면 자동으로 최대값에 영향 없음
            bestDoubleArea = max(bestDoubleArea, width * height)
        }

        return bestDoubleArea.toString()
    }
}
