package boj.problems

import java.io.BufferedReader
import kotlin.math.abs

class No30223 {
    private data class Vertex(val x: Long, val y: Long)

    fun solve(input: BufferedReader): String {
        val vertices = parseInput(input)
        val result = findMinAreaDifference(vertices)

        // 소수점 첫째 자리까지 반올림하여 포맷팅
        return String.format("%.1f", result)
    }

    private fun parseInput(input: BufferedReader): List<Vertex> {
        val nLine = input.readLine() ?: return emptyList()
        val n = nLine.toInt()

        return (1..n).map {
            val (x, y) = input.readLine().split(" ").map { it.toLong() }
            Vertex(x, y)
        }
    }

    private fun findMinAreaDifference(vertices: List<Vertex>): Double {
        val totalArea = calculatePolygonArea(vertices)
        var minDiff = Double.MAX_VALUE
        val n = vertices.size

        // 모든 가능한 두 점(i, j)을 연결하여 자르기 시도
        // 인접한 점은 자를 수 없으므로 j는 i+2 부터 시작
        for (i in 0 until n) {
            for (j in i + 2 until n) {
                // 원형으로 연결되어 있으므로, 첫 점(0)과 끝 점(n-1)도 인접한 것으로 간주
                if (i == 0 && j == n - 1) continue

                // i부터 j까지의 정점들로 구성된 부분 다각형 생성
                // subList의 두 번째 인자는 exclusive하므로 j + 1 사용
                val subPolygon = vertices.subList(i, j + 1)

                val subArea = calculatePolygonArea(subPolygon)
                val diff = calculateDiff(totalArea, subArea)

                if (diff < minDiff) {
                    minDiff = diff
                }
            }
        }

        return minDiff
    }

    private fun calculateDiff(
        totalArea: Double,
        subArea: Double
    ): Double {
        return abs(2 * subArea - totalArea)
    }

    private fun calculatePolygonArea(vertices: List<Vertex>): Double {
        if (vertices.size < 3) return 0.0

        var sum = 0L
        val size = vertices.size

        for (i in 0 until size) {
            val current = vertices[i]
            val next = vertices[(i + 1) % size] // 마지막 점은 다시 첫 점과 연결

            sum += (current.x * next.y) - (next.x * current.y)
        }

        return abs(sum) / 2.0
    }
}
