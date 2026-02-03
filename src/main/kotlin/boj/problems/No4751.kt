package boj.problems

import java.io.BufferedReader
import java.util.StringTokenizer
import kotlin.math.abs

class No4751 {
    private data class Point(val x: Double, val y: Double)

    private class Polygon(private val vertices: List<Point>) {
        val area: Double by lazy {
            if (vertices.size < 3) return@lazy 0.0

            var sum = 0.0
            for (i in vertices.indices) {
                val current = vertices[i]
                val next = vertices[(i + 1) % vertices.size]
                sum += (current.x * next.y) - (next.x * current.y)
            }
            abs(sum) / 2.0
        }
    }

    fun solve(input: BufferedReader): String {
        val output = StringBuilder()

        while (true) {
            val nLine = input.readLine()?.trim() ?: break
            if (nLine.isEmpty()) continue

            val n = nLine.toInt()
            if (n < 3) break

            // 1. 꼭짓점 정보 읽기
            val vertices = List(n) {
                val st = StringTokenizer(input.readLine())
                Point(st.nextToken().toDouble(), st.nextToken().toDouble())
            }

            // 2. 사용 가능한 용융 금속의 부피 읽기
            val volume = input.readLine()?.trim()?.toDouble() ?: 0.0

            // 3. 단면적 계산 (다각형 넓이)
            val crossSectionArea = Polygon(vertices).area

            // 4. 길이 계산 (부피 = 단면적 * 길이 => 길이 = 부피 / 단면적)
            val barLength = if (crossSectionArea > 0) volume / crossSectionArea else 0.0

            // 5. 결과 포맷팅 (소수점 둘째 자리까지)
            output.append("BAR LENGTH: ${String.format("%.2f", barLength)}").append("\n")
        }

        return output.toString().trimEnd()
    }
}
