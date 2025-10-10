package boj.problems

import java.io.BufferedReader

class No1925 {
    data class Point(val x: Int, val y: Int)

    fun solve(input: BufferedReader): String {
        val points = List(3) {
            val (x, y) = input.readLine().split(" ").map { it.toInt() }
            Point(x, y)
        }

        // 벡터 외적으로 일직선 여부 판별
        val (a, b, c) = points
        val cross = (b.x - a.x) * (c.y - a.y) - (b.y - a.y) * (c.x - a.x)
        if (cross == 0) return "X"

        // 세 변의 길이 제곱
        fun dist2(
            p1: Point,
            p2: Point
        ): Int = (p1.x - p2.x).let { dx -> dx * dx } + (p1.y - p2.y).let { dy -> dy * dy }

        val d1 = dist2(a, b)
        val d2 = dist2(b, c)
        val d3 = dist2(c, a)

        val sides = listOf(d1, d2, d3).sorted()
        val (x, y, z) = sides // x, y: 짧은 변들 / z: 가장 긴 변

        val sameCount = setOf(d1, d2, d3).size

        return when (sameCount) {
            1 -> "JungTriangle" // 정삼각형
            2 -> { // 이등변삼각형
                when {
                    z == x + y -> "Jikkak2Triangle"
                    z > x + y -> "Dunkak2Triangle"
                    else -> "Yeahkak2Triangle"
                }
            }
            else -> { // 일반 삼각형
                when {
                    z == x + y -> "JikkakTriangle"
                    z > x + y -> "DunkakTriangle"
                    else -> "YeahkakTriangle"
                }
            }
        }
    }
}
