package boj.problems

import java.io.BufferedReader

class No5959 {
    private data class Circle(val x: Int, val y: Int, val r: Int)

    fun solve(input: BufferedReader): String {
        val n = input.readLine().trim().toInt()
        val circles = Array(n) {
            val (x, y, r) = input.readLine().trim().split(" ").map { it.toInt() }
            Circle(x, y, r)
        }
        val overlapsCount = IntArray(n)

        for (i in 0 until n) {
            for (j in i + 1 until n) {
                if (overlaps(circles[i], circles[j])) {
                    overlapsCount[i]++
                    overlapsCount[j]++
                }
            }
        }

        return overlapsCount.joinToString("\n")
    }

    private fun overlaps(a: Circle, b: Circle): Boolean {
        // 제곱 거리 비교로 sqrt 회피 (정확/성능)
        val dx = (a.x - b.x).toLong()
        val dy = (a.y - b.y).toLong()
        val dist2 = dx * dx + dy * dy
        val sumR = (a.r + b.r).toLong()
        val sumR2 = sumR * sumR
        return dist2 < sumR2 // 접하는 경우(tangent)는 입력에 없음 → '<' 사용
    }
}
