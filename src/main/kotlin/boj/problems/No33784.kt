package boj.problems

import java.io.BufferedReader
import java.util.StringTokenizer
import kotlin.math.abs

class No33784 {
    private data class Point(val x: Long, val y: Long)

    fun solve(input: BufferedReader): String {
        val m = input.readLine()?.toIntOrNull() ?: return "0"
        val points = parsePoints(input, m)

        val doubleArea = calculateDoubleArea(points)

        // 신발끈 공식 결과(2 * 넓이)를 2로 나누어 실제 넓이(타일 개수)를 구합니다.
        return (abs(doubleArea) / 2).toString()
    }

    private fun parsePoints(
        input: BufferedReader,
        count: Int
    ): List<Point> {
        return List(count) {
            val st = StringTokenizer(input.readLine())
            Point(
                x = st.nextToken().toLong(),
                y = st.nextToken().toLong()
            )
        }
    }

    /**
     * 신발끈 공식을 이용하여 다각형 넓이의 2배 값을 계산합니다.
     * 정수 연산만으로 처리하기 위해 마지막에 2로 나누기 전의 합계를 반환합니다.
     * * 공식: Σ (x_i * y_{i+1} - x_{i+1} * y_i)
     */
    private fun calculateDoubleArea(points: List<Point>): Long {
        var sum = 0L
        val size = points.size

        for (i in points.indices) {
            val current = points[i]
            val next = points[(i + 1) % size]

            sum += (current.x * next.y) - (next.x * current.y)
        }

        return sum
    }
}
