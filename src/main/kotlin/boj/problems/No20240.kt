package boj.problems

import java.io.BufferedReader
import kotlin.math.sqrt

class No20240 {
    private data class Point(val x: Int, val y: Int)

    fun solve(input: BufferedReader): String {
        val s = input.readLine().toInt()

        // a^2 + b^2 = s 를 만족하는 정수 a, b를 찾습니다.
        val limit = sqrt(s.toDouble()).toInt()

        for (a in 0..limit) {
            for (b in 0..limit) {
                if (a * a + b * b == s) {
                    return formatResult(a, b)
                }
            }
        }

        return "Impossible"
    }

    private fun formatResult(
        a: Int,
        b: Int
    ): String {
        val vertices = listOf(
            Point(0, 0),
            Point(a, b),
            Point(a - b, b + a),
            Point(-b, a)
        )

        return vertices.joinToString("\n") { "${it.x} ${it.y}" }
    }
}
