package boj.problems

import java.io.BufferedReader
import kotlin.math.abs
import kotlin.math.sqrt

class No4771 {
    private companion object {
        private const val EPS_LEN = 1e-2 // 변 길이 같다고 볼 절대 오차 (문제/게시글 근거)
        private const val ANG_EPS = 1e-1 // 직각 등호 판정 절대 오차 (게시글 권고치)
    }

    data class Point(val x: Double, val y: Double) {
        fun distance(o: Point): Double {
            val dx = x - o.x; val dy = y - o.y
            return dx * dx + dy * dy
        }
    }

    data class Triangle(val p1: Point, val p2: Point, val p3: Point) {
        private val a2 get() = p2.distance(p3) // BC
        private val b2 get() = p1.distance(p3) // AC
        private val c2 get() = p1.distance(p2) // AB
        private val sides2 get() = listOf(a2, b2, c2).sorted()

        private val a get() = sqrt(a2)
        private val b get() = sqrt(b2)
        private val c get() = sqrt(c2)
        private val sidesLen get() = listOf(a, b, c).sorted()

        val isValid: Boolean
            get() {
                // 중복점 금지
                if (a2 == 0.0 || b2 == 0.0 || c2 == 0.0) return false
                // 일직선 금지(외적 != 0)
                val cross = (p2.x - p1.x) * (p3.y - p1.y) - (p2.y - p1.y) * (p3.x - p1.x)
                return cross != 0.0
            }

        val typeBySides: String
            get() {
                val (l0, l1, l2) = sidesLen
                return when {
                    abs(l0 - l1) <= EPS_LEN && abs(l1 - l2) <= EPS_LEN -> "Equilateral"
                    abs(l0 - l1) <= EPS_LEN || abs(l1 - l2) <= EPS_LEN || abs(l2 - l0) <= EPS_LEN -> "Isosceles"
                    else -> "Scalene"
                }
            }

        val typeByAngles: String
            get() {
                val (s0, s1, sMax) = sides2
                val diff = (s0 + s1) - sMax
                return when {
                    abs(diff) <= ANG_EPS -> "Right"
                    diff > 0 -> "Acute"
                    else -> "Obtuse"
                }
            }
    }

    fun solve(input: BufferedReader): String {
        val out = StringBuilder()
        while (true) {
            val line = input.readLine() ?: break
            val t = line.trim()
            if (t == "-1") break // 전체 줄이 "-1"일 때만 종료
            if (t.isEmpty()) continue

            val v = t.split(Regex("\\s+"))
            if (v.size < 6) continue

            val tri = Triangle(
                Point(v[0].toDouble(), v[1].toDouble()),
                Point(v[2].toDouble(), v[3].toDouble()),
                Point(v[4].toDouble(), v[5].toDouble())
            )

            if (!tri.isValid) out.append("Not a Triangle\n")
            else out.append(tri.typeBySides).append(' ').append(tri.typeByAngles).append('\n')
        }
        return out.toString().trimEnd()
    }
}
