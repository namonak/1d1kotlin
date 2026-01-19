package boj.problems

import java.io.BufferedReader
import java.util.StringTokenizer
import kotlin.math.abs

class No2175 {
    private data class Point(val x: Double, val y: Double) {
        fun midPointTo(other: Point): Point = Point((this.x + other.x) / 2.0, (this.y + other.y) / 2.0)
    }

    private class Land(val points: List<Point>) {
        val totalArea: Double = calculateArea(points)

        companion object {
            // 신발끈 공식을 이용한 면적 계산
            fun calculateArea(polygon: List<Point>): Double {
                var sum = 0.0
                for (i in polygon.indices) {
                    val current = polygon[i]
                    val next = polygon[(i + 1) % polygon.size]
                    sum += (current.x * next.y) - (next.x * current.y)
                }
                return abs(sum) / 2.0
            }
        }

        // 8개의 분할 포인트(꼭짓점 + 중점) 생성
        fun getDivisionPoints(): List<Point> {
            val divisionPoints = mutableListOf<Point>()
            for (i in points.indices) {
                val current = points[i]
                val next = points[(i + 1) % points.size]
                divisionPoints.add(current)
                divisionPoints.add(current.midPointTo(next))
            }
            return divisionPoints
        }
    }

    fun solve(input: BufferedReader): String {
        val vertices = parseVertices(input.readLine())
        val land = Land(vertices)
        val divisionPoints = land.getDivisionPoints()

        val bestPair = findMostEqualDivision(divisionPoints, land.totalArea)

        return formatResult(bestPair)
    }

    /**
     * 입력 문자열을 Point 리스트로 변환
     */
    private fun parseVertices(inputLine: String?): List<Point> {
        val st = StringTokenizer(inputLine ?: "")
        return List(4) { Point(st.nextToken().toDouble(), st.nextToken().toDouble()) }
    }

    /**
     * 가능한 모든 분할 중 두 면적의 차이가 가장 적은 조합을 탐색
     */
    private fun findMostEqualDivision(
        points: List<Point>,
        totalArea: Double
    ): Pair<Double, Double> {
        var minDiff = Double.MAX_VALUE
        var bestAreas = Pair(0.0, 0.0)
        val n = points.size

        for (i in 0 until n) {
            for (j in i + 2 until n) {
                // 인접한 점은 땅을 나눌 수 없으므로 제외
                if (i == 0 && j == n - 1) continue

                val area1 = Land.calculateArea(points.subList(i, j + 1))
                val area2 = totalArea - area1
                val diff = abs(area1 - area2)

                if (diff < minDiff) {
                    minDiff = diff
                    bestAreas = Pair(area1, area2)
                }
            }
        }
        return bestAreas
    }

    private fun formatResult(pair: Pair<Double, Double>): String {
        val (a, b) = if (pair.first < pair.second) pair else Pair(pair.second, pair.first)
        return "$a $b"
    }
}
