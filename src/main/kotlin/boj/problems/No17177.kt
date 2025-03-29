package boj.problems

import java.io.BufferedReader
import kotlin.math.sqrt

class No17177 {
    fun solve(input: BufferedReader): String {
        // 세 변이 내림차순으로 주어진다고 가정: a >= b >= c
        val (a, b, c) = input.readLine().split(" ").map { it.toInt() }

        // 톨레미의 정리의 역과 피타고라스 정리를 통해 유도한 방정식:
        // a * x^2 + 2 * b * c * x + a * (c^2 - a^2 + b^2) = 0
        val p = a.toDouble()
        val q = 2.0 * b * c
        val r = a.toDouble() * (c * c - a * a + b * b)

        // 판별식 계산
        val discriminant = q * q - 4 * p * r
        if (discriminant < 0) return "-1"

        // 방정식의 해 (음수가 아니어야 함)
        val x = (-q + sqrt(discriminant)) / (2 * p)
        if (x < 0) return "-1"

        // 정답은 정수로 주어지므로, 오차를 고려해 변환
        return (x + 1e-5).toInt().toString()
    }
}
