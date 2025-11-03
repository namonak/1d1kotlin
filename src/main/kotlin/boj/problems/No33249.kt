package boj.problems

import java.io.BufferedReader
import kotlin.math.PI

class No33249 {
    fun solve(input: BufferedReader): String {
        val (d, h) = input.readLine().split(" ").map { it.toDouble() }
        val radius = computeOuterRadius(d)
        val area = computeCanvasArea(radius, h)
        return "%.6f".format(area)
    }

    /** 내부 링 지름 d로부터 텐트의 바깥 반지름 R = d/2 + 5 계산 */
    private fun computeOuterRadius(innerDiameter: Double): Double {
        return innerDiameter / 2.0 + SEAT_RING_WIDTH
    }

    /** 텐트 캔버스 면적 = 윗면(원 1장) + 옆면(원통 포면) = πR² + 2πRh */
    private fun computeCanvasArea(
        radius: Double,
        height: Double
    ): Double {
        val topArea = PI * radius * radius
        val lateralArea = 2.0 * PI * radius * height
        return topArea + lateralArea
    }

    private companion object {
        private const val SEAT_RING_WIDTH = 5.0 // 관객석 고리 폭 (m)
    }
}
